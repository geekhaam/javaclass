package com.java.thread;

//Thread�� ����ϴ� �ι�° ��� : implements Runnable
class RunnableClass implements Runnable {

	public void run() {
		System.out.println("Runnable");
		
	}
	
}

public class RunnableMain {

	public static void main(String[] args) {
		RunnableClass rc1 = new RunnableClass();
		//implements Runnable
		
		//extends Thread
		Thread th1 = new Thread(rc1);
		
		th1.start();

	}

}
