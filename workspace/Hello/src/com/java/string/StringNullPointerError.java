package com.java.string;

public class StringNullPointerError {
			//String�� Null Pointer Error
	public static void main(String[] args) {
		
		//Null Pointer Error
				
		String ppp = null; //Stack������ ���������� ����������, Heap������ ��ü�� �������� �ʴ´�.
		String qqq = "";
		//Stack������ ���������� �����ǰ�, Heap������ ���ڿ��� ������ ���
		System.out.println(qqq.length() > 0); //�� ���ڿ� : ���̰� 0�� ���ڿ�
		//System.out.println(ppp.length() > 0); //Null Pointer Error
		
		String aa = "ondal";
		String bb = "ondal";
		if(aa == bb) //stack������ �ִ� ���������� ������
			System.out.println(aa + "\t" + bb);
		
		if(aa.equals(bb)) //heap�� ����� ���ڿ� ��
			System.out.println(aa + "\t" + bb);
		
		
		String cc = new String("ondal");
		String dd = new String("ondal");
		
		//new�� ����Ͽ� heap�� ���ο� ������ "ondal"�� �����Ͽ����Ƿ� ���������� �ٸ���.
		if(cc==dd) 
			System.out.println("���������� ������ �̰��� ���");
		if(cc.equals(dd))
			System.out.println("���� ������ �̰��� ���");
	}

}
