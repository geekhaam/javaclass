package com.java.gui;

import java.awt.*;

//1. awt�� import�Ͽ� Frame ��ü ���
public class HelloGUI { //dosȭ��		//extends Frame

	public static void main(String[] args) {
		Frame f1 = new Frame(); //����Ŭ����, java.awt
		f1.setTitle("Hello GUI");

		f1.setSize(700, 700); //pixel = picture element
		f1.setVisible(true);
		//ctrl+alt+del ���� �ش� ���μ��� stop
	}

}
