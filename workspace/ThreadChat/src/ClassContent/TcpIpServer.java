package ClassContent;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss1 = new ServerSocket(7220);
		System.out.println("전화는 준비 되어 있음");
		while(true) {
			System.out.println("전화 기다리는 중");
			Socket s1 = ss1.accept();
			System.out.println(s1.getInetAddress() + "에서 전화가 옴");
			BufferedWriter bw1 = new BufferedWriter
					(new OutputStreamWriter(s1.getOutputStream()));
			
			bw1.write("어떻게 지내?");
			bw1.newLine(); bw1.flush();
			System.out.println("전화 끊어짐");
			bw1.close(); s1.close();
		}

	}

}
