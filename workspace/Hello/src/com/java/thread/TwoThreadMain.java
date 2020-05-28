package com.java.thread;

class ThreadClass0 extends Thread {
	
	public void run() {
		System.out.println(getName() + "\tRUN THREAD");
	}
}

public class TwoThreadMain {

	public static void main(String[] args) {
		ThreadClass0 tc1 = new ThreadClass0();
		ThreadClass0 tc2 = new ThreadClass0();
		tc1.start();
		tc2.start();
	}

}
