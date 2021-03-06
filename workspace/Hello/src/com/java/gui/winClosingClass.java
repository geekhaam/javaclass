package com.java.gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class winClosingClass extends Frame {
	
	//extends Frame implements WindowListener
	//-> 이벤트시 자주 나오는 문장
	
	public winClosingClass() {
		//WindowListner는 interface로 7개의 overriding 메소드를 가지고 있다.
		//Listener 대신에 Adapter를 사용하면 모두 overriding 할 필요 없이 원하는 메소드를 정의하여 사용할 수 있다.
		addWindowListener(new WindowAdapter() { //Listener가 나오면 event
			public void windowClosing(WindowEvent e) { //method
				dispose(); //현재 frame 종료
				System.exit(0); //jvm 종료
			}
		});
	}
	
	public static void main(String[] args) {
		
		winClosingClass bc = new winClosingClass();
		//인자 없는 생성자를 만들어준다.
		//생성자를 젱리 먼저 찾아가므로 생성자에 창을 닫는 로직을 만들어준다.
		bc.setSize(500, 500);
		bc.setTitle("Closing Window");
		bc.setLayout(null); //no Layout
		bc.setVisible(true);
		
	}
}
