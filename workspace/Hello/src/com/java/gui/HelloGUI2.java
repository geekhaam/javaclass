package com.java.gui;

import java.awt.Frame;

//2. Frame ��ü�� ��ӹ޾� ���
public class HelloGUI2 extends Frame {
	
	public HelloGUI2(String title) {
		super(title); //�θ��� ������
		//super(title) : ���ڰ� �ִ� �θ��� ������ => Frame(title)
		//super.�Ӽ�
	}
	
	public static void main(String[] args) {
		HelloGUI2 h2 = new HelloGUI2("Hello GUI2");
		//��ü ���� + �ʱ�ġ => ������ �ʿ�
		
		h2.setSize(300, 300);
		h2.setVisible(true);
	}
}