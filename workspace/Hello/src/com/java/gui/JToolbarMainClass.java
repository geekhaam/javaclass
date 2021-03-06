package com.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

class JToolbarClass extends JFrame implements ActionListener {
	private JButton b1, b2, b3, b4, b5;
	private JLabel lab;
	private JToolBar tb;
	
	public JToolbarClass() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		tb = new JToolBar();
		
		b1 = new JButton("Font Color Red", new ImageIcon("D:/Java_Web_PM_Class_JB/img/color1.png"));
		b1.addActionListener(this);
		tb.add(b1);
		
		b2 = new JButton("Font Color Green", new ImageIcon("D:/Java_Web_PM_Class_JB/img/color2.png"));
		b2.addActionListener(this);
		tb.add(b2);
		
		b3 = new JButton("Font Size\n30", new ImageIcon("D:/Java_Web_PM_Class_JB/img/font1.png"));
		b3.addActionListener(this);
		tb.add(b3);
		
		b4 = new JButton("Font Size\n50", new ImageIcon("D:/Java_Web_PM_Class_JB/img/font2.png"));
		b4.addActionListener(this);
		tb.add(b4);
		
		b5 = new JButton("STOP", new ImageIcon("D:/Java_Web_PM_Class_JB/img/STOP.png"));
		b5.addActionListener(this);
		tb.add(b5);
		
		this.add(tb);
		tb.setVisible(true);
		
		lab = new JLabel("JToolbar Ȱ���Ͽ� ���� �� �� ���� ũ�� �ٲٱ�");
		lab.setFont(new Font("����������",Font.BOLD, 20));
		this.add(lab);
		
		setSize(1600, 400);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			lab.setForeground(Color.RED);
		}
		else if(e.getSource() == b2) {
			lab.setForeground(Color.GREEN);
		}
		else if(e.getSource() == b3) {
			lab.setFont(new Font("����������",Font.BOLD, 30));
		}
		else if(e.getSource() == b4) {
			lab.setFont(new Font("����������",Font.BOLD, 50));
		}
		else if(e.getSource() == b5) {
			System.exit(0);
		}
	}
	
}

public class JToolbarMainClass {

	public static void main(String[] args) {
		new JToolbarClass();

	}

}
