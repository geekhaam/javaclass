package EchoProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args)
				throws UnknownHostException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		Socket s = new Socket("127.0.0.1", 7114); //connect
		
		BufferedReader br1 = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
		
		BufferedWriter bw1 = new BufferedWriter(
				new OutputStreamWriter(s.getOutputStream()));
		
		while(true) {
			System.out.print("입력 : ");
			String inputToServer = sc.nextLine();
			if(inputToServer.length() == 0) {
				break;
			}
			bw1.write(inputToServer, 0, inputToServer.length());
			//server로 보냄, 입력 받은 것을 0번부터 모든 길이만큼 전부 전송
			bw1.newLine(); //줄바꿈도 보냄
			bw1.flush(); //무조건 전송 후, buffer 비움
			String outputFromServer = br1.readLine();
			System.out.println("서버로 부터 다시 받음 : " + outputFromServer);
		}
		s.close();
	}

}
