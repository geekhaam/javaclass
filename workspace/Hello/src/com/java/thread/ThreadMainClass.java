package com.java.thread;

class ThreadClass extends Thread {
	
	public void run() {
		System.out.println("RUN THREAD");
	}
}

public class ThreadMainClass {

	public static void main(String[] args) {
		ThreadClass tc = new ThreadClass();
		tc.start();
		System.out.println("START THREAD");

	}

}
