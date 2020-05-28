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
	
	private Button b1 = new Button("��üȭ�� ĸ��");
	Robot robot1; //Ű����, ���콺 ����
	Dimension totWin1; //������Ʈ�� �ʺ� - ����
	//java.awt.Dimension
	Rectangle rect1;
	BufferedImage bImage1;
	
	public CaptureClass() throws AWTException, IOException {
		add(b1);
		b1.setVisible(true);
		b1.addActionListener(this);
		//jdk1.3���� �ӽ÷� os ������ Ű����, ���콺 ���� (��ư�� ĸ�� X)
		robot1 = new Robot();
		//Toolkit : OS ���� ��ȸ, �ڹ� �������� ȭ�� ũ�⸦ Ȯ��
		totWin1 = Toolkit.getDefaultToolkit().getScreenSize();
		
		//��) 1024 x 768 �� ȭ��ũ�⿴�ٰ� �ϸ�
		rect1 = new Rectangle((int)totWin1.getWidth(), (int)totWin1.getHeight());
									//1024 x 768 //rect1 = new Rectangle(1024, 768);
		
		//ĸ�� ����
		bImage1 = robot1.createScreenCapture(rect1);
		ImageIO.write(bImage1, "jpg", new File("D:/capture.jpg"));
		
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "��ü ȭ���� ĸ�ĵǾ����ϴ�.\n���� ���  D:/capture.jpg");
		}
		
	}
	
}

public class CaptureMainClass {

	public static void main(String[] args) throws AWTException, IOException {
		CaptureClass cc = new CaptureClass();

	}

}