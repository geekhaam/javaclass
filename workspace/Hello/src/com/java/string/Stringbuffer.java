package com.java.string;

public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(10);
		sb.append("babo");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.delete(1, 2);
		System.out.println(sb.toString());
		
		//jdbc(java database connectivity)
		//java + oracle
		//SQL���� ������� �߰��ÿ� ����� �� �ִ�.
	}

}
