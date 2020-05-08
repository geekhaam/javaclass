package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
		LinkedList<String> q = new LinkedList<String>();
		// fifo : first in, first out
		// lilo : last in, last out
		Queue q1 = new LinkedList<>();
		q1.offer("바보");
		q1.offer("온달");
		q1.offer("평강공주");
		System.out.println(q1.size());
		
		//이터레이터를 활용한 출력 (실제 출력 명령은 따로 있다.)
		/*Iterator itr = q1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		//실제 출력 명령
		if(!q1.isEmpty()) {
			System.out.println(q1.poll());
		} if(!q1.isEmpty()) {
			System.out.println(q1.poll());
		} q1.offer("홍길동");
		
		System.out.println(q1.size());
		System.out.println(q1.peek()); // 제일 처음에 있는 데이터를 받아온다.
		
		Iterator<String> itr = q1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
