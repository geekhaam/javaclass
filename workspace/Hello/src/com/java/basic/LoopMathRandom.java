package com.java.basic;

import java.util.Scanner;

public class LoopMathRandom {

	public static void main(String[] args) {
		
		// 0~1	0.000001 ~ 0.999999
		// 45* -> 0.000001 ~ 44.xxxxx
		// 1 ~ 45
	
		System.out.print((int)Math.ceil(45*Math.random())+"\t");
		System.out.print((int)Math.ceil(45*Math.random())+"\t");
		System.out.print((int)Math.ceil(45*Math.random())+"\t");
		System.out.print((int)Math.ceil(45*Math.random())+"\t");
		System.out.print((int)Math.ceil(45*Math.random())+"\t");
		System.out.print((int)Math.ceil(45*Math.random()));
		
		
		//for �ݸ�
		
		for(int i=0; i<=5; i++) {
			System.out.print((int)Math.ceil(45*Math.random())+"\t");
			if (i==5) {
				System.out.print((int)Math.ceil(45*Math.random()));
			}
		}
		
		for (int i=1; i<=25; i++) {
			System.out.println("�պ��޸���");
			System.out.println(i);
		} 
		
		
		//Q) 1���� 100������ ������ 3�� ����� ���� ��� ����Ͻÿ�
		for(int i=1; i<=100; i++) {
			if (i%3==0)
				System.out.println(i);
		}
		
		//Q) 1~100 ������ �� �� 3�� ����� ��� ����ϰ� �̾ 3�� ��� ���� ������ ���Ͽ� ����Ͻÿ�
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if (i%3==0)
				sum += i;
				System.out.println(i);
		}	System.out.println(sum);
		
		//Q) for���� ����Ͽ� ����Ͻÿ� (�г� 1~3, �� 1,2)
		for(int i=1; i<4; i++) {
			for(int j=1; j<3; j++) {
				System.out.println(i+"\t-\t"+j);
			}
		}
		/* Q) Starwars
		 *      *****
		 *      *****
		 *      *****
		 */
		String str = "Starwars";
		String star = "";
		for(int i=0; i<3; i++) {
			for(int j=0; j<str.length(); j++) {
				if(j==0 || j==1 || j==str.length()-1) {
					star += " ";
				} else {
					star += "*";
				}
			} star += "\n";
		}
		System.out.println(str+"\n"+star);
		
		/*Q)
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		/*Q)
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for(int i=5; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		/*Q)
		 *    *
		 *   **
		 *  ***
		 * ****
		 ******
		 */
		for(int i=1; i<=5; i++) {
			for(int j=5-i; j>=1; j--) {
				System.out.print(" ");				
			} for(int k=1; k<=i; k++) {
				System.out.print("*");
			} System.out.println();
		}
		
		/*
		 * Q) ���̾Ƹ��
		 */
		for(int i=1; i<=4; i++) {
			for(int j=4-i; j>=1; j--) {
				System.out.print(" ");
			} for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			} System.out.println();
		} for(int m=3; m>=1; m--) {
			for(int n=3; n>=m; n--) {
				System.out.print(" ");
			} for(int o=1; o<=2*m-1; o++) {
				System.out.print("*");
			} System.out.println();
		}
		
		
		//While �ݺ���
		while(true) {
			break;
		}
		
		/* Break : Q) Ŀ�Ǹ� 10�ܱ����� �Ȱ�, 10�� ���Ŀ��� ��� �� ���  */
		int flag = 0;
		int count = 0;
		while(flag == 0) { //flag���(���� ����)
			if(count == 10) {
				System.out.println("��� ��");
				break;
			} count ++;
			System.out.println("Ŀ�� �� �� " + count);
		}
		
		/* Continue : Q) ���� ��ȯ */
		int flag2 = 0;
		int count2 = 0;
		while(flag2 == 0) { //flag���(���� ����)
			count2 ++;
			if(count2 == 3) {
				System.out.println("��ȯ");
				continue;
			} if(count2 == 10) {
				System.out.println("��� ��");
				break;
			}
			System.out.println("Ŀ�� �� �� " + count2);
		}
		
		//Do-while �ݺ���
		int a = 10;
		do {
			System.out.println("���");
		} while(a>100);
	
		/*Q) 1.¥�� 2.«�� �޴��� ������ 1,2�� �� �ϳ��� ������ "���ְ� �弼��"��
		 * ����ϰ� 3,4,5,...�� ������ ��� �޴��� �ٽó����� ���α׷��� �ۼ��Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		String menu = "";
		do {
			System.out.print("1.¥��\n2.«��\n�޴��� �������ּ��� : ");
			menu = sc.next();
		} while(!menu.equals("1") && !menu.equals("2"));
		System.out.println("���ְ� �弼��");
		
	}

}
