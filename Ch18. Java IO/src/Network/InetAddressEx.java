package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {

		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 IP 주소: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr){
				System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
