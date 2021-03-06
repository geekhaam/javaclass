package com.java.review;

import java.util.ArrayList;
import java.util.Scanner;

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
		return "상품명 : "+this.sangpum_name+", 가격 : "+this.sangpum_price
				+"\n입고량 : "+this.sangpum_in+",출고량 : "+this.sangpum_out;
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
	
	public static String biggerThanMil(Market m) {
		if(m.getSangpum_price() >= 1000) {
			return m.getSangpum_name();
		} else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		/* Q) 상품 이름, 가격, 입고량과 출고량 객체 및 컬렉션에 넣고 결과를 출력하는 자바 프로그램을 작성하시오
		 * <조건>
		 * 1. 클래스명 Market 각각의 필드명은
		 * sangpum_name;
		 * sangpum_price;
		 * int sangpum_in;
		 * int sangpum_out;
		 * 2. 출력용 toString 작성
		 * 3. 우유는 getter/setter로 입력후 toString() 출력
		 * 빵은 생성자 사용 입력후 toString() 출력
		 * 4. 객체의 생성자 등을 활용하여 컬렉션에 객체 5개 정도 추가로 넣은 후
		 * getter/setter로 전체 내용 출력
		 * 5. 상품의 입고량에서 출고량을 뺀 값이 출고량보다 큰 품목의 상품명을 모두 출력하시오
		 * 6. 가격을 입력받아 입력 받은 가격보다 가격이 큰 상품명 출력
		 */
		
		Market milk = new Market();
		milk.setSangpum_name("우유");
		milk.setSangpum_price(3000);
		milk.setSangpum_in(300);
		milk.setSangpum_out(100);
		
		Market bread = new Market("빵", 5000, 400, 200);
		
		//3.
		System.out.println("---문제3. toString() 활용 출력---");
		System.out.println(milk + "\n");
		System.out.println(bread);
		
		//4.
		Market water = new Market("삼다수", 1500, 1000, 800);
		Market apple = new Market("사과 1박스", 15000, 200, 150);
		Market fish = new Market("물고기", 10000, 250, 50);
		
		ArrayList<Market> arr = new ArrayList<Market>();
		arr.add(milk);
		arr.add(bread);
		arr.add(water);
		arr.add(apple);
		arr.add(fish);
		
		System.out.println("\n---문제4. 컬렉션에 넣어 전체 출력---");
		for(Market m : arr) {
			System.out.println("상품명 : " + m.getSangpum_name() + ", 가격 : " + m.getSangpum_price());
			System.out.println("입고량 : " + m.getSangpum_in() + ", 출고량 : " + m.getSangpum_out()+"\n");
		}
		
		//5.
		System.out.println("\n---문제5. (입고량-출고량) > 출고량 인 상품---");
		for(Market m : arr) {
			if(m.answerFive() != null) {
				System.out.println(m.answerFive());
			}
		}
		
		
		//6.
		System.out.println("\n---문제6. 가격이 입력 받은 가격 이상인 상품---");
		Scanner sc = new Scanner(System.in);
		System.out.print("가격을 입력하세요 : ");
		int price = Integer.parseInt(sc.next());
		
		for(Market m : arr) {
			if(m.getSangpum_price() > price) {
				System.out.println(m.getSangpum_name());
			}
		}
	}

}

