package ThreadJoin;

class ThreadClass2 extends Thread {
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("�漮 : ���� �Ծ�, �� �̷����� ���ߵ�");
			try {
				Thread.sleep(500);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class ThreadClass extends Thread {
	
	public void run() {
		ThreadClass2 tc2 = new ThreadClass2();
		tc2.start();
		System.out.println("�̷� : �漮�� �� ������");
		
		try {
			tc2.join();
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�̷� : �Ա���");
	}
	
}

public class ThreadJoinStory {

	public static void main(String[] args) {
		
		ThreadClass tc = new ThreadClass();
		tc.start();
		
		System.out.println("������ ��ũ�� �߱��� ���³�");
		//�漮�� �̷��� ������ ó������ �����
		//���� join�� ����Ѵ�.
	}

}
