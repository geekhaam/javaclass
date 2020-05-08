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
		// 10������ 2������ �ٲٱ�(Stack �̿�)
		int num = 13;
		Stack<Integer> result = binNum(num);
		
		while(!result.isEmpty()) {
			System.out.print(result.pop());
		}
		

	}

}