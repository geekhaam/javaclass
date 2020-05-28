package com.java.thread;

class LoveGer implements Runnable {

	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Ich Liebe Dich");			
			try {
				Thread.sleep(200);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class LoveKor extends Thread {

	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("»ç¶ûÇÕ´Ï´Ù");			
			try {
				Thread.sleep(200);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class LoveThread {

	public static void main(String[] args) {
		LoveGer loveGer = new LoveGer();
		LoveKor loveKor = new LoveKor();
		
		Thread tGer = new Thread(loveGer);
		
		tGer.start();
		loveKor.start();
	}

}
