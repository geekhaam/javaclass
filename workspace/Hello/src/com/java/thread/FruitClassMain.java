package com.java.thread;

class Fruit1 extends Thread{
	private String name;
	
	public Fruit1() {
		// TODO Auto-generated constructor stub
	}
	
	public Fruit1(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name+"\t1개 주세요");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class FruitClassMain {

	public static void main(String[] args) {
		Fruit1 f1 = new Fruit1("사과");
		Fruit1 f2 = new Fruit1("배");
		Fruit1 f3 = new Fruit1("감");
		
		f1.start();
		f2.start();
		f3.start();
	}

}
