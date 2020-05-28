package com.java.thread.analogClock;

import java.awt.BasicStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class Clock extends Frame implements ActionListener {

	/* 1���� = ������ �������� ȣ�� ���̰� 1:1 ���� ���, �� 57.4��
��	 * �� ��, 180���� ���� ����
	 * �׷��Ƿ� 1�� ���� 180/����
	 */
	
	private Button b1 = new Button("PUSH");
	
	static int r1, cX, cY, numX, numY, secX, secY, minX, minY, hourX, hourY;
	static int hour, minute, sec;
	
	public Clock() {
		this.setLayout(null);
		b1.setSize(100, 70);
		b1.setForeground(new Color(0, 0, 255));
		b1.setBackground(new Color(255, 180, 100));
		b1.setFont(new Font("����", Font.BOLD, 20));
		b1.setLocation(50, 50);
		this.add(b1);
		b1.addActionListener(this);
		
		this.setBackground(new Color(255, 255, 0));
		this.setTitle("Analog Clock");
		this.setSize(1100,1000);
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);
			}
		});
		
	}
	
	public void paint(Graphics g) {
		Date d1 = new Date();
		hour = d1.getHours();
		minute = d1.getMinutes();
		sec = d1.getSeconds();
		
		g.setColor(Color.PINK);
		g.fillOval(300, 300, 500, 500);
		//g.drawOval(300, 500, 500, 500);
		
		g.setColor(Color.BLACK);
		g.fillOval(540, 540, 20, 20);
		
		
		r1 = 200; //�ð� ���� �߽����κ����� ���� 
		cX = 300+500/2; //���� �߽� X 300+250=550
		cY = 300+500/2; //���� �߽� Y 300+250=550
		
		//1 ~ 12�� �ֱ�
		g.setFont(new Font("����",Font.BOLD, 42));
		g.setColor(Color.BLACK);
		
		for(int i=1; i<=12; i++) {
			numX = cX+(int)(180*Math.sin(i*30*Math.PI/180)); //��ǥ���� x�� ���� ���
			numY = cY-(int)(180*Math.cos(i*30*Math.PI/180)); //��ǥ���� y�� ���� ���
			g.drawString(""+i, numX-10, numY+10);
		}
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(3)); //��ħ, ��ħ, ��ħ�� ���⸦ 3����
		
		//��ħ
		secX = cX+(int)(180*Math.sin(sec*6*Math.PI/180)); //��ħ ���� 180
		secY = cY-(int)(180*Math.cos(sec*6*Math.PI/180));
		g.setColor(Color.BLUE);
		g.drawLine(cX, cY, secX, secY);
		
		//��ħ
		minX = cX+(int)(150*Math.sin((minute*6+sec/10)*Math.PI/180));
		minY = cY-(int)(150*Math.cos((minute*6+sec/10)*Math.PI/180));
		g.setColor(Color.green);
		g.drawLine(cX, cY, minX, minY);
		
		//��ħ
		hourX = cX+(int)(110*Math.sin((hour*30+minute/2)*Math.PI/180));
		hourY = cY-(int)(110*Math.cos((hour*30+minute/2)*Math.PI/180));
		g.setColor(Color.RED);
		g.drawLine(cX, cY, hourX, hourY);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			b1.setEnabled(false);
		}
		Timer t1 = new Timer();
		t1.scheduleAtFixedRate(new TimerTask() {	
			@Override
			public void run() {
				repaint(); //1�ʸ��� repaint	
			}
		}, 1000, 1000); //1�� �Ŀ� 1�� ��������
		
	}
}

public class ClockGUI {

	public static void main(String[] args) {
		Clock cl = new Clock();

	}

}