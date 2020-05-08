package com.java.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextViewerRead {

	public static void main(String[] args) throws IOException {
		// 1. Read
		//���ڿ� ������ file read
		//FileReader fr = new FileReader("test.txt"); => Open
		FileReader fr = new FileReader("D:/Java_Web_PM_Class_JB/test.txt");
		//input, output stream�� ���̸� Byte Stream
		//reader, writer�� ���̸� Character Stream
		
		BufferedReader br = new BufferedReader(fr);
		//������ ������ BufferedReader�� ���� �� ��� (�ѹ��� �����ų� �� �� ������ ������ ������� ȿ���� �� �ӵ� UP)
		
		String s;
		//file read - ȭ�� write // Byte readInt...
		
		ArrayList<String> arr = new ArrayList<String>();
		while((s = br.readLine()) != null) { //�� ���� ��
								//�� ������ �� : eof, -1
			System.out.println(s);
			arr.add(s);
		}
		br.close();
		fr.close();
			
	}

}
