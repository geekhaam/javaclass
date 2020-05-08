package com.java.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		/* Q) Stack에 음식 이름 3개 정도를 generic으로 넣고
		 * 다시 꺼내어 출력하는 프로그램을 작성하시오
		 * 또한 Iterator를 사용하여서도 출력하시오
		 * push, pop
		 */
		
		Stack<String> s = new Stack<String>();
		s.push("라면");
		s.push("김밥");
		s.push("떡볶이");
		
		//Iterator 사용
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(s.size() + "\n");
		
		//pop() 메소드 사용
		while(!s.isEmpty()) {
			System.out.println(s.pop());			
		}
		System.out.println(s.size());
	}

}
