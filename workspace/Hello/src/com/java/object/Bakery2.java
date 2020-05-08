package com.java.object;

public class Bakery2 {

	public static void main(String[] args) {
		
		BBang2 p = new BBang2("乔磊户", 3000);
		BBang2 s = new BBang2();
		s.setBbang("家焊风户");
		s.setPrice(2000);
		
		System.out.println(p);
		System.out.println(s);

	}

}
