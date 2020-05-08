package com.java.method;

import java.util.Scanner;

public class Method {
	//1형식 method();
	//2형식 method(parameter);
	//3형식 method(parameter) = return
	public static String isLeapYear(int i) {
		
		if(i%400 == 0 || i%4 == 0 && i%100 != 0) {
			return "윤년";
		} else {
			return "평년";
		}
	}
	
	public static String bmi(int weight, int height) {
		
		double meterHeight = height / 100.0;
		double bmi = weight/(meterHeight*meterHeight);
		if (bmi >= 30) {
			return "비만";
		} else if (bmi >= 25) {
			return "과체중";
		} else if (bmi >= 20) {
			return "보통";
		} else {
			return "저체중";
		}
	}
	
	public static void main(String[] args) {
		
		/* Q)메소드를 사용하지 않고 i에 년도를 입력 받아 유년인지 평년인지 알아내시오*/
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("날짜를 입력하세요 : ");
		int i = Integer.parseInt(sc.next());
		if(i%400 == 0 || i%4 == 0 && i%100 != 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
		/* Q) 메소드를 사용하여 윤년인지 알아내시오. */
		System.out.println(isLeapYear(i));
		
		/* Q) BMI를 구해 비만도를 확인하는 메소드 */
		System.out.print("몸무게를 입력해주세요 : ");
		int weight = Integer.parseInt(sc.next());
		System.out.print("키를 입력해주세요 : ");
		int height = Integer.parseInt(sc.next());
		System.out.println(bmi(weight, height));
	}

}
