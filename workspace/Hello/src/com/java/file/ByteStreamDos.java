package com.java.file;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDos {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/Java_Web_PM_Class_JB/cc.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		//�⺻ �ڷ����� ��Ʈ������ ����ϱ� ���� ��ü ����
		//DataOutputStream�� ����̷� �ڷ��� ����(int, long, char, ...)�� ó���� ���
		
		dos.writeInt(10); //���� ���� readInt()
		dos.writeBoolean(false);
		dos.writeShort(Short.MAX_VALUE); //32767
		dos.writeLong(Long.MIN_VALUE);
		dos.writeUTF("�氡�氡"); //���ڿ� readUTF()
		
		dos.close();
		fos.close();
		//(����) ����  cc.txt�� �޸������� ���� �� ������ �ʴ´�.
		//�̰� ������ wirteInt()�� readInt�� ������ �� �� �ִ�.
	}

}