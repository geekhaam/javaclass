package com.java.wb;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class CaptureClass extends JFrame implements ActionListener{
	
	private Button b1 = new Button("전체화면 캡쳐");
	Robot robot1; //키보드, 마우스 제어
	Dimension totWin1; //컴포넌트의 너비 - 높이
	//java.awt.Dimension
	Rectangle rect1;
	BufferedImage bImage1;
	
	public CaptureClass() throws AWTException, IOException {
		add(b1);
		b1.setVisible(true);
		b1.addActionListener(this);
		//jdk1.3부터 임시로 os 정도의 키보드, 마우스 제어 (버튼은 캡쳐 X)
		robot1 = new Robot();
		//Toolkit : OS 정보 조회, 자바 차원에서 화면 크기를 확인
		totWin1 = Toolkit.getDefaultToolkit().getScreenSize();
		
		//예) 1024 x 768 의 화면크기였다고 하면
		rect1 = new Rectangle((int)totWin1.getWidth(), (int)totWin1.getHeight());
									//1024 x 768 //rect1 = new Rectangle(1024, 768);
		
		//캡쳐 실행
		bImage1 = robot1.createScreenCapture(rect1);
		ImageIO.write(bImage1, "jpg", new File("D:/capture.jpg"));
		
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "전체 화면이 캡쳐되었습니다.\n저장 경로  D:/capture.jpg");
		}
		
	}
	
}

public class CaptureMainClass {

	public static void main(String[] args) throws AWTException, IOException {
		CaptureClass cc = new CaptureClass();

	}

}
