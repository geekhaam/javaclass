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
		q1.offer("�ٺ�");
		q1.offer("�´�");
		q1.offer("�򰭰���");
		System.out.println(q1.size());
		
		//���ͷ����͸� Ȱ���� ��� (���� ��� ����� ���� �ִ�.)
		/*Iterator itr = q1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		//���� ��� ���
		if(!q1.isEmpty()) {
			System.out.println(q1.poll());
		} if(!q1.isEmpty()) {
			System.out.println(q1.poll());
		} q1.offer("ȫ�浿");
		
		System.out.println(q1.size());
		System.out.println(q1.peek()); // ���� ó���� �ִ� �����͸� �޾ƿ´�.
		
		Iterator<String> itr = q1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
