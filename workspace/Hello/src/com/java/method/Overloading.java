package com.java.method;

public class Overloading {
	
	//������ : method overloading
	public static void kaja() {
		System.out.println("���η� ������");
	}
	
	public static void kaja(double b) {
		System.out.println("�ǹ� ���� �� " + b);
	}
	
	public static void kaja(int a) {
		System.out.println("���η� ������" + a + "�� ������ Ÿ����.");
	}
	
	public static void kaja(int a, double b) {
		System.out.println("���� " + a + " �Ǽ� " + b);
	}
	
	public static void main(String[] args) {
		
		int aa = 100;
		double bb = 23.5;
		
		kaja();
		kaja(aa);
		kaja(bb);

	}

}
