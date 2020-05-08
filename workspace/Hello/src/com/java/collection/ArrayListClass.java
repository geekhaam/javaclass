package com.java.collection;

import java.util.ArrayList;
import java.util.Date;

/* Q) product, price �ʵ尡 �ִ� SMarket Ŭ������ �߰��� ����ÿ�
 * ��, ������ 2��, toString()�� ����ÿ�.
 */

class SMarket {
	private String product;
	private int price;
	
	public SMarket() {
		// Default Constructor
	}
	
	public SMarket(String product, int price) {
		super();
		this.product = product;
		this.price = price;
	}

	public String toString() {
		return "��ǰ�� " + product + "�̰�, ������ " + price + "�Դϴ�.";
	}
	
}

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		System.out.println(arr.size());
		
				//wrapper
		arr.add(new Integer(300)); //����
		arr.add(new Double(34.7)); //�Ǽ�
		arr.add("dayday"); //���ڿ�
		arr.add('��'); //char
		arr.add(new Date()); //���� ��ü
		
		arr.add(new SMarket("����", 1000));
		arr.add(new SMarket("��", 2000));
		
		for(int i=0;i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		//generic
		//�迭�� �÷����� ������ ���� ������
		//���� ���� �迭 + one data type
		
		ArrayList<String> arr1 = new ArrayList<String>();
		System.out.println(arr1.size());
		
		arr1.add("��");
		arr1.add("���");
		arr1.add("����");
		arr1.add("���");
		
		arr1.set(1, "����"); //����
		arr1.remove(2);	//����
		arr1.remove("��");
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		
		for(String str : arr1) {
			System.out.println(str);
		}
		
		
	}

}
