package com.java.exception;
import java.util.Scanner;

public class ExceptionClass2 {

	private static int division(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			throw new ArithmeticException();
		} else {
			return num1 / num2;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("첫번째 수 : ");
		String one = sc.nextLine();
		
		int num1 = Integer.parseInt(one);
		
		System.out.print("두번째 수 : ");
		String two = sc.nextLine();
		int num2 = Integer.parseInt(two);
		
		int result = division(num1, num2);
		System.out.println(result);
			
	}

}
