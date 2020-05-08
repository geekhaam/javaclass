package com.java.review;

import java.util.ArrayList;

class Market {
	//1.
	private String sangpum_name;
	private int sangpum_price;
	private int sangpum_in;
	private int sangpum_out;
	
	public Market() {
		//default constructor
	}
	
	public Market(String sangpum_name, int sangpum_price, int sangpum_in, int sangpum_out) {
		super();
		this.sangpum_name = sangpum_name;
		this.sangpum_price = sangpum_price;
		this.sangpum_in = sangpum_in;
		this.sangpum_out = sangpum_out;
	}
	public String getSangpum_name() {
		return sangpum_name;
	}
	public void setSangpum_name(String sangpum_name) {
		this.sangpum_name = sangpum_name;
	}
	public int getSangpum_price() {
		return sangpum_price;
	}
	public void setSangpum_price(int sangpum_price) {
		this.sangpum_price = sangpum_price;
	}
	public int getSangpum_in() {
		return sangpum_in;
	}
	public void setSangpum_in(int sangpum_in) {
		this.sangpum_in = sangpum_in;
	}
	public int getSangpum_out() {
		return sangpum_out;
	}
	public void setSangpum_out(int sangpum_out) {
		this.sangpum_out = sangpum_out;
	}
	//2.
	public String toString() {
		return "��ǰ�� : "+this.sangpum_name+", ���� : "+this.sangpum_price
				+"\n�԰��� : "+this.sangpum_in+",����� : "+this.sangpum_out;
	}
	
	public String answerFive() {
		if(this.sangpum_in - this.sangpum_out > this.sangpum_out) {
			return this.sangpum_name;
		} else {
			return null;
		}
		
	}
	
}

public class Reveiw {
	
	public static String biggerThanMilli(Market m) {
		if(m.getSangpum_price() >= 10000) {
			return m.getSangpum_name();
		} else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		/* Q) ��ǰ �̸�, ����, �԰����� ����� ��ü �� �÷��ǿ� �ְ� ����� ����ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ�
		 * <����>
		 * 1. Ŭ������ Market ������ �ʵ����
		 * sangpum_name;
		 * sangpum_price;
		 * int sangpum_in;
		 * int sangpum_out;
		 * 2. ��¿� toString �ۼ�
		 * 3. ������ getter/setter�� �Է��� toString() ���
		 * ���� ������ ��� �Է��� toString() ���
		 * 4. ��ü�� ������ ���� Ȱ���Ͽ� �÷��ǿ� ��ü 5�� ���� �߰��� ���� ��
		 * getter/setter�� ��ü ���� ���
		 * 5. ��ǰ�� �԰������� ������� �� ���� ��������� ū ǰ���� ��ǰ���� ��� ����Ͻÿ�
		 * 6. ������ �Է¹޾� ������ 10000�̻��� ��ǰ�� ���
		 */
		
		Market milk = new Market();
		milk.setSangpum_name("����");
		milk.setSangpum_price(3000);
		milk.setSangpum_in(300);
		milk.setSangpum_out(100);
		
		Market bread = new Market("��", 5000, 400, 200);
		
		//3.
		System.out.println("---3. toString() Ȱ�� ���---");
		System.out.println(milk + "\n");
		System.out.println(bread);
		
		//4.
		Market water = new Market("��ټ�", 1500, 1000, 800);
		Market apple = new Market("��� 1�ڽ�", 15000, 200, 150);
		Market fish = new Market("������", 10000, 250, 50);
		
		ArrayList<Market> arr = new ArrayList<Market>();
		arr.add(milk);
		arr.add(bread);
		arr.add(water);
		arr.add(apple);
		arr.add(fish);
		
		System.out.println("\n---����4. �÷��ǿ� �־� ��ü ���---");
		for(Market m : arr) {
			System.out.println("��ǰ�� : " + m.getSangpum_name() + ", ���� : " + m.getSangpum_price());
			System.out.println("�԰��� : " + m.getSangpum_in() + ", ����� : " + m.getSangpum_out()+"\n");
		}
		
		//5.
		System.out.println("\n---����5. (�԰���-�����) > ����� �� ��ǰ---");
		for(Market m : arr) {
			if(m.answerFive() != null) {
				System.out.println(m.answerFive());
			}
		}
		
		
		//6.
		System.out.println("\n---����6. ������ 10000 �̻��� ��ǰ---");
		for(Market m : arr) {
			String result = biggerThanMilli(m);
			if(result != null) {
				System.out.println(result);
			}
		}
	}

}
