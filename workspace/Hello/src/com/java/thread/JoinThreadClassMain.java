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
		 * tc.join(); //Thread�� ���������� ���
		 * System.out.println("JOIN THE THREAD");
		 */
		
		tc.join(3000);
		//���ڰ� �ִ� join�� �ϴ� ���ڸ�ŭ ���߾��ٰ� �Ʒ��� �����ͼ� ���� �����
		System.out.println("JOIN THE THREAD");

	}

}
