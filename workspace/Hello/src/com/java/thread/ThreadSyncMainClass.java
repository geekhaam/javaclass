package com.java.thread;


class ThreadSyncClass {
	public synchronized void say(String something) throws InterruptedException {
		char[] sthChar = something.toCharArray();
		for(char c : sthChar) {
			System.out.print(c);
			Thread.sleep(100);
		}
		System.out.println();
	}
	
	public synchronized void say2(String something) throws InterruptedException {
		char[] sthChar = something.toCharArray();
		for(char c : sthChar) {
			System.out.print(c);
			Thread.sleep(100);
		}
		System.out.println();
	}
}

public class ThreadSyncMainClass extends Thread {
	
	private String name;
	private static ThreadSyncClass tsc1 = new ThreadSyncClass();
			//ThreadSyncClass는 synchronized할 클래스
	public ThreadSyncMainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public ThreadSyncMainClass(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		if(name.equals("준범")) {
			try {
				tsc1.say("안녕");
			} catch(InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(name.equals("정구")) {
			try {
				tsc1.say2("하이");
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		ThreadSyncMainClass smc1 = new ThreadSyncMainClass("준범");
		ThreadSyncMainClass smc2 = new ThreadSyncMainClass("정구");
		
		smc1.start();
		smc2.start();

	}

}
