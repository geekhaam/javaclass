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
		//Q) �ΰ��� ������ �ִ� �����迭�� ��� �� ��Ұ��� swap�Ͻÿ�.
		int[] list1 = {1, 3, 5, 7, 9};
		int[] list2 = {2, 4, 6, 8, 10};
		
		for(int i=0; i<5; i++) {
			int temp = list1[i];
			list1[i] = list2[i];
			list2[i] = temp;
		} for(int num : list1) {
			System.out.print(num + " ");
		} System.out.println();
		
		/*Q) ondal �ܾ �ʱ�ġ�� ���� �� ���� ��ȣ�� �������� ��½�
		 * oalnd�� ����ϴ� ��Ģ�ִ� ��ȣ ���α׷��� �ۼ��Ͻÿ�
		 * (���� ��ȣ�� �˾Ƴ� ���� �ٽ� ����ġ�ϴ� ������ ������.)
		 */
		
		System.out.println(makePass("ondal"));
		
		int[] k = {10, 90, 100, 60, 70, 23};
		
		//Q) �� k�迭�� ������������ �����Ͻÿ�.
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
		
		
		/* Q) �л� �̸��� ������ ����Ͽ� ���� ������������ ����Ͻÿ�
		 * (��, �迭�� �ʱ�ġ�� ����Ͽ� �ڹ��� sort api�� ������� ���ÿ�)
		 * output design��
		 * ������	45
		 * �̷̹�	78
		 * ��ä	98
		 * ����ȯ	100
		 * �ڸ���	100
		 */
		int[] scores = {45, 100, 98, 78, 100};
		String[] names = {"������", "����ȯ", "��ä", "�̷̹�", "�ڸ���"};
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
		} System.out.println("�ٲ� Ƚ�� : " + count);
		
	}

}
