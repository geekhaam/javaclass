package com.java.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	//File Copy ��, Byte ������, args[]�� ���
	public static void main(String[] args) throws IOException {
		
		//FileInputStream, FileOutputStream
		//read() : 1Byte ����
		//read(array) : �迭 ����
		//write() �� ��������
		
		int temp = 0; //'A' => ���� ���(���� A�̸鼭 ���ÿ� �ƽ�Ű �ڵ� 65)
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		if(args.length >= 2) { //���� ����, �纻 ���� 2��
			fis = new FileInputStream(args[0]); //open
			fos = new FileOutputStream(args[1], false); //open
			
			while((temp=fis.read()) != -1) {
				//��ȣ ���� ��������� �� byte ������ ó��
				fos.write(temp);
				System.out.println(temp + "������");
			}
			fis.close(); fos.close();
			
		}
		
	}

}