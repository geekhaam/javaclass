package EchoProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClaEchoClient {

	public static void main(String[] args)
				throws UnknownHostException, IOException {
		
		if(args.length != 2) {
			System.out.println("명령행인자로 IP주소와 포트번호를 입력하시오");
			System.exit(0);
		}
		
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket(args[0], Integer.parseInt(args[1]));
		
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
			bw1.newLine();
			bw1.flush();
			String outputFromServer = br1.readLine();
			System.out.println("서버로 부터 다시 받음 : " + outputFromServer);
		}
		s.close();
	}

}
