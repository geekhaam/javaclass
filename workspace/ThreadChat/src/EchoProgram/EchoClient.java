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
			System.out.print("�Է� : ");
			String inputToServer = sc.nextLine();
			if(inputToServer.length() == 0) {
				break;
			}
			bw1.write(inputToServer, 0, inputToServer.length());
			//server�� ����, �Է� ���� ���� 0������ ��� ���̸�ŭ ���� ����
			bw1.newLine(); //�ٹٲ޵� ����
			bw1.flush(); //������ ���� ��, buffer ���
			String outputFromServer = br1.readLine();
			System.out.println("������ ���� �ٽ� ���� : " + outputFromServer);
		}
		s.close();
	}

}
