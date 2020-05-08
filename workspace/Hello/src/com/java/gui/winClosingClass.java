package com.java.gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class winClosingClass extends Frame {
	
	//extends Frame implements WindowListener
	//-> �̺�Ʈ�� ���� ������ ����
	
	public winClosingClass() {
		//WindowListner�� interface�� 7���� overriding �޼ҵ带 ������ �ִ�.
		//Listener ��ſ� Adapter�� ����ϸ� ��� overriding �� �ʿ� ���� ���ϴ� �޼ҵ带 �����Ͽ� ����� �� �ִ�.
		addWindowListener(new WindowAdapter() { //Listener�� ������ event
			public void windowClosing(WindowEvent e) { //method
				dispose(); //���� frame ����
				System.exit(0); //jvm ����
			}
		});
	}
	
	public static void main(String[] args) {
		
		winClosingClass bc = new winClosingClass();
		//���� ���� �����ڸ� ������ش�.
		//�����ڸ� ���� ���� ã�ư��Ƿ� �����ڿ� â�� �ݴ� ������ ������ش�.
		bc.setSize(500, 500);
		bc.setTitle("Closing Window");
		bc.setLayout(null); //no Layout
		bc.setVisible(true);
		
	}
}