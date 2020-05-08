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
		bg = new ButtonGroup(); //3개 버튼 중 하나만 선택 표시 출력
		jradio1 = new JRadioButton("가족 동반");
		jradio2 = new JRadioButton("부부 동반");
		jradio3 = new JRadioButton("친구 동반");
		
		bg.add(jradio1); //버튼 그룹으로 묶어준다.
		bg.add(jradio2);
		bg.add(jradio3);
		jradio1.setSelected(true);//1st 버튼을 selected로 선정
		
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
