package com.java.file;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamArray {
	//byte[] 단위로 처리
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("D:/Java_Web_PM_Class_JB/aa.txt");
		
		int cnt;
		while((cnt = f.available()) > 0) {
			//읽어들일 수 있는 byte가 0보다 크면
			byte[] b = new byte[cnt];
			int temp = f.read(b);
			//System.out.println(temp);
			
			//read(byte[]) --> 입력 스트림에서 byte 배열 크기 만큼 읽어 byte 배열에 저장하고
			//read한 바이트 수를 temp에 넣는다.
			//read()라면 1byte씩 읽어 int에 넣는다.
			
			if(temp == -1) {
				break;
			}
			String str = new String(b); //byte[] => Conversion to String
			System.out.println(str);
			System.out.println("출력");
		} f.close();
		
		
	}

}
