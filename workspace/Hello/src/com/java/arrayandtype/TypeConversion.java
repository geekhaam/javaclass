package com.java.arrayandtype;

public class TypeConversion {
			//����ȯ
	public static void main(String[] args) {
		//�Ͻ���(������) ����ȯ
		//���� Ÿ���� ���� ���� �ڷ������� ū ���� �ڷ������� ��ȯ
		short sh1 = 100;
		int i1 = sh1;
		
		//����� ����ȯ
		int num7 = 2;
		short sh2 = (short)num7; //short�� down-casting
		
		
		//Boxing (stack -> heap)
		int ff = 3; //stack memory
		Object gg = ff;
		
		//Unboxing
		int hh = (int)gg;
		System.out.println(hh);
	}

}
