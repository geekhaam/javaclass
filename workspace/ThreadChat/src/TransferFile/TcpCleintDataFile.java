package TransferFile;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpCleintDataFile {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s = new Socket("127.0.0.1", 34215);
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		byte[] byteArr = new byte[dis.readInt()];
		dis.readFully(byteArr);
		
		FileOutputStream fos = new FileOutputStream("D:/bbb.jpg");
		fos.write(byteArr);
		
		System.out.println("저장 완료");

	}

}
