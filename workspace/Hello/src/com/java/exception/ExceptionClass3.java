package com.java.exception;
import java.util.Scanner;

public class ExceptionClass3 {
	
	private static int division(int num1, int num2) throws ArithmeticException {
			return num1 / num2;
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("ù��° �� : ");
			String one = sc.nextLine();
			
			int num1 = Integer.parseInt(one);
			
			System.out.print("�ι�° �� : ");
			String two = sc.nextLine();
			int num2 = Integer.parseInt(two);
			
			int result = division(num1, num2);
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("���⼭ ���� ó��");
		}
			
	}

}
