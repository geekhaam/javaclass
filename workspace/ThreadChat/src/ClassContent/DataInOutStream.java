package ClassContent;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *	DataInputStream		/	DataOutputStream
 *	(1)	readUTF()		/	writeUTF()			=> 문자열을 2진 처리(Byte처리)
 *	(2) 별도의 프로그램으로 비정형 데이터 등의 파일 처리 가능 
 */
public class DataInOutStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		//int, char형 등의 기본 자료형을 Byte 스트림으로 입출력 가능
		
		dos.writeInt(30); //파일에서 4바이트를 확보하여 10진수 35를 파일에 2진으로 입력한다.
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeByte(Byte.MIN_VALUE);
		dos.writeChar('학');
		dos.writeBoolean(false);
		dos.writeUTF("String");
		
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("D:/data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
		
		dis.close();
		fis.close();
	}

}