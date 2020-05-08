package com.java.arrayandtype;

public class TypeConversion {
			//형변환
	public static void main(String[] args) {
		//암시적(묵시적) 형변환
		//같은 타입의 작은 단위 자료형에서 큰 단위 자료형으로 변환
		short sh1 = 100;
		int i1 = sh1;
		
		//명시적 형변환
		int num7 = 2;
		short sh2 = (short)num7; //short로 down-casting
		
		
		//Boxing (stack -> heap)
		int ff = 3; //stack memory
		Object gg = ff;
		
		//Unboxing
		int hh = (int)gg;
		System.out.println(hh);
	}

}
