package TransferFile;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * file copy
 * file --> byte 배열 --> file
 */
public class TranferCopyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("D:/aa.jpg");
		//FileInputStream fis = new FileInputStream(file);
		//DataInputStream dis = new DataInputStream(fis);
		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		
		byte[] byteArr = new byte[(int)file.length()]; //file의 길이 만큼의 byte 배열 생성
		
		System.out.println("File --> byte");
		dis.readFully(byteArr); //byteArr 만큼 파일에서 읽어냄
		dis.close();
		
		System.out.println("byte --> File");
		FileOutputStream fos = new FileOutputStream("D:/bb.jpg");
		fos.write(byteArr);
		fos.close();
		System.out.println("END");
	}

}
