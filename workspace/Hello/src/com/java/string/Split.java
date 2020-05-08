package com.java.string;

public class Split {
	
	public static String[] searchFirst(String str, char search) {
		String[] arr = str.split(",");
		String[] result = new String[arr.length];
		int idx = 0;
		//String search2 = Character.toString(search);
		for(int i=0; i<arr.length; i++) {
			if(arr[i].toLowerCase().indexOf(search) == 0) {
				result[idx] = arr[i];
				idx++;
			}
			/*if(arr[i].toLowerCase().charAt(0) == search) {
				result[idx] = arr[i];
				idx++;
			}
			혹은			
			if(arr[i].toLowerCase().startsWith(search2)) {
				result[idx] = arr[i];
				idx++;
			}
			*/
		}
		int nullCnt = 0;
		for(int j=0; j<result.length; j++) {
			if(result[j] == null) {
				nullCnt++;
			}
		}
		String[] returnThis = new String[result.length - nullCnt];
		for(int k=0; k<returnThis.length; k++) {
			returnThis[k] = result[k];
		}
		return returnThis;
	}

	public static void main(String[] args) {
		/*String str = "듀엣그룹,duetMiso,얼굴천사";
		String[] strs = str.split(",");
		
		for(String arg : strs) {
			System.out.println(arg);
		}*/
		
		/*
		 * Q) String s1 = "babonnda1,Baeyu1,강과바다,kongjoo,Marry,blue,강은우";
		 * 를 사용하여 제시어 '강'을 넣으면 '강'으로 시작하는 단어 모두를 출력하는 프로그램을 작성하시오.
		 */
		String s1 = "babonnda1,Baeyu1,강과바다,kongjoo,Marry,blue,강은우";
		String[] result = searchFirst(s1, 'b');
		for(String s : result) {
			System.out.println(s);
		}			
		if(result.length == 0) {
			System.out.println("검색 결과 없음");
		} else {
			System.out.println("조회 결과 : " + result.length + "개");
		}
		
	}

}
