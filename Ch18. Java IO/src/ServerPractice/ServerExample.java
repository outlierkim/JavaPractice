package ServerPractice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {

	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();
	
	void startServer(){// 서버시작 코드
		
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch (Exception e) {
			if(!serverSocket.isClosed()){
				stopServer();
				
			} return;
		}
		
		Runnable runnable =new Runnable(){

			@Override
			public void run() {
				Platform.runLater(()->{
					displayText("[서버 시작]");
					btnStartStop.setText("stop");
				});
				
				while(true){
					try {
						Socket socket = serverSocket.accept();
						String message = "[연결 수락: " + socket.getRemoteSocketAddress() +
								": " + Thread.currentThread().getName() + "]";
						Platform.runLater(()->displayText(message));
						
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater(()->displayText("[연결 개수: " + connections.size()+"]"));
					} catch (Exception e) {
						if(!serverSocket.isClosed()){
							stopServer();
						} break;
					}
				}
				
			}
			
		};
		executorService.submit(runnable);
	
	}
	
	void stopServer(){ // 서버 종료 코드
		
	}
	
	class Client{ //데이터 통신 코드
		Socket socket;
		
		Client(Socket socket){ //생성자
			this.socket = socket;
			receive();
		}
		
		void receive(){ //데이터 받기 코드
			Runnable runnable = new Runnable(){ //받기 작업 생성

				@Override
				public void run() {
					try {
						while(true){
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();
							
							//클라이언트가 비정상 종료를 했을 경우 IOException 발생
							int readByteCount = inputStream.read(byteArr); //데이타 받기 꼭 int로 받아야? 
							
							//클라이언트가 정상적으로 Socket의 close()를 호출했을 경우
							if(readByteCount == -1){ throw new IOException();
								
							}
							String message = "[요청 처리: " + socket.getRemoteSocketAddress() +
									": " + Thread.currentThread().getName() + "]";
							Platform.runLater(()->displayText(message));
							
							String data = new String(byteArr, 0, readByteCount, "UTF-8");//문자열로 변환
							for(Client client : connections){ //모든 클라이언트에게 보냄
								client.send(data);
							}
							
						}
				
					} catch (Exception e) {
						try {
							connections.remove(Client.this);
							String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() +
									": " + Thread.currentThread().getName() + "]";
							Platform.runLater(()->displayText(message));
							socket.close();
						} catch (IOException e2) {
							
						}
					}
						
				}
			};
			executorService.submit(runnable); //스레드풀에서 처리
		}
		
		void send(String data){ //데이터 전송 코드
			Runnable runnable = new Runnable(){

				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();// 클라이언트로 내보내기
						outputStream.write(byteArr);
						outputStream.flush();
				
					} catch (Exception e) {
						try {
							String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() +
									": " + Thread.currentThread().getName() + "]";
							Platform.runLater(()->displayText(message));
							connections.remove(Client.this);
							socket.close();
						} catch (IOException e2) {
						
						}
						
					}
				}
				
			};
			executorService.submit(runnable); //스레드 풀에서 처리
		}
	}
	
	
	//UI 생성코드
	TextArea txtDisplay;
	Button btnStartStop;
	
	@Override
	public void start(Stage stage) throws Exception {

		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);
		
		btnStartStop = new Button("Start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		btnStartStop.setOnAction(e->{
			if(btnStartStop.getText().equals("Start")){
				startServer();
			} else if(btnStartStop.getText().equals("stop")){
				stopServer();
			}
		});
		root.setBottom(btnStartStop);
		
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("app.css").toString());
		stage.setScene(scene);
		stage.setTitle("Server");
		stage.setOnCloseRequest(event->stopServer());
		stage.show();
	}
	
	void displayText(String text){
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
