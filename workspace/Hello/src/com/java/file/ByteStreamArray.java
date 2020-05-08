package com.java.file;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamArray {
	//byte[] ������ ó��
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("D:/Java_Web_PM_Class_JB/aa.txt");
		
		int cnt;
		while((cnt = f.available()) > 0) {
			//�о���� �� �ִ� byte�� 0���� ũ��
			byte[] b = new byte[cnt];
			int temp = f.read(b);
			//System.out.println(temp);
			
			//read(byte[]) --> �Է� ��Ʈ������ byte �迭 ũ�� ��ŭ �о� byte �迭�� �����ϰ�
			//read�� ����Ʈ ���� temp�� �ִ´�.
			//read()��� 1byte�� �о� int�� �ִ´�.
			
			if(temp == -1) {
				break;
			}
			String str = new String(b); //byte[] => Conversion to String
			System.out.println(str);
			System.out.println("���");
		} f.close();
		
		
	}

}