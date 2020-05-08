package com.java.collection;

import java.util.ArrayList;
import java.util.Date;

/* Q) product, price 필드가 있는 SMarket 클래스를 추가로 만드시오
 * 단, 생성자 2개, toString()도 만드시오.
 */

class SMarket {
	private String product;
	private int price;
	
	public SMarket() {
		// Default Constructor
	}
	
	public SMarket(String product, int price) {
		super();
		this.product = product;
		this.price = price;
	}

	public String toString() {
		return "상품은 " + product + "이고, 가격은 " + price + "입니다.";
	}
	
}

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		System.out.println(arr.size());
		
				//wrapper
		arr.add(new Integer(300)); //정수
		arr.add(new Double(34.7)); //실수
		arr.add("dayday"); //문자열
		arr.add('강'); //char
		arr.add(new Date()); //내장 객체
		
		arr.add(new SMarket("우유", 1000));
		arr.add(new SMarket("빵", 2000));
		
		for(int i=0;i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		//generic
		//배열과 컬렉션의 장점을 따서 만들어보자
		//가변 길이 배열 + one data type
		
		ArrayList<String> arr1 = new ArrayList<String>();
		System.out.println(arr1.size());
		
		arr1.add("빵");
		arr1.add("라면");
		arr1.add("우유");
		arr1.add("김밥");
		
		arr1.set(1, "과자"); //수정
		arr1.remove(2);	//삭제
		arr1.remove("빵");
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		
		for(String str : arr1) {
			System.out.println(str);
		}
		
		
	}

}
