package com.java.basic;

import java.util.Date;

//import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		Date d1 = new Date();
		/* ctrl + shift + o => 필요한 라이브러리 찾기 */
		
		System.out.println(d1);
		System.out.println(d1.toLocaleString()); //toLocaleString() - 이제는 쓰지 않는 메소드
		
		//ctrl + shift + l : shortcut 목록 확인
		//주석 (shortcut : ctrl + /
		/* 여러줄 주석 처리 (shortcut : ctrl + shift + /) */
		// 주석 풀기(shotrcut : ctrl + shift + \)
	}
}
