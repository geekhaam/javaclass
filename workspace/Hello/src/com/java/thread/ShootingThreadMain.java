package com.java.thread;

class ThreadClass3 extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName() + "FIRE!!");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadClass4 extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName() + "Somebody help me!!");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ShootingThreadMain {

	public static void main(String[] args) {
		ThreadClass3 tc3 = new ThreadClass3();
		ThreadClass4 tc4 = new ThreadClass4();
		
		tc3.start();
		tc4.start();

	}

}
