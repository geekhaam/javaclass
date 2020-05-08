package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextViewerCopyEach {

	public static void main(String[] args) throws IOException {
		// aa.txt ���� ����� bb.txt ���� ������ ��ȣ�� �ٲ�� ���α׷��� �ۼ��Ͻÿ�
		BufferedReader br = new BufferedReader(new FileReader("D:/Java_Web_PM_Class_JB/aa.txt"));
		PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("D:/Java_Web_PM_Class_JB/temp.txt")));
			
		String s = null;
		int i = 1;
		System.out.println("aa => temp");
		while((s=br.readLine()) != null) {
			System.out.println(i + "�� ������");
			pw.println(s);
			i++;
		} br.close(); pw.close();
		
		BufferedReader br2 = new BufferedReader(new FileReader("D:/Java_Web_PM_Class_JB/bb.txt"));
		PrintWriter pw2 = new PrintWriter
				(new BufferedWriter(new FileWriter("D:/Java_Web_PM_Class_JB/aa.txt")));
		
		s = null;
		i = 1;
		System.out.println("bb => aa");
		while((s=br2.readLine()) != null) {
			System.out.println(i + "�� ������");
			pw2.println(s);
			i++;
		} br2.close(); pw2.close();
		
		BufferedReader br3 = new BufferedReader(new FileReader("D:/Java_Web_PM_Class_JB/temp.txt"));
		PrintWriter pw3 = new PrintWriter
				(new BufferedWriter(new FileWriter("D:/Java_Web_PM_Class_JB/bb.txt")));
		
		s = null;
		i = 1;
		System.out.println("temp => bb");
		while((s=br3.readLine()) != null) {
			System.out.println(i + "�� ������");
			pw3.println(s);
			i++;
		} br3.close(); pw3.close();
		
		File f = new File("D:/Java_Web_PM_Class_JB/temp.txt");
		if(f.exists()) {
			if(f.delete()) {
				System.out.println("�ӽ� ���� ����");
			} else {
				System.out.println("���� ����");
			}
		} else {
			System.out.println("�ӽ� ������ �������� ����");
		}
		
		
		
	}

}