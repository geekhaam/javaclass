package EchoProgram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss1 = new ServerSocket(7114); //listen
		
		Socket s1 = ss1.accept();
		
		InputStream is1 = s1.getInputStream(); //���Ͽ��� �Է½�Ʈ�� ���
		OutputStream os1 = s1.getOutputStream(); //���Ͽ��� ��½�Ʈ�� ���
		
		int b1; //byte stream�� ó��
		while(true) {
			b1 = is1.read(); //���ڿ� �б� Client --> Server (�� ���ھ� �Է� ����)
			if(b1 == -1) {
				break;
			}
			os1.write(b1); //���ڿ� ��� Server --> Client
		}
		
	}
	//������ Server ���� �� �� Client ����
}
