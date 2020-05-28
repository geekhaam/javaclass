package com.java.thread;

class Fruit2 extends Thread{
	private String name;
	
	public Fruit2() {
		// TODO Auto-generated constructor stub
	}
	
	public Fruit2(String name) {
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

public class PriorityFruitClassMain {

	public static void main(String[] args) {
		Fruit2 f1 = new Fruit2("사과");
		Fruit2 f2 = new Fruit2("배");
		Fruit2 f3 = new Fruit2("감");
		
		//우선순위 : priority
		f1.setPriority(f1.MIN_PRIORITY); //1
		//f1.setPriority(2); //1-10
		f2.setPriority(f2.NORM_PRIORITY); //default 5
		f3.setPriority(f3.MAX_PRIORITY); //10
		
		System.out.println(f1.getPriority()+"\t"
							+f2.getPriority()+"\t"+f3.getPriority());
		
		f1.start();
		f2.start();
		f3.start();
	}

}
