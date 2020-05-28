package com.java.thread;

class JoinThread extends Thread {
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("RUN THREAD");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinThreadClassMain {

	public static void main(String[] args) throws InterruptedException {
		JoinThread tc = new JoinThread();
		tc.start();
		
		System.out.println("START THREAD");
		/*
		 * tc.join(); //Thread가 끝날때까지 대기
		 * System.out.println("JOIN THE THREAD");
		 */
		
		tc.join(3000);
		//인자가 있는 join은 일단 인자만큼 멈추었다가 아래로 내려와서 먼저 수행됨
		System.out.println("JOIN THE THREAD");

	}

}
