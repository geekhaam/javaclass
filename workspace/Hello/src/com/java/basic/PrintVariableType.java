package com.java.basic;

import java.util.Scanner;

public class PrintVariableType {
			//ȭ�� ��°� ���� Ÿ��
	public static void main(String[] args) {
		System.out.println("�ȳ�~~~~~�ڹ�"); //ȭ�� ���
		System.out.printf("%s","������\n");
		System.out.printf("%s\n","������");
		System.out.printf("%s%n","������");
		System.out.println("�ȳ�~~~~~�ڹ�2"); //ȭ�� ���
		
		
		/* ���â�� = ���� */
		/* �ڷ��� ������ */
/*		 1) ���� : ����, �Ǽ�, ���ڿ�, ...
		 2) ���� : 2Byte, 4Byte, 8Byte */
		int soo1 = 2147483647; //����, 4Byte
		// 2Byte : -32768 ~ +32767
		// 4Byte : -2147483648 ~ + 2147483647
		int salary = 30000;
		
		int soo2 = 2147483647;
		int soo3 = 1;
		int soo5 = soo2 + soo3;
		System.out.println(soo5); //-2147483648
		
		
		/* Q) �޿����� �����Դ� ���������� �������� 17%��� �Ѵ�.
		 * ���������� �����԰� 78�� �� �޿����� �����Ը� ���Ͻÿ�. */
		int earth = 78;
		double moon = earth*0.17;
		System.out.printf("�޿����� �����Դ� %.2f\n", moon);
		System.out.println("�޿����� �����Դ� "+Math.round(moon*100)/100.0);
		System.out.println("�޿����� �����Դ� "+String.format("%.2f", moon));
		//�Ҽ��� ������ Math.round()�� �̿��ϰų� String.format()�� �̿��Ѵ�.
		
		
		char ch1 = 'A'; //���ڻ�� / 2byte / 0~65535
		char ch2 = '��';
		System.out.println(ch1);
		System.out.printf("%d\n", (int)ch1); //65 (ASCII)
								 //����ȯ, cast
		
		System.out.println(ch2);
		System.out.printf("%d\n", (int)ch2); //44053
		
		//�ڷ����� ũ�⸦ ���ϴ� ��
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
						//wrapper, int -> Ŭ������
		
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
		
		
		/*Q) i�ذ� �������� ��������� ����Ͻÿ�.*/
		System.out.println(2020%4==0 && 2020%100!=0 || 2020%400==0);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int i = in.nextInt();
		if (i%400 == 0) {
			System.out.println("�����Դϴ�.");
		} else if (i%100 == 0) {
			System.out.println("����Դϴ�.");
		} else if (i%4 == 0) {
			System.out.println("�����Դϴ�.");
		} 
		
		/*Q) 210�� 3�� ����ΰ�? */
		if (210%3 == 0) {
			System.out.println("3�� ���");
		} else {
			System.out.println("3�� ����� �ƴ�");
		}
		
	}

}
