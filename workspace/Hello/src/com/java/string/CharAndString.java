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
		/*Q) ���ڿ� kongjoo�� �����ѳ��� j�� b�� �����Ͽ�
		 * kongboo�� ����Ͻÿ�.
		 * (��, String to char [] �� ����Ͽ� ���� �޼ҵ� 2�������� Ǫ�ÿ�.)*/
		
		String str = "kongjoo";
		System.out.println(change(str));

	}

}
