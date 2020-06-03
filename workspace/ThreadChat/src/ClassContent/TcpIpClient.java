package ClassContent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {

	public static void main(String[] args) throws NumberFormatException, UnknownHostException, IOException {
		
		Socket s = new Socket("127.0.0.1", 7220);
		
		BufferedReader br1 = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
		
		System.out.println(br1.readLine() + "\n잘 지내지");
		br1.close(); s.close();
		System.out.println("전화 끊어짐");

	}

}
