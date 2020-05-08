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
		//SQL문이 길어져서 추가시에 사용할 수 있다.
	}

}
