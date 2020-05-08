package com.java.inheritance;

import java.util.Scanner;

abstract class Fruit {
	public void good() {
		System.out.println("������ ����");
	}
	
	public abstract void eat(); //�߻� �޼ҵ尡 ������ �߻� Ŭ����
}

class Apple extends Fruit {
	private final String APPLE = "���";
	@Override
	public void eat() {
		super.good();
		System.out.println(APPLE + "�� �簢�簢 ����");
	}
}

class Pear extends Fruit {
	private final String PEAR = "��";
	@Override
	public void eat() {
		super.good();
		System.out.println(PEAR + "�� ���ְ� ����");	
	}
}

//////////////////////////////////////////////////////////////

/*
 * Q) Dohyung �߻� Ŭ������ ��� �޴� WonClass, SakakClass�� ����� �پ缺 ����� �ǵ��� �ۼ��Ͻÿ�
 */

abstract class Figure {
	public abstract void whoAmI();
}

class Circle extends Figure {
	@Override
	public void whoAmI() {
		System.out.println("���� ����");		
	}
}

class Square extends Figure {
	@Override
	public void whoAmI() {
		System.out.println("�簢��");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Figure c = new Circle();
		c.whoAmI();
		Figure s = new Square();
		s.whoAmI();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		int sel = sc.nextInt();
		Fruit f;
		
		if(sel == 1) {
			f = new Apple();
			f.eat();
		} else if(sel == 2) {
			f = new Pear();
			f.eat();
		} else {
			System.out.println("1,2 �� �ϳ��� �Է����ּ���");
		}
	}

}
