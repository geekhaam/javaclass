package com.java.thread;

class RunnableClass2 implements Runnable {
	public void run() {
		while(true) {
			System.out.println("INFINITE LOOP");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("**5�� �Ŀ� ����**");
	}
}

public class InterruptThreadClass {

	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new RunnableClass2());
		th1.start();
		
		Thread.sleep(5000);
		//5�� �Ŀ� interrupt�Ǿ� Thread ����
		
		th1.interrupt(); //Thread Stop
	}

}