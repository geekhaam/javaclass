package com.java.inheritance;

class Chef {
	public void cook() {
		System.out.println("셰프는 요리 잘해");
	}
}

interface rule {
	void rule1();
	void rule2();
}

class Member extends Chef implements rule {
	@Override
	public void rule1() {
		System.out.println("포장은 간단 예쁘게");
	}
	public void rule2() {
		System.out.println("손님 취향에 맞게");
	}
}

public class Restaurant {

	public static void main(String[] args) {
		/* interface, Chef 클래스를 상속하여 다음과 같이 출력하시오
		 * 
		 * 셰프는 요리 잘해  -> Chef class
		 * 포장은 간단 예쁘게
		 * 손님 취향에 맞게
		 * 셰프는 요리 잘해
		 */
		Member m = new Member();
		m.rule1();
		m.rule2();
		m.cook();
	}

}
