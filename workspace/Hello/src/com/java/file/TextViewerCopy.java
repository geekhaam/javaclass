package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextViewerCopy {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("D:/Java_Web_PM_Class_JB/test2.txt"));
		
		PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("D:/Java_Web_PM_Class_JB/test3.txt")));
																			//true 생략
		
		String s = null;
		int i = 1;
		while((s=br.readLine()) != null) {
			System.out.println(i + "열 복사중");
			pw.println(s);
			i++;
		} br.close(); pw.close();

	}

}
