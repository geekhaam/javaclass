package com.java.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	//이진 탐색 (정렬된 배열에서만 사용할 수 있다.)
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
		
		System.out.print("검색할 데이터를 입력해주세요 : ");
		int search = Integer.parseInt(sc.next());
		int result = binarySearch(arr, search);
		
		int result2 = 0;
		if(result == -1) {
			System.out.println("검색한 데이터가 존재하지 않습니다.");
		} else {
			for(int i=0; i<arr2.length; i++) {
				if(arr2[i] == arr[result]) {
					result2 = i;
				}
			} System.out.println("검색한 데이터는 " + result2 + "번째에 위치합니다.");
		}
		
		System.out.println("45는 " + Arrays.binarySearch(arr, 45) + "번째에 있습니다.");
		//4
		System.out.println("100은 " + Arrays.binarySearch(arr, 100) + "번째에 있습니다.");
		//-8, 결과가 없는 경우엔 음수값이 반환 된다.
		
		
		System.out.print("검색할 데이터를 입력하세요 : ");
		int search2 = Integer.parseInt(sc.next());
		
		int result3 = Arrays.binarySearch(arr, search2); 
		if(result3 >= 0) {
			System.out.println(result3 + "번째에 위치합니다.");
		} else {
			System.out.println("존재하지 않습니다.");
		}
		
		sc.close();
	}

}
