package com.java.file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDis {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:/Java_Web_PM_Class_JB/cc.txt");
		DataInputStream dis = new DataInputStream(fis);
		//기본 자료형을 스트림으로 출력하기 위한 객체 생성
		//DataOutputStream은 도우미로 자료형 단위(int, long, char, ...)로 처리시 사용
		
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readShort());
		System.out.println(dis.readLong());
		System.out.println(dis.readUTF());
		
		dis.close();
		fis.close();
		//(참고) 만일  cc.txt를 메모장으로 열면 잘 보이지 않는다.
		//이걸 보려면 wirteInt()는 readInt로 꺼내면 볼 수 있다.
	}

}
