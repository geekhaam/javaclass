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
		
		
		//for 반목문
		
		for(int i=0; i<=5; i++) {
			System.out.print((int)Math.ceil(45*Math.random())+"\t");
			if (i==5) {
				System.out.print((int)Math.ceil(45*Math.random()));
			}
		}
		
		for (int i=1; i<=25; i++) {
			System.out.println("왕복달리기");
			System.out.println(i);
		} 
		
		
		//Q) 1부터 100까지의 수에서 3의 배수의 수를 모두 출력하시오
		for(int i=1; i<=100; i++) {
			if (i%3==0)
				System.out.println(i);
		}
		
		//Q) 1~100 사이의 수 중 3의 배수만 골라 출력하고 이어서 3의 배수 수의 총합을 구하여 출력하시오
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if (i%3==0)
				sum += i;
				System.out.println(i);
		}	System.out.println(sum);
		
		//Q) for문을 사용하여 출력하시오 (학년 1~3, 반 1,2)
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
		 * Q) 다이아몬드
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
		
		
		//While 반복문
		while(true) {
			break;
		}
		
		/* Break : Q) 커피를 10잔까지만 팔고, 10잔 이후에는 장사 끝 출력  */
		int flag = 0;
		int count = 0;
		while(flag == 0) { //flag기법(무한 루프)
			if(count == 10) {
				System.out.println("장사 끝");
				break;
			} count ++;
			System.out.println("커피 한 잔 " + count);
		}
		
		/* Continue : Q) 도중 반환 */
		int flag2 = 0;
		int count2 = 0;
		while(flag2 == 0) { //flag기법(무한 루프)
			count2 ++;
			if(count2 == 3) {
				System.out.println("반환");
				continue;
			} if(count2 == 10) {
				System.out.println("장사 끝");
				break;
			}
			System.out.println("커피 한 잔 " + count2);
		}
		
		//Do-while 반복문
		int a = 10;
		do {
			System.out.println("출력");
		} while(a>100);
	
		/*Q) 1.짜장 2.짬뽕 메뉴가 보인후 1,2번 중 하나를 누르면 "맛있게 드세요"를
		 * 출력하고 3,4,5,...을 누르면 계속 메뉴가 다시나오는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		
		String menu = "";
		do {
			System.out.print("1.짜장\n2.짬뽕\n메뉴를 선택해주세요 : ");
			menu = sc.next();
		} while(!menu.equals("1") && !menu.equals("2"));
		System.out.println("맛있게 드세요");
		
	}

}
