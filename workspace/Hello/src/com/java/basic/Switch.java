package com.java.basic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/* Q) ���� �Է¹޾� 1�̸� ���η� ����, 2�̸� �������� ���ڴ� ������
		 * ����ϴ� ���α׷��� �ۼ��Ͻÿ� (�� �� �ƴϸ� �ٴٷ� ����.)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		switch (num) {
		case 1 : //���ڿ� O  ���� O  �Ǽ� X
				System.out.println("����");
				break; //break�� �ݵ�� �־�� �Ѵ�.
		case 2 :
				System.out.println("����");
				break;
		default :
				System.out.println("�ٴ�");
				//break;
		}
		
		/* Q) ���� �Է� �޾� �ش� ���� ��¥���� ����Ͻÿ�. */
		
		System.out.print("���� �Է����ּ��� : ");
		int month = Integer.parseInt(sc.next());

		switch (month) {
		case 1 : case 3: case 5: case 7:
		case 8 : case 10 : case 12 :
			System.out.println("31��"); break;
		case 2 :
			System.out.println("28��"); break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30��"); break;
		default :
			System.out.println("1~12�� �־��ּ���.");
		
		}
		
	}

}
