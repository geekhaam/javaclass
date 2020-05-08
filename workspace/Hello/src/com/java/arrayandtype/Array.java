package com.java.arrayandtype;

import java.util.Arrays;

public class Array {
	
	public static int sumList(int[] list) { //call by reference
		int sum = 0;
		for (int i : list) {
			sum += i;
		} return sum;
	}

	public static int[] reverseList(int[] list) {
		for(int i=0; i<list.length/2; i++) {
			int temp = list[i];
			list[i] = list[list.length-1-i];
			list[list.length-1-i] = temp;
		} 
		return list;
	} //C#은 parameter 값에 (ref int a, ref int b) 이런 식으로 배열을 전달한다.
	
		//배열
	public static void main(String[] args) {
		
		int[] scores = new int[3];
		//int scores[] = new int[3];
		//int[] jum;
		//jum = new int[3];
		
		scores[0] = 100;
		scores[1] = 75;
		scores[2] = 90;

		for(int i=0; i<3; i++) {
			System.out.print(scores[i] + ", ");
		} System.out.println();
		
		for(int score : scores) {
			System.out.print(score + ", ");
		} System.out.println();
		
		
		// Q) 배열을 사용하여 점수의 총점과 평균을 구하시오
		int[] scores2 = new int[5];
		scores2[0] = 100;
		scores2[1] = 80;
		scores2[2] = 30;
		scores2[3] = 50;
		scores2[4] = 90;
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += scores2[i];
		}
		System.out.println("총점 : " + sum + ", 평균 : " + sum/5.0);
		
		
		int[] scores3 = {100, 45, 78, 90, 100};
		for(int i=0; i<5; i++) {
			System.out.print(scores3[i] + "\t");
		} System.out.println();
		
		
		//배열의 length를 통해 반복문 범위 지정
		int sum2 = 0;
		int[] scores4 = {30, 50, 70, 100, 88};
		for(int i=0; i<scores4.length; i++) {
			sum2 += scores4[i];
		}
		System.out.println("총점 : " + sum2 + ", 평균 : " + sum2/5.0);
		
		
		//Q) 100개 수의 합을 메소드 2형식으로 전달하여 구하시오
		int[] list = new int[100];
		for(int i=0; i<100; i++) {
			list[i] = (int)(Math.random()*100+1);
		} System.out.println("총합은 " + sumList(list));
		
		
		//Q) 5개의 수를 배열을 사용하여 전달한 후 배열 역순으로 출력하시오
		int[] nums = {10, 5, 3, 7, 8, 6};
		
		int[] revNums = reverseList(nums);
		for(int num : revNums) {
			System.out.print(num + "\t");
		} System.out.println();
		
		
		//Q) 로또 번호 생성(중복X) - 배열
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		//오름차순 정렬 함수 Arrays.sort() 
		Arrays.sort(lotto);
		
		for(int num : lotto) {
			System.out.print(num + "\t");
		}
		
		
		//
	}

}
