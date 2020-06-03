package TransferFile;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * file copy
 * file --> byte �迭 --> file
 */
public class TranferCopyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("D:/aa.jpg");
		//FileInputStream fis = new FileInputStream(file);
		//DataInputStream dis = new DataInputStream(fis);
		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		
		byte[] byteArr = new byte[(int)file.length()]; //file�� ���� ��ŭ�� byte �迭 ����
		
		System.out.println("File --> byte");
		dis.readFully(byteArr); //byteArr ��ŭ ���Ͽ��� �о
		dis.close();
		
		System.out.println("byte --> File");
		FileOutputStream fos = new FileOutputStream("D:/bb.jpg");
		fos.write(byteArr);
		fos.close();
		System.out.println("END");
	}

}
