package ClassContent;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss1 = new ServerSocket(7220);
		System.out.println("��ȭ�� �غ� �Ǿ� ����");
		while(true) {
			System.out.println("��ȭ ��ٸ��� ��");
			Socket s1 = ss1.accept();
			System.out.println(s1.getInetAddress() + "���� ��ȭ�� ��");
			BufferedWriter bw1 = new BufferedWriter
					(new OutputStreamWriter(s1.getOutputStream()));
			
			bw1.write("��� ����?");
			bw1.newLine(); bw1.flush();
			System.out.println("��ȭ ������");
			bw1.close(); s1.close();
		}

	}

}
