package com.java.basic;

import java.util.Scanner;

public class PrintVariableType {
			//화면 출력과 변수 타입
	public static void main(String[] args) {
		System.out.println("안녕~~~~~자바"); //화면 출력
		System.out.printf("%s","세젤예\n");
		System.out.printf("%s\n","세젤예");
		System.out.printf("%s%n","세젤예");
		System.out.println("안녕~~~~~자바2"); //화면 출력
		
		
		/* 기억창고 = 변수 */
		/* 자료형 변수명 */
/*		 1) 종류 : 정수, 실수, 문자열, ...
		 2) 길이 : 2Byte, 4Byte, 8Byte */
		int soo1 = 2147483647; //정수, 4Byte
		// 2Byte : -32768 ~ +32767
		// 4Byte : -2147483648 ~ + 2147483647
		int salary = 30000;
		
		int soo2 = 2147483647;
		int soo3 = 1;
		int soo5 = soo2 + soo3;
		System.out.println(soo5); //-2147483648
		
		
		/* Q) 달에서의 몸무게는 지구에서의 몸무게의 17%라고 한다.
		 * 지구에서의 몸무게가 78일 때 달에서의 몸무게를 구하시오. */
		int earth = 78;
		double moon = earth*0.17;
		System.out.printf("달에서의 몸무게는 %.2f\n", moon);
		System.out.println("달에서의 몸무게는 "+Math.round(moon*100)/100.0);
		System.out.println("달에서의 몸무게는 "+String.format("%.2f", moon));
		//소수점 절삭은 Math.round()를 이용하거나 String.format()을 이용한다.
		
		
		char ch1 = 'A'; //문자상수 / 2byte / 0~65535
		char ch2 = '강';
		System.out.println(ch1);
		System.out.printf("%d\n", (int)ch1); //65 (ASCII)
								 //형변환, cast
		
		System.out.println(ch2);
		System.out.printf("%d\n", (int)ch2); //44053
		
		//자료형의 크기를 구하는 법
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
						//wrapper, int -> 클래스형
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		//----------------------------------------
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		
		
		/*Q) i해가 윤년인지 평년인지를 출력하시오.*/
		System.out.println(2020%4==0 && 2020%100!=0 || 2020%400==0);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요.");
		int i = in.nextInt();
		if (i%400 == 0) {
			System.out.println("윤년입니다.");
		} else if (i%100 == 0) {
			System.out.println("평년입니다.");
		} else if (i%4 == 0) {
			System.out.println("윤년입니다.");
		} 
		
		/*Q) 210은 3의 배수인가? */
		if (210%3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의 배수가 아님");
		}
		
	}

}
