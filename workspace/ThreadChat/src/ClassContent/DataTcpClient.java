package ClassContent;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class DataTcpClient {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 7771);
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		
		System.out.println(dis.readUTF() + "\n�� ������ ����");
		System.out.println(dis.readUTF() + "\n�׷� �׷��� ����");
		dis.close(); s.close();
		System.out.println("��ȭ ������");

	}

}
