package com.java.object;

public class Cpmain {

	public static void main(String[] args) {
		Cellphone cp1 = new Cellphone("홍길동", "아이폰xs", 1500000, "종로지점");
		Cellphone cp2 = new Cellphone();
		cp2.setDevice("갤럭시s8");
		cp2.setName("이도령");
		cp2.setPrice(900000);
		cp2.setLocation("강남지점");
		
		System.out.println(cp1+"\n"+cp2);
	}

}
