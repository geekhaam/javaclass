package com.java.inheritance;

import java.util.Scanner;

abstract class Fruit {
	public void good() {
		System.out.println("과일은 좋아");
	}
	
	public abstract void eat(); //추상 메소드가 있으면 추상 클래스
}

class Apple extends Fruit {
	private final String APPLE = "사과";
	@Override
	public void eat() {
		super.good();
		System.out.println(APPLE + "를 사각사각 먹자");
	}
}

class Pear extends Fruit {
	private final String PEAR = "배";
	@Override
	public void eat() {
		super.good();
		System.out.println(PEAR + "를 맛있게 먹자");	
	}
}

//////////////////////////////////////////////////////////////

/*
 * Q) Dohyung 추상 클래스를 상속 받는 WonClass, SakakClass를 만들어 다양성 출력이 되도록 작성하시오
 */

abstract class Figure {
	public abstract void whoAmI();
}

class Circle extends Figure {
	@Override
	public void whoAmI() {
		System.out.println("원형 도형");		
	}
}

class Square extends Figure {
	@Override
	public void whoAmI() {
		System.out.println("사각형");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Figure c = new Circle();
		c.whoAmI();
		Figure s = new Square();
		s.whoAmI();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int sel = sc.nextInt();
		Fruit f;
		
		if(sel == 1) {
			f = new Apple();
			f.eat();
		} else if(sel == 2) {
			f = new Pear();
			f.eat();
		} else {
			System.out.println("1,2 중 하나만 입력해주세요");
		}
	}

}
