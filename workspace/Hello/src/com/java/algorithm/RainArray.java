package com.java.algorithm;

public class RainArray {

	public static void main(String[] args) {
		//빗줄기 배열
		/* 행열의 특징을 파악하면 된다. "행+열"이 같은 값을 가지면 대각선의 형태를 띄고 있기 때문에
		 * for문을 활용하여 먼저 오는 부분부터 순차적으로 값을 넣고, 값을 증가시키면서 넣어주면 된다.
		 */
		int[][] arr = new int[5][5];
		int n = 0;
		for(int b=0; b<9; b++) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(i+j==b) {
						n++;
						arr[i][j] = n;
					}
				}
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
