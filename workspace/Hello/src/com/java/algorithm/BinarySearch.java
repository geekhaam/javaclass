package com.java.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	//���� Ž�� (���ĵ� �迭������ ����� �� �ִ�.)
	public static int binarySearch(int[] arr, int search) {
		int first = 0;
		int last = arr.length-1;
		while(first <= last) {
			int mid = (first + last)/2;
			if(arr[mid] == search) {
				return mid;
			} else if(arr[mid] < search) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		} return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {11, 84, 45, 78, 34, 9, 2};
		int[] arr2 = {11, 84, 45, 78, 34, 9, 2};
		Arrays.sort(arr);
		
		for(int n : arr) {
			System.out.print(n + " ");
		} System.out.println();
		Scanner sc =new Scanner(System.in);
		
		System.out.print("�˻��� �����͸� �Է����ּ��� : ");
		int search = Integer.parseInt(sc.next());
		int result = binarySearch(arr, search);
		
		int result2 = 0;
		if(result == -1) {
			System.out.println("�˻��� �����Ͱ� �������� �ʽ��ϴ�.");
		} else {
			for(int i=0; i<arr2.length; i++) {
				if(arr2[i] == arr[result]) {
					result2 = i;
				}
			} System.out.println("�˻��� �����ʹ� " + result2 + "��°�� ��ġ�մϴ�.");
		}
		
		System.out.println("45�� " + Arrays.binarySearch(arr, 45) + "��°�� �ֽ��ϴ�.");
		//4
		System.out.println("100�� " + Arrays.binarySearch(arr, 100) + "��°�� �ֽ��ϴ�.");
		//-8, ����� ���� ��쿣 �������� ��ȯ �ȴ�.
		
		
		System.out.print("�˻��� �����͸� �Է��ϼ��� : ");
		int search2 = Integer.parseInt(sc.next());
		
		int result3 = Arrays.binarySearch(arr, search2); 
		if(result3 >= 0) {
			System.out.println(result3 + "��°�� ��ġ�մϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		
		sc.close();
	}

}
