package com.java.inheritance;

class Samchon {
	public void isBoat() {
		System.out.println("��Ʈ ���� �ٴ���");
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
		System.out.println("���� ����~");
	}
	
	@Override
	public void flex() {
		System.out.println("���� ������~");
		
	}
	
	@Override
	public void hotel() {
		System.out.println("ȣ�� ���");
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
