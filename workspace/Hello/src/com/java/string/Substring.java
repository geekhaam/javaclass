package com.java.string;

public class Substring {
	
	public static void movingStr(String str) {
		for(int i=0; i<20; i++) {
			System.out.println(str);
			for(int j=1; j<str.length(); j++) {
				System.out.println(str.substring(j) + str.substring(0, j));
			}				
			/*str = str.substring(1, str.length()) + str.substring(0,1);
			System.out.println(str);*/
		}
	}
	
	public static void movingStr2(String str) {
		char[] chr = str.toCharArray();
		String result = null;
		for(int i=0; i<20; i++) {
			char temp1 = chr[0];
			for(int j=1; j<chr.length; j++) {
					chr[j-1] = chr[j];
				}
			chr[chr.length-1] = temp1;
			
			result = String.valueOf(chr);
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		
		String s1 = "LOVE";
		//String s1 = "		I LOVE YOU";
		//System.out.println(s1.substring(0, 3));
		// 0번 인덱스부터 (3-1)번 인덱스까지 출력  => 0 ~ 2번까지 출력
		
		movingStr2(s1);
	}

}
