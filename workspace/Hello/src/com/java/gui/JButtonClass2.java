package com.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JButtonClass10 extends JFrame {

	JButton jb1 = new JButton("���");
	JButton jb2 = new JButton("��");
	JButton jb3 = new JButton("��");
	JButton jb4 = new JButton("��");
	JButton jb5 = new JButton("����");
	JButton jb6 = new JButton("�ڵ�");
	
	public JButtonClass10() {
		getContentPane().setBackground(Color.YELLOW);
		getContentPane().setLayout(new FlowLayout());
		
		getContentPane().add(jb1);
		getContentPane().add(jb2);
		getContentPane().add(jb3);
		getContentPane().add(jb4);
		getContentPane().add(jb5);
		getContentPane().add(jb6);
		
		this.setTitle("Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
}

public class JButtonClass2 {

	public static void main(String[] args) {
		new JButtonClass10();

	}

}