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
			System.out.println("��������ڷ� IP�ּҿ� ��Ʈ��ȣ�� �Է��Ͻÿ�");
			System.exit(0);
		}
		
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket(args[0], Integer.parseInt(args[1]));
		
		BufferedReader br1 = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
		
		BufferedWriter bw1 = new BufferedWriter(
				new OutputStreamWriter(s.getOutputStream()));
		
		while(true) {
			System.out.print("�Է� : ");
			String inputToServer = sc.nextLine();
			if(inputToServer.length() == 0) {
				break;
			}
			bw1.write(inputToServer, 0, inputToServer.length());
			bw1.newLine();
			bw1.flush();
			String outputFromServer = br1.readLine();
			System.out.println("������ ���� �ٽ� ���� : " + outputFromServer);
		}
		s.close();
	}

}
