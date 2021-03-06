package com.java.file;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDos {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/Java_Web_PM_Class_JB/cc.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		//기본 자료형을 스트림으로 출력하기 위한 객체 생성
		//DataOutputStream은 도우미로 자료형 단위(int, long, char, ...)로 처리시 사용
		
		dos.writeInt(10); //읽을 때는 readInt()
		dos.writeBoolean(false);
		dos.writeShort(Short.MAX_VALUE); //32767
		dos.writeLong(Long.MIN_VALUE);
		dos.writeUTF("방가방가"); //문자열 readUTF()
		
		dos.close();
		fos.close();
		//(참고) 만일  cc.txt를 메모장으로 열면 잘 보이지 않는다.
		//이걸 보려면 wirteInt()는 readInt로 꺼내면 볼 수 있다.
	}

}
