package ClassContent;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DataTcpServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7771);
		System.out.println("전화기 준비");
		while(true) {
			System.out.println("전화  대기중");
			Socket s = ss.accept();
			System.out.println(s.getInetAddress()+"로부터 전화 수신");
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("어떻게 지내?");
			dos.writeUTF("한 번 만나자");
			dos.flush();
			System.out.println("뚝");
			dos.close(); s.close();
		}
	}

}
