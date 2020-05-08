package com.java.arrayandtype;

import java.util.Scanner;

public class TwoDimensionalArray {
	// 2차원 배열
	public static void main(String[] args) {
		
		int[][] k = new int[2][3]; //2차원 배열
		
		k[0][0] = 50;
		k[1][2] = 100;
		//[행][열]
		
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
		 * 성별, 나이를 입력 받는다
		 * 
		 * output design
		 * 	 10대  20대  30대  계
		 * 남  10  20  15  45
		 * 여  29  23  30  82
		 * 계  39  43  45  127
		 */
		
		/*int[][] ages = {
				{10, 20, 15},
				{29, 23, 30},
				{39, 43, 45}
				};
		
		System.out.println("\t10대\t20대\t30대\t계");
		for(int i=0; i<ages.length; i++) {
			int sum = 0;
			if(i==0) {
				System.out.print("남\t");
			} else if(i==1) {
				System.out.print("여\t");
			} else {
				System.out.print("계\t");
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
			System.out.print("성별을 입력해주세요(남=0/여=1) : ");
			int gender = Integer.parseInt(sc.next());
			System.out.print("나이를 입력해주세요 : ");
			int age = Integer.parseInt(sc.next());
			count++;
			System.out.println(count + "명 입력하였습니다.");
			
			if(gender == 0) {
				if(age>=10 && age<20) {
					agess[0][0] += 1;
				} else if(age>=20 && age<30) {
					agess[0][1] += 1;
				} else if(age>=30 && age<40) {
					agess[0][2] += 1;
				} else {
					System.out.println("40대 이상은 통계하지 않습니다.");
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
					System.out.println("40대 이상은 통계하지 않습니다.");
					count--;
				}
			}
		}
		
		System.out.println("\t10대\t20대\t30대\t계");
		int total = 0;
		for(int i=0; i<agess.length; i++) {
			int sum = 0;
			if(i==0) {
				System.out.print("남\t");
			} else if(i==1) {
				System.out.print("여\t");
			} for(int j=0; j<agess[i].length; j++) {
				System.out.print(agess[i][j]+"\t");
				sum += agess[i][j];
			} total += sum; System.out.println(sum);
		} System.out.print("계\t");
		System.out.print(agess[0][0]+agess[1][0]+"\t");
		System.out.print(agess[0][1]+agess[1][1]+"\t");
		System.out.print(agess[0][2]+agess[1][2]+"\t");
		System.out.print(total);
		
	}
	
}
