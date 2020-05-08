package com.java.inheritance;

class Chef {
	public void cook() {
		System.out.println("������ �丮 ����");
	}
}

interface rule {
	void rule1();
	void rule2();
}

class Member extends Chef implements rule {
	@Override
	public void rule1() {
		System.out.println("������ ���� ���ڰ�");
	}
	public void rule2() {
		System.out.println("�մ� ���⿡ �°�");
	}
}

public class Restaurant {

	public static void main(String[] args) {
		/* interface, Chef Ŭ������ ����Ͽ� ������ ���� ����Ͻÿ�
		 * 
		 * ������ �丮 ����  -> Chef class
		 * ������ ���� ���ڰ�
		 * �մ� ���⿡ �°�
		 * ������ �丮 ����
		 */
		Member m = new Member();
		m.rule1();
		m.rule2();
		m.cook();
	}

}
