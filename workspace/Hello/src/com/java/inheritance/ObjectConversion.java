package com.java.inheritance;

class Parent2 {
	public void car() {
		System.out.println("�θ� Ŭ����");
	}
	
}

class Child2 extends Parent2 {
	
	public void car() {
		System.out.println("�ڳ� Ŭ����");
	}
}
/*overriding ������
 * 1) ����� �ʼ� ����
 * 2) �޼ҵ� �̸��� ����
 * 3) Upgrade
*/

public class ObjectConversion {

	public static void main(String[] args) {				
		
		Parent2 p1 = new Parent2();
		Child2 c1 = new Child2();
		p1.car();
		c1.car();
		
		//Parent2 p2 = c1; //��ü�� ����ȯ
		Parent2 p2 = new Child2();
		p2.car();
		Child2 c3 = (Child2) p2;
		c3.car();
		//Child2 c4 = (Child2) p1; //Run Error (Compile Ok)
		
		
	}

}
