package com.java.string;

public class CharAt {
	
	public static String change(String str) {
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(Character.isLowerCase(arr[i])) {
				//Character.isLowerCase(Char chr) 소문자인지 판별하는 메소드
				arr[i] = str.toUpperCase().charAt(i);
			} else {
				arr[i] = str.toLowerCase().charAt(i);
			}
		}
		String result = String.valueOf(arr);
		return result;
		}

	public static void main(String[] args) {
		/*String s1 = "ondal";
		String s2 = "온달";
		System.out.println(s1.charAt(0)); //o
		System.out.println(s2.charAt(1)); //달
        */
		
		/* Q) 문자열 loVE를 변수로 선언한 후 대소문자를 바꾸어 출력하시오
		 * (단, 메소드 호출을 이용하시오.)
		 */
		String str = "loVE";
		System.out.println(change(str));
	}

}
