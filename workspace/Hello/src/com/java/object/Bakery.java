package com.java.object;

class BBang { //설계도, (1)정의
	private String bbang;	//속성 field : 종류 => 멤버변수, 멤버함수
	private String price;
	//접근 지정자 access modifier
	//private : 같은 클래스에서만 접근 가능
	//public : 외부 클래스에서도 접근 가능
	//(default) : 같은 패키지에서 접근 가능 
	//protected : 상속 관계 있는 클래스끼리만 접근 가능
	public BBang() {
		// Default Constructor
	}
	public BBang(String bbang, String price) {
		super();
		this.bbang = bbang;
		this.price = price;
	}
	public String getBbang() {
		return bbang;
	}
	public void setBbang(String bbang) {
		this.bbang = bbang;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void yummy() {
		System.out.println("빵을 맛있게 먹자");
	}
	public void printAll() {
		System.out.println("빵종류는 " + bbang + "이고 가격은 " + price);
	}
	public String toString() { //Object의 toString() 메소드 overriding
		return "빵종류는 " + bbang + "이고 가격은 " + price;
	}
}

public class Bakery {
	
	public static void main(String[] args) {
		/* 제과점(Bakery-BBang 클래스)에서 빵종류와 빵가격 그리고 "빵을 맛있게 먹자"
		  를 실행하는 메소드를 설계하여 운영하려고 한다.
		  이에 대한 OOP를 작성하시오
		  (출력)
		  피자빵 2000원
		  소보루빵 1000원
		  빵을 맛있게 먹자*/
		 
		BBang p = new BBang(); // (2)생성 - Constructor 이용
		p.setBbang("피자빵");
		p.setPrice("3000원");
		
		BBang s = new BBang("소보루빵", "1000원");
		
		System.out.println(p.getBbang() + " " + p.getPrice() + "\n"
				+ s.getBbang() + " " + s.getPrice());
		p.printAll();
		p.yummy();
		
		//toString 사용
		System.out.println(s.toString());
		System.out.println(s); // toString은 생략 가능하다.
		//문자열
		//객체의 부모 클래스 Object - 속성, 메소드(toString())

	}

}
