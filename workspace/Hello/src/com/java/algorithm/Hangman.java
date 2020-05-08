package com.java.algorithm;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		/*Q) picture를 문자열 배열에 넣고 글자를 알아맞추는 hangman program을
		 * 작성하시오. (단 , 13번 안에 맞추어야 한다.)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문제를 입력해주세요 : ");
		String quiz = sc.next();
		System.out.print("횟수 제한 : ");
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
			System.out.print("알파벳 : ");
			String alpha = sc.next();
			cnt++;
			System.out.println("시도 횟수 : " + cnt);
			
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
			System.out.println(quiz + "\n정답입니다.");
		} else {
			System.out.println("Hangman is dead");
		}
	}

}
