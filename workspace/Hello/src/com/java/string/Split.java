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
			Ȥ��			
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
		/*String str = "�࿧�׷�,duetMiso,��õ��";
		String[] strs = str.split(",");
		
		for(String arg : strs) {
			System.out.println(arg);
		}*/
		
		/*
		 * Q) String s1 = "babonnda1,Baeyu1,�����ٴ�,kongjoo,Marry,blue,������";
		 * �� ����Ͽ� ���þ� '��'�� ������ '��'���� �����ϴ� �ܾ� ��θ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		String s1 = "babonnda1,Baeyu1,�����ٴ�,kongjoo,Marry,blue,������";
		String[] result = searchFirst(s1, 'b');
		for(String s : result) {
			System.out.println(s);
		}			
		if(result.length == 0) {
			System.out.println("�˻� ��� ����");
		} else {
			System.out.println("��ȸ ��� : " + result.length + "��");
		}
		
	}

}
