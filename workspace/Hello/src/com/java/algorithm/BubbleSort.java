package com.java.algorithm;

import java.util.Scanner;

public class BubbleSort {
	
	public static String makePass(String str) {
		String[] arr = str.split("");
		String temp = arr[1];
		arr[1] = arr[3];
		arr[3] = temp;
		
		temp = arr[2];
		arr[2] = arr[4];
		arr[4] = temp;
		
		String password = "";
		for(String s : arr) {
			password += s;
		}
		return password;
	}
	
	public static void main(String[] args) {
		//Q) 두개의 정수가 있는 정수배열을 잡아 두 요소값을 swap하시오.
		int[] list1 = {1, 3, 5, 7, 9};
		int[] list2 = {2, 4, 6, 8, 10};
		
		for(int i=0; i<5; i++) {
			int temp = list1[i];
			list1[i] = list2[i];
			list2[i] = temp;
		} for(int num : list1) {
			System.out.print(num + " ");
		} System.out.println();
		
		/*Q) ondal 단어를 초기치로 넣은 후 원본 암호를 변형시켜 출력시
		 * oalnd로 출력하는 규칙있는 암호 프로그램을 작성하시오
		 * (실제 암호를 알아낼 떄는 다시 원위치하는 로직을 돌린다.)
		 */
		
		System.out.println(makePass("ondal"));
		
		int[] k = {10, 90, 100, 60, 70, 23};
		
		//Q) 위 k배열을 내림차순으로 정렬하시오.
		int cnt = 0;
		for(int i=0; i<k.length; i++) {
			for(int j=1; j<k.length-i; j++) {
				if(k[j-1] < k[j]) {
					int temp = k[j-1];
					k[j-1] = k[j];
					k[j] = temp;
					cnt++;
				}
			} if(cnt==0) {
				break;
			}
		}
		for(int n : k) {
			System.out.print(n + " ");
		} System.out.println("\n" + cnt);
		
		
		/* Q) 학생 이름과 점수를 사용하여 점수 내림차순으로 출력하시오
		 * (단, 배열의 초기치를 사용하여 자바의 sort api를 사용하지 마시오)
		 * output design은
		 * 최은우	45
		 * 이미래	78
		 * 하채	98
		 * 김정환	100
		 * 박만기	100
		 */
		int[] scores = {45, 100, 98, 78, 100};
		String[] names = {"최은우", "김정환", "하채", "이미래", "박만기"};
		int count = 0;

		for(int i=0; i<scores.length; i++) {
			for(int j=1; j<scores.length-i; j++) {
				if(scores[j-1] > scores[j]) {
					int tempS = scores[j-1];
					scores[j-1] = scores[j];
					scores[j] = tempS;
					
					String tempN = names[j-1];
					names[j-1] = names[j];
					names[j] = tempN;
					count++;
				}
			} if(count==0) {
				break;
			}
		}
		for(int i=0; i<scores.length; i++) {
			System.out.println(names[i] + "\t" + scores[i]);	
		} System.out.println("바꾼 횟수 : " + count);
		
	}

}
