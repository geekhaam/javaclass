package com.java.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextViewerRead {

	public static void main(String[] args) throws IOException {
		// 1. Read
		//문자열 단위로 file read
		//FileReader fr = new FileReader("test.txt"); => Open
		FileReader fr = new FileReader("D:/Java_Web_PM_Class_JB/test.txt");
		//input, output stream이 보이면 Byte Stream
		//reader, writer가 보이면 Character Stream
		
		BufferedReader br = new BufferedReader(fr);
		//적당한 단위로 BufferedReader에 저장 후 사용 (한번에 꺼내거나 한 개 단위로 꺼내는 방법보다 효율성 및 속도 UP)
		
		String s;
		//file read - 화면 write // Byte readInt...
		
		ArrayList<String> arr = new ArrayList<String>();
		while((s = br.readLine()) != null) { //한 줄의 끝
								//한 글자의 끝 : eof, -1
			System.out.println(s);
			arr.add(s);
		}
		br.close();
		fr.close();
			
	}

}
