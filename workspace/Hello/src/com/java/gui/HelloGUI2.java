package com.java.gui;

import java.awt.Frame;

//2. Frame 객체를 상속받아 사용
public class HelloGUI2 extends Frame {
	
	public HelloGUI2(String title) {
		super(title); //부모의 생성자
		//super(title) : 인자가 있는 부모의 생성자 => Frame(title)
		//super.속성
	}
	
	public static void main(String[] args) {
		HelloGUI2 h2 = new HelloGUI2("Hello GUI2");
		//객체 생성 + 초기치 => 생성자 필요
		
		h2.setSize(300, 300);
		h2.setVisible(true);
	}
}
