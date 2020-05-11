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
		return "[책이름]"+book_name+" [장르]"+book_genre+" [책가격]"+book_price+"원";
	}
	
}

public class BookstoreClass {
	
	//컬렉션 안에 있는 Bookstore 객체의 모든 정보 출력
	public static void showAll(ArrayList<Bookstore> arr) {
		for(Bookstore bs : arr) {
			if(bs.getBook_name().length() < 6) { //출력시 간격 맞추기 위해 조건문 사용
				System.out.println(bs.getBook_name()+"\t\t"+bs.getBook_genre()+"\t"+bs.getBook_price());
			} else {
				System.out.println(bs.getBook_name()+"\t"+bs.getBook_genre()+"\t"+bs.getBook_price());				
			}
		}
	}
	
	//장르 및 가격 입력하여 조건에 맞는 도서 이름 출력 및 검색된 도서 권수 반환
	public static int search(ArrayList<Bookstore> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 장르는? ");
		String genre = sc.next();
		System.out.print("검색할 가격은? ");
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
		//문항4
		Bookstore bs = new Bookstore();
		bs.setBook_name("자바 기초 프로그래밍");
		bs.setBook_genre("자기개발");
		bs.setBook_price(20000);
		System.out.println(bs);
		
		//문항5
		Bookstore bs1 = new Bookstore("별이빛나는밤에", "소설", 10000);
		System.out.println(bs1);
		
		//문항6 + 문항7
		Bookstore bs2 = new Bookstore("우리는 해낼수 있다", "자기개발", 12000);
		Bookstore bs3 = new Bookstore("파이썬기초", "자기개발", 15000);
		Bookstore bs4 = new Bookstore("나무와숲", "판타지", 20000);
		Bookstore bs5 = new Bookstore("나의연극인생", "자서전", 30000);
		Bookstore bs6 = new Bookstore("잠자는공주", "판타지", 15000);
		
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
		System.out.println("검색된 책은 모두 "+count+"권 입니다.");
	}

}
