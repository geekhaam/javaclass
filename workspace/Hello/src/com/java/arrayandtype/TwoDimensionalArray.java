package com.java.arrayandtype;

import java.util.Scanner;

public class TwoDimensionalArray {
	// 2���� �迭
	public static void main(String[] args) {
		
		int[][] k = new int[2][3]; //2���� �迭
		
		k[0][0] = 50;
		k[1][2] = 100;
		//[��][��]
		
		System.out.println(k[0][0] + "\t" + k[1][2]);
		
		
		int[][] k2 = {
				{10, 20, 30},
				{40, 50, 60}
				}; 
		for(int i=0; i<k2.length; i++) {
			for(int j=0; j<k2[i].length; j++) {
				if(j==2) {
					System.out.print(k2[i][j]+"\n");
				} else {
					System.out.print(k2[i][j]+", ");
				}
			} 
		}
		
		
		/* input design
		 * ����, ���̸� �Է� �޴´�
		 * 
		 * output design
		 * 	 10��  20��  30��  ��
		 * ��  10  20  15  45
		 * ��  29  23  30  82
		 * ��  39  43  45  127
		 */
		
		/*int[][] ages = {
				{10, 20, 15},
				{29, 23, 30},
				{39, 43, 45}
				};
		
		System.out.println("\t10��\t20��\t30��\t��");
		for(int i=0; i<ages.length; i++) {
			int sum = 0;
			if(i==0) {
				System.out.print("��\t");
			} else if(i==1) {
				System.out.print("��\t");
			} else {
				System.out.print("��\t");
			}
			for(int j=0; j<ages[i].length; j++) {
				System.out.print(ages[i][j]+"\t");
				sum += ages[i][j];
			} System.out.println(sum);
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		int[][] agess = {
					{0, 0, 0},
					{0, 0, 0}
					};
		int count = 0;
		while(true) {
			if(count == agess.length*agess[0].length) {
				break;
			}
			System.out.print("������ �Է����ּ���(��=0/��=1) : ");
			int gender = Integer.parseInt(sc.next());
			System.out.print("���̸� �Է����ּ��� : ");
			int age = Integer.parseInt(sc.next());
			count++;
			System.out.println(count + "�� �Է��Ͽ����ϴ�.");
			
			if(gender == 0) {
				if(age>=10 && age<20) {
					agess[0][0] += 1;
				} else if(age>=20 && age<30) {
					agess[0][1] += 1;
				} else if(age>=30 && age<40) {
					agess[0][2] += 1;
				} else {
					System.out.println("40�� �̻��� ������� �ʽ��ϴ�.");
					count--;
				}
			} else {
				if(age>=10 && age<20) {
					agess[1][0] += 1;
				} else if(age>=20 && age<30) {
					agess[1][1] += 1;
				} else if(age>=30 && age<40) {
					agess[1][2] += 1;
				} else {
					System.out.println("40�� �̻��� ������� �ʽ��ϴ�.");
					count--;
				}
			}
		}
		
		System.out.println("\t10��\t20��\t30��\t��");
		int total = 0;
		for(int i=0; i<agess.length; i++) {
			int sum = 0;
			if(i==0) {
				System.out.print("��\t");
			} else if(i==1) {
				System.out.print("��\t");
			} for(int j=0; j<agess[i].length; j++) {
				System.out.print(agess[i][j]+"\t");
				sum += agess[i][j];
			} total += sum; System.out.println(sum);
		} System.out.print("��\t");
		System.out.print(agess[0][0]+agess[1][0]+"\t");
		System.out.print(agess[0][1]+agess[1][1]+"\t");
		System.out.print(agess[0][2]+agess[1][2]+"\t");
		System.out.print(total);
		
	}
	
}
