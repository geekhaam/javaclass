package com.java.algorithm;

public class RainArray {

	public static void main(String[] args) {
		//���ٱ� �迭
		/* �࿭�� Ư¡�� �ľ��ϸ� �ȴ�. "��+��"�� ���� ���� ������ �밢���� ���¸� ��� �ֱ� ������
		 * for���� Ȱ���Ͽ� ���� ���� �κк��� ���������� ���� �ְ�, ���� ������Ű�鼭 �־��ָ� �ȴ�.
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
