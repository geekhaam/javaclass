package TransferFile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDataFile {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(34215);
		
		while(true) {
			Socket s = ss.accept();
			System.out.println(s.getInetAddress() + "���� ����");
			
			File file = new File("D:/aa.jpg");
			DataInputStream dis = new DataInputStream(new FileInputStream(file));
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			
			byte[] byteArr = new byte[(int)file.length()];
			dis.readFully(byteArr);
			
			//���̸� ���� ������ ��, �����͸� �����Ѵ�.
			dos.writeInt(byteArr.length);
			dos.write(byteArr);
			System.out.println("���� �Ϸ�");
		}
		
	}

}
