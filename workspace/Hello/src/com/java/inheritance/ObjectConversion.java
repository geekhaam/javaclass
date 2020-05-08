package com.java.inheritance;

class Parent2 {
	public void car() {
		System.out.println("부모 클래스");
	}
	
}

class Child2 extends Parent2 {
	
	public void car() {
		System.out.println("자녀 클래스");
	}
}
/*overriding 재정의
 * 1) 상속이 필수 조건
 * 2) 메소드 이름이 동일
 * 3) Upgrade
*/

public class ObjectConversion {

	public static void main(String[] args) {				
		
		Parent2 p1 = new Parent2();
		Child2 c1 = new Child2();
		p1.car();
		c1.car();
		
		//Parent2 p2 = c1; //객체의 형변환
		Parent2 p2 = new Child2();
		p2.car();
		Child2 c3 = (Child2) p2;
		c3.car();
		//Child2 c4 = (Child2) p1; //Run Error (Compile Ok)
		
		
	}

}
