package com.java.gui;

import java.awt.*;

//1. awt를 import하여 Frame 객체 사용
public class HelloGUI { //dos화면		//extends Frame

	public static void main(String[] args) {
		Frame f1 = new Frame(); //내장클래스, java.awt
		f1.setTitle("Hello GUI");

		f1.setSize(700, 700); //pixel = picture element
		f1.setVisible(true);
		//ctrl+alt+del 에서 해당 프로세스 stop
	}

}
