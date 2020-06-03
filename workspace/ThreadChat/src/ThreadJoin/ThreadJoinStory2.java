package ThreadJoin;

class ThreadClass4 extends Thread {
	
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("경석 : 빨리 먹어, 나 미래한테 가야되");
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
		System.out.println("미래 : 경석아 너 언제와");
		
		try {
			tc4.join(5000);
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("[메모 남김] 급한일 있어서 먼저 갈게");
		System.out.println("경석이 야구장 도착\n메모 본후 ㅠㅠ");
		System.exit(1); //강제 종료 (정상 종료:0 / 비정상 종료:0이 아닌 다른 수)
	}
	
}

public class ThreadJoinStory2 {

	public static void main(String[] args) {
		
		ThreadClass3 tc3 = new ThreadClass3();
		tc3.start();
		
		System.out.println("오늘은 스크린 야구장 가는날");
		//경석과 미래의 각각의 처지에서 만들것
		//물론 join을 사용한다.
	}

}
