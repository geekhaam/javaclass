package com.java.algorithm;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		/*Q) picture�� ���ڿ� �迭�� �ְ� ���ڸ� �˾Ƹ��ߴ� hangman program��
		 * �ۼ��Ͻÿ�. (�� , 13�� �ȿ� ���߾�� �Ѵ�.)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		String quiz = sc.next();
		System.out.print("Ƚ�� ���� : ");
		int limit = Integer.parseInt(sc.next());
		
		String[] strList = quiz.split("");
		String[] checkList = new String[strList.length];
		for(int i=0; i<strList.length; i++) {
			checkList[i] = "_";
		}
		int cnt = 0;
		int cor = 0;
		
		while(true) {
			if(cnt == limit) {
				break;
			}
			String check = "";
			for(String c : checkList) {
				check += c;
			}
			
			System.out.println(check);
			System.out.print("���ĺ� : ");
			String alpha = sc.next();
			cnt++;
			System.out.println("�õ� Ƚ�� : " + cnt);
			
			for(int i=0; i<strList.length; i++) {
				if(strList[i].equals(alpha)) {
					checkList[i] = alpha;
					cor++;
				}			
			} if(cor==strList.length) {
				break;
			}
		}
		
		if(cor == strList.length) {
			System.out.println(quiz + "\n�����Դϴ�.");
		} else {
			System.out.println("Hangman is dead");
		}
	}

}
