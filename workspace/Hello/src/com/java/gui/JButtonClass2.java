package com.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JButtonClass10 extends JFrame {

	JButton jb1 = new JButton("사과");
	JButton jb2 = new JButton("배");
	JButton jb3 = new JButton("감");
	JButton jb4 = new JButton("귤");
	JButton jb5 = new JButton("포도");
	JButton jb6 = new JButton("자두");
	
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
