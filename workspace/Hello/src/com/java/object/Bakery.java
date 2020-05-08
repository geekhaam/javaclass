package com.java.object;

class BBang { //���赵, (1)����
	private String bbang;	//�Ӽ� field : ���� => �������, ����Լ�
	private String price;
	//���� ������ access modifier
	//private : ���� Ŭ���������� ���� ����
	//public : �ܺ� Ŭ���������� ���� ����
	//(default) : ���� ��Ű������ ���� ���� 
	//protected : ��� ���� �ִ� Ŭ���������� ���� ����
	public BBang() {
		// Default Constructor
	}
	public BBang(String bbang, String price) {
		super();
		this.bbang = bbang;
		this.price = price;
	}
	public String getBbang() {
		return bbang;
	}
	public void setBbang(String bbang) {
		this.bbang = bbang;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void yummy() {
		System.out.println("���� ���ְ� ����");
	}
	public void printAll() {
		System.out.println("�������� " + bbang + "�̰� ������ " + price);
	}
	public String toString() { //Object�� toString() �޼ҵ� overriding
		return "�������� " + bbang + "�̰� ������ " + price;
	}
}

public class Bakery {
	
	public static void main(String[] args) {
		/* ������(Bakery-BBang Ŭ����)���� �������� ������ �׸��� "���� ���ְ� ����"
		  �� �����ϴ� �޼ҵ带 �����Ͽ� ��Ϸ��� �Ѵ�.
		  �̿� ���� OOP�� �ۼ��Ͻÿ�
		  (���)
		  ���ڻ� 2000��
		  �Һ��继 1000��
		  ���� ���ְ� ����*/
		 
		BBang p = new BBang(); // (2)���� - Constructor �̿�
		p.setBbang("���ڻ�");
		p.setPrice("3000��");
		
		BBang s = new BBang("�Һ��继", "1000��");
		
		System.out.println(p.getBbang() + " " + p.getPrice() + "\n"
				+ s.getBbang() + " " + s.getPrice());
		p.printAll();
		p.yummy();
		
		//toString ���
		System.out.println(s.toString());
		System.out.println(s); // toString�� ���� �����ϴ�.
		//���ڿ�
		//��ü�� �θ� Ŭ���� Object - �Ӽ�, �޼ҵ�(toString())

	}

}
