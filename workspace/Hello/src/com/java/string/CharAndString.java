package com.java.string;

public class CharAndString {
	
	public static String change(String s) {
		char[] c = s.toCharArray(); //String -> char
		c[4] = 'b';
		String s2 = new String(c); //char -> String
				//= String.valueOf(c);
				//= String.copyValueOf(c);
		return s2;
	}
	
	public static void main(String[] args) {
		/*Q) 문자열 kongjoo를 기억시켜놓고 j를 b로 변경하여
		 * kongboo를 출력하시오.
		 * (단, String to char [] 을 사용하여 또한 메소드 2형식으로 푸시오.)*/
		
		String str = "kongjoo";
		System.out.println(change(str));

	}

}
