package ThreadJoin;

class ThreadClass2 extends Thread {
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("경석 : 빨리 먹어, 나 미래한테 가야되");
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
		System.out.println("미래 : 경석아 너 언제와");
		
		try {
			tc2.join();
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("미래 : 왔구나");
	}
	
}

public class ThreadJoinStory {

	public static void main(String[] args) {
		
		ThreadClass tc = new ThreadClass();
		tc.start();
		
		System.out.println("오늘은 스크린 야구장 가는날");
		//경석과 미래의 각각의 처지에서 만들것
		//물론 join을 사용한다.
	}

}
