package com.java.basic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/* Q) 값을 입력받아 1이면 종로로 가고, 2이면 강남으로 가자는 문장을
		 * 출력하는 프로그램을 작성하시오 (둘 다 아니면 바다로 간다.)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력하세요 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1 : //문자열 O  정수 O  실수 X
				System.out.println("종로");
				break; //break가 반드시 있어야 한다.
		case 2 :
				System.out.println("강남");
				break;
		default :
				System.out.println("바다");
				//break;
		}
		
		/* Q) 월을 입력 받아 해당 월의 날짜수를 출력하시오. */
		
		System.out.print("월을 입력해주세요 : ");
		int month = Integer.parseInt(sc.next());

		switch (month) {
		case 1 : case 3: case 5: case 7:
		case 8 : case 10 : case 12 :
			System.out.println("31일"); break;
		case 2 :
			System.out.println("28일"); break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30일"); break;
		default :
			System.out.println("1~12만 넣어주세요.");
		
		}
		
	}

}
