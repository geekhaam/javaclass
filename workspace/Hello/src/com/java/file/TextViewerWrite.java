package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TextViewerWrite {

	public static void main(String[] args) throws IOException {
		//2. Writer
		//Scanner 대신 file 형식 사용 : 키보드 입력
		/*InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(is);*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//일반적으로 출력할 때, 아래 세 개의 객체를 모두 사용한다.
		/*FileWriter fw = new FileWriter("D:/Java_Web_PM_Class_JB/test.txt", true); //true => append
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw, true); /println() */
		
		PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("D:/Java_Web_PM_Class_JB/test.txt", true)));
			//println() 사용 가능
		/* PrintWirter에서 true는 생략 가능하며, true가 있으면 autoflush 기능이 있음을 의미한다.
		flush : 출력 버퍼에 모여있는 내용을 스트림으로 보내는 것
		PrintWriter는 있으나 Reader는 없다. */
				
		String s = null;
		while((s=br.readLine()) != null) {
			System.out.println("복사중");
			pw.println(s);
		} br.close(); pw.close(); //fw.close(); //fr.close();
		

	}

}
