package ThreadJoin;

class ThreadClass4 extends Thread {
	
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("�漮 : ���� �Ծ�, �� �̷����� ���ߵ�");
			try {
				Thread.sleep(500);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class ThreadClass3 extends Thread {
	
	public void run() {
		ThreadClass4 tc4 = new ThreadClass4();
		tc4.start();
		System.out.println("�̷� : �漮�� �� ������");
		
		try {
			tc4.join(5000);
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("[�޸� ����] ������ �־ ���� ����");
		System.out.println("�漮�� �߱��� ����\n�޸� ���� �Ф�");
		System.exit(1); //���� ���� (���� ����:0 / ������ ����:0�� �ƴ� �ٸ� ��)
	}
	
}

public class ThreadJoinStory2 {

	public static void main(String[] args) {
		
		ThreadClass3 tc3 = new ThreadClass3();
		tc3.start();
		
		System.out.println("������ ��ũ�� �߱��� ���³�");
		//�漮�� �̷��� ������ ó������ �����
		//���� join�� ����Ѵ�.
	}

}
