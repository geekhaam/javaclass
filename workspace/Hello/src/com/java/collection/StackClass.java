package com.java.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		/* Q) Stack�� ���� �̸� 3�� ������ generic���� �ְ�
		 * �ٽ� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 * ���� Iterator�� ����Ͽ����� ����Ͻÿ�
		 * push, pop
		 */
		
		Stack<String> s = new Stack<String>();
		s.push("���");
		s.push("���");
		s.push("������");
		
		//Iterator ���
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(s.size() + "\n");
		
		//pop() �޼ҵ� ���
		while(!s.isEmpty()) {
			System.out.println(s.pop());			
		}
		System.out.println(s.size());
	}

}
