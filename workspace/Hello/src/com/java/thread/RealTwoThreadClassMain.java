package com.java.thread;

class ThreadClass1 extends Thread {
	public void run() {
		System.out.println(getName() + "\tRUN THREAD CLASS1");
	}
}

class ThreadClass2 extends Thread {
	public void run() {
		System.out.println(getName() + "\tRUN THREAD CLASS2");
	}
}

public class RealTwoThreadClassMain {

	public static void main(String[] args) {
		ThreadClass1 tc1 = new ThreadClass1();
		ThreadClass2 tc2 = new ThreadClass2();
		
		tc1.start();
		tc2.start();
	}

}
