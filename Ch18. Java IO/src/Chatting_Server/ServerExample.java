package Chatting_Server;

import java.net.ServerSocket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import javafx.application.Application;
import javafx.stage.Stage;

public class ServerExample extends Application {

	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();
	
	void startServer(){} //서버 시작 코드
	void stopServer(){} //서버 종료 코드
	
	class Client{} //데이터 통신 코드
	
	//UI 생성 코드
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

	}

}
