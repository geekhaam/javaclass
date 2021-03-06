package com.java.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	//File Copy 단, Byte 단위로, args[]를 사용
	public static void main(String[] args) throws IOException {
		
		//FileInputStream, FileOutputStream
		//read() : 1Byte 단위
		//read(array) : 배열 단위
		//write() 도 마찬가지
		
		int temp = 0; //'A' => 문자 상수(문자 A이면서 동시에 아스키 코드 65)
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		if(args.length >= 2) { //원본 파일, 사본 파일 2개
			fis = new FileInputStream(args[0]); //open
			fos = new FileOutputStream(args[1], false); //open
			
			while((temp=fis.read()) != -1) {
				//괄호 안이 비어있으면 한 byte 단위로 처리
				fos.write(temp);
				System.out.println(temp + "복사중");
			}
			fis.close(); fos.close();
			
		}
		
	}

}
