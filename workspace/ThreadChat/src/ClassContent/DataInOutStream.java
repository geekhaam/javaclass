package ClassContent;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *	DataInputStream		/	DataOutputStream
 *	(1)	readUTF()		/	writeUTF()			=> ���ڿ��� 2�� ó��(Byteó��)
 *	(2) ������ ���α׷����� ������ ������ ���� ���� ó�� ���� 
 */
public class DataInOutStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		//int, char�� ���� �⺻ �ڷ����� Byte ��Ʈ������ ����� ����
		
		dos.writeInt(30); //���Ͽ��� 4����Ʈ�� Ȯ���Ͽ� 10���� 35�� ���Ͽ� 2������ �Է��Ѵ�.
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeByte(Byte.MIN_VALUE);
		dos.writeChar('��');
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