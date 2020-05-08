package com.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonClass extends JFrame {
	private ButtonGroup bg;
	private JRadioButton jradio1, jradio2, jradio3;
	
	public JRadioButtonClass() {
		bg = new ButtonGroup(); //3�� ��ư �� �ϳ��� ���� ǥ�� ���
		jradio1 = new JRadioButton("���� ����");
		jradio2 = new JRadioButton("�κ� ����");
		jradio3 = new JRadioButton("ģ�� ����");
		
		bg.add(jradio1); //��ư �׷����� �����ش�.
		bg.add(jradio2);
		bg.add(jradio3);
		jradio1.setSelected(true);//1st ��ư�� selected�� ����
		
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jradio1);
		getContentPane().add(jradio2);
		getContentPane().add(jradio3);
		
		this.setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JRadioButtonClass();
		

	}

}
