package com.java.collection;

import java.util.Stack;

public class StackPractice {

	public static Stack<Integer> binNum(int num) {
		Stack<Integer> st = new Stack<>();
		while(num!=1) {
			st.push(num%2);
			num = num/2;
		} st.push(num);
		return st;
	}
	
	public static void main(String[] args) {
		// 10진수를 2진수로 바꾸기(Stack 이용)
		int num = 13;
		Stack<Integer> result = binNum(num);
		
		while(!result.isEmpty()) {
			System.out.print(result.pop());
		}
		

	}

}
