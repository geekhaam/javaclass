package com.java.string;

public class CharAt {
	
	public static String change(String str) {
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(Character.isLowerCase(arr[i])) {
				//Character.isLowerCase(Char chr) �ҹ������� �Ǻ��ϴ� �޼ҵ�
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
		String s2 = "�´�";
		System.out.println(s1.charAt(0)); //o
		System.out.println(s2.charAt(1)); //��
        */
		
		/* Q) ���ڿ� loVE�� ������ ������ �� ��ҹ��ڸ� �ٲپ� ����Ͻÿ�
		 * (��, �޼ҵ� ȣ���� �̿��Ͻÿ�.)
		 */
		String str = "loVE";
		System.out.println(change(str));
	}

}
