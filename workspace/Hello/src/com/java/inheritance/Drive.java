package com.java.inheritance;

import java.util.Scanner;

class Pcar {
	public void drive() {
		System.out.println("�θ� �� Ÿ�� ���డ��");
	}
}

class Ccar extends Pcar {
	public void drive() {
		System.out.println("�ڳ� �� Ÿ�� ���డ��");
	}
}
public class Drive {

	public static void main(String[] args) {
		/* Q) �θ�, �ڳ� Ŭ������ ����Ͽ� ��ü�� ����ȯ ���α׷��� �ۼ��Ͻÿ�
		 * �����
		 * ������� Ÿ�÷ƴϱ�? (�θ���=1, �ڳ���=2)
		 * 2
		 * �ڳ��� Ÿ�� ���డ��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ���� Ÿ�÷ƴϱ�? (�θ���=1, �ڳ���=2) ");
		int sel = Integer.parseInt(sc.next());
		Pcar p;
		
		if(sel == 1) {
			p = new Pcar();
			p.drive();
		} else if(sel == 2) {
			p = new Ccar();
			p.drive();
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

}
