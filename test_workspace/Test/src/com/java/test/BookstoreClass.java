package com.java.test;

import java.util.ArrayList;
import java.util.Scanner;

class Bookstore {
	private String book_name;
	private String book_genre;
	private int book_price;
	
	public Bookstore() {
		// Default Constructor
	}
	
	public Bookstore(String book_name, String book_genre, int book_price) {
		super();
		this.book_name = book_name;
		this.book_genre = book_genre;
		this.book_price = book_price;
	}
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	public String toString() {
		return "[å�̸�]"+book_name+" [�帣]"+book_genre+" [å����]"+book_price+"��";
	}
	
}

public class BookstoreClass {
	
	//�÷��� �ȿ� �ִ� Bookstore ��ü�� ��� ���� ���
	public static void showAll(ArrayList<Bookstore> arr) {
		for(Bookstore bs : arr) {
			if(bs.getBook_name().length() < 6) { //��½� ���� ���߱� ���� ���ǹ� ���
				System.out.println(bs.getBook_name()+"\t\t"+bs.getBook_genre()+"\t"+bs.getBook_price());
			} else {
				System.out.println(bs.getBook_name()+"\t"+bs.getBook_genre()+"\t"+bs.getBook_price());				
			}
		}
	}
	
	//�帣 �� ���� �Է��Ͽ� ���ǿ� �´� ���� �̸� ��� �� �˻��� ���� �Ǽ� ��ȯ
	public static int search(ArrayList<Bookstore> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �帣��? ");
		String genre = sc.next();
		System.out.print("�˻��� ������? ");
		int price = Integer.parseInt(sc.next());
		
		int count = 0;
		for(Bookstore bs : arr) {
			if(genre.equals(bs.getBook_genre()) && bs.getBook_price() >= price) {
				System.out.println(bs.getBook_name());
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		//����4
		Bookstore bs = new Bookstore();
		bs.setBook_name("�ڹ� ���� ���α׷���");
		bs.setBook_genre("�ڱⰳ��");
		bs.setBook_price(20000);
		System.out.println(bs);
		
		//����5
		Bookstore bs1 = new Bookstore("���̺����¹㿡", "�Ҽ�", 10000);
		System.out.println(bs1);
		
		//����6 + ����7
		Bookstore bs2 = new Bookstore("�츮�� �س��� �ִ�", "�ڱⰳ��", 12000);
		Bookstore bs3 = new Bookstore("���̽����", "�ڱⰳ��", 15000);
		Bookstore bs4 = new Bookstore("�����ͽ�", "��Ÿ��", 20000);
		Bookstore bs5 = new Bookstore("���ǿ����λ�", "�ڼ���", 30000);
		Bookstore bs6 = new Bookstore("���ڴ°���", "��Ÿ��", 15000);
		
		ArrayList<Bookstore> arr = new ArrayList<Bookstore>();
		arr.add(bs);
		arr.add(bs1);
		arr.add(bs2);
		arr.add(bs3);
		arr.add(bs4);
		arr.add(bs5);
		arr.add(bs6);
		
		showAll(arr);
		System.out.println();
		
		int count = search(arr);
		System.out.println("�˻��� å�� ��� "+count+"�� �Դϴ�.");
	}

}
