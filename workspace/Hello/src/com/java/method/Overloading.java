package com.java.method;

public class Overloading {
	
	//다형성 : method overloading
	public static void kaja() {
		System.out.println("종로로 가려면");
	}
	
	public static void kaja(double b) {
		System.out.println("의미 없는 값 " + b);
	}
	
	public static void kaja(int a) {
		System.out.println("종로로 가려면" + a + "번 버스를 타세요.");
	}
	
	public static void kaja(int a, double b) {
		System.out.println("정수 " + a + " 실수 " + b);
	}
	
	public static void main(String[] args) {
		
		int aa = 100;
		double bb = 23.5;
		
		kaja();
		kaja(aa);
		kaja(bb);

	}

}
