package com.java.algorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SequentialSearch {
	//���� Ž��
	public static int sequentialSearch(int[] arr, int search) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		/* Ž���� ����
		 * - ���� Ž��(sequential search)
		 * 		��� �˻� Ƚ�� : (n+1)/2
		 * - ���� Ž��(binary search)
		 * 		��� �˻� Ƚ�� : log2(n)+1
		 * - �Ǻ���ġ Ž��(fibonacci search)
		 */
		
		// Q) ���� 5�� bae �迭���� 30�� ���°���� ���� �˻��Ͻÿ�(0��° ����)
		int[] bae = {10, 20, 30, 40, 30};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�˻��� ���ڸ� �Է��ϼ��� : ");
		int search = Integer.parseInt(sc.next());
		
		int result = sequentialSearch(bae, search);
		
		if(result == -1) {
			System.out.println("�����͸� ã�� ���Ͽ����ϴ�.");
		} else {
			System.out.println("�˻��� �����ʹ� " + result + "���� ��ġ�ϰ� �ֽ��ϴ�.");
		}
	}

}
