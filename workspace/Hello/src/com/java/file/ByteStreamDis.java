package com.java.file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDis {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:/Java_Web_PM_Class_JB/cc.txt");
		DataInputStream dis = new DataInputStream(fis);
		//�⺻ �ڷ����� ��Ʈ������ ����ϱ� ���� ��ü ����
		//DataOutputStream�� ����̷� �ڷ��� ����(int, long, char, ...)�� ó���� ���
		
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readShort());
		System.out.println(dis.readLong());
		System.out.println(dis.readUTF());
		
		dis.close();
		fis.close();
		//(����) ����  cc.txt�� �޸������� ���� �� ������ �ʴ´�.
		//�̰� ������ wirteInt()�� readInt�� ������ �� �� �ִ�.
	}

}