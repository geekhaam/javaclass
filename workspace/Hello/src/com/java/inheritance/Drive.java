package com.java.inheritance;

import java.util.Scanner;

class Pcar {
	public void drive() {
		System.out.println("부모 차 타고 여행가자");
	}
}

class Ccar extends Pcar {
	public void drive() {
		System.out.println("자녀 차 타고 여행가자");
	}
}
public class Drive {

	public static void main(String[] args) {
		/* Q) 부모, 자녀 클래스를 사용하여 객체의 형변환 프로그램을 작성하시오
		 * 결과는
		 * 어느차를 타시렵니까? (부모차=1, 자녀차=2)
		 * 2
		 * 자녀차 타고 여행가자
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("어느 차를 타시렵니까? (부모차=1, 자녀차=2) ");
		int sel = Integer.parseInt(sc.next());
		Pcar p;
		
		if(sel == 1) {
			p = new Pcar();
			p.drive();
		} else if(sel == 2) {
			p = new Ccar();
			p.drive();
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

}
