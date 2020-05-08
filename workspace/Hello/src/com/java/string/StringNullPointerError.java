package com.java.string;

public class StringNullPointerError {
			//String과 Null Pointer Error
	public static void main(String[] args) {
		
		//Null Pointer Error
				
		String ppp = null; //Stack영역에 참조변수는 생성되지만, Heap영역에 객체를 참조하지 않는다.
		String qqq = "";
		//Stack영역에 참조변수가 생성되고, Heap영역에 빈문자열이 참조된 경우
		System.out.println(qqq.length() > 0); //빈 문자열 : 길이가 0인 문자열
		//System.out.println(ppp.length() > 0); //Null Pointer Error
		
		String aa = "ondal";
		String bb = "ondal";
		if(aa == bb) //stack영역에 있는 참조변수가 같은지
			System.out.println(aa + "\t" + bb);
		
		if(aa.equals(bb)) //heap에 저장된 문자열 비교
			System.out.println(aa + "\t" + bb);
		
		
		String cc = new String("ondal");
		String dd = new String("ondal");
		
		//new를 사용하여 heap의 새로운 영역에 "ondal"을 저장하였으므로 참조변수가 다르다.
		if(cc==dd) 
			System.out.println("참조변수가 같으면 이것을 출력");
		if(cc.equals(dd))
			System.out.println("값이 같으면 이것을 출력");
	}

}
