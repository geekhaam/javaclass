package ClassContent;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DataTcpServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7771);
		System.out.println("��ȭ�� �غ�");
		while(true) {
			System.out.println("��ȭ  �����");
			Socket s = ss.accept();
			System.out.println(s.getInetAddress()+"�κ��� ��ȭ ����");
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("��� ����?");
			dos.writeUTF("�� �� ������");
			dos.flush();
			System.out.println("��");
			dos.close(); s.close();
		}
	}

}
