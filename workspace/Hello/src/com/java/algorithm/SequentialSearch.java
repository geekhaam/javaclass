package com.java.algorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SequentialSearch {
	//순차 탐색
	public static int sequentialSearch(int[] arr, int search) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		/* 탐색의 종류
		 * - 순차 탐색(sequential search)
		 * 		평균 검색 횟수 : (n+1)/2
		 * - 이진 탐색(binary search)
		 * 		평균 검색 횟수 : log2(n)+1
		 * - 피보나치 탐색(fibonacci search)
		 */
		
		// Q) 정수 5개 bae 배열에서 30이 몇번째인지 순차 검색하시오(0번째 부터)
		int[] bae = {10, 20, 30, 40, 30};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 숫자를 입력하세요 : ");
		int search = Integer.parseInt(sc.next());
		
		int result = sequentialSearch(bae, search);
		
		if(result == -1) {
			System.out.println("데이터를 찾지 못하였습니다.");
		} else {
			System.out.println("검색한 데이터는 " + result + "번에 위치하고 있습니다.");
		}
	}

}
