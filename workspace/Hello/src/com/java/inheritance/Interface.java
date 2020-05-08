package com.java.inheritance;

class Samchon {
	public void isBoat() {
		System.out.println("보트 여행 다니자");
	}
}

interface Aunt {
	void hotel();
}

interface Booja {
	void flex();
}

class Me extends Samchon implements Booja, Aunt {
	
	public void useMoney() {
		System.out.println("많이 쓰자~");
	}
	
	@Override
	public void flex() {
		System.out.println("많이 벌었다~");
		
	}
	
	@Override
	public void hotel() {
		System.out.println("호텔 사업");
	}
}

public class Interface {

	public static void main(String[] args) {
		Me m = new Me();
		m.useMoney();
		m.isBoat();
		m.flex();
		m.hotel();

	}

}
