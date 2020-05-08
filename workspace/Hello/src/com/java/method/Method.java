package com.java.method;

import java.util.Scanner;

public class Method {
	//1���� method();
	//2���� method(parameter);
	//3���� method(parameter) = return
	public static String isLeapYear(int i) {
		
		if(i%400 == 0 || i%4 == 0 && i%100 != 0) {
			return "����";
		} else {
			return "���";
		}
	}
	
	public static String bmi(int weight, int height) {
		
		double meterHeight = height / 100.0;
		double bmi = weight/(meterHeight*meterHeight);
		if (bmi >= 30) {
			return "��";
		} else if (bmi >= 25) {
			return "��ü��";
		} else if (bmi >= 20) {
			return "����";
		} else {
			return "��ü��";
		}
	}
	
	public static void main(String[] args) {
		
		/* Q)�޼ҵ带 ������� �ʰ� i�� �⵵�� �Է� �޾� �������� ������� �˾Ƴ��ÿ�*/
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��¥�� �Է��ϼ��� : ");
		int i = Integer.parseInt(sc.next());
		if(i%400 == 0 || i%4 == 0 && i%100 != 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
		
		/* Q) �޼ҵ带 ����Ͽ� �������� �˾Ƴ��ÿ�. */
		System.out.println(isLeapYear(i));
		
		/* Q) BMI�� ���� �񸸵��� Ȯ���ϴ� �޼ҵ� */
		System.out.print("�����Ը� �Է����ּ��� : ");
		int weight = Integer.parseInt(sc.next());
		System.out.print("Ű�� �Է����ּ��� : ");
		int height = Integer.parseInt(sc.next());
		System.out.println(bmi(weight, height));
	}

}
