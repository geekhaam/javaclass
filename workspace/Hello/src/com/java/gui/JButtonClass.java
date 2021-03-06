package com.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonClass extends JFrame {
	//awt와 달리 창을 닫는 기능은 기본으로 설정되어 있다.
	
	JButton jb1 = new JButton("사과");
	JButton jb2 = new JButton("배");
	JButton jb3 = new JButton("감");
	JButton jb4 = new JButton("귤");
	JButton jb5 = new JButton("포도");
	JButton jb6 = new JButton("자두");
	
	/*
	 * swing (4개의 pane)
	 *	JFrame
	 *		메뉴바
	 *			버튼, 글상자, ... => Component
	 *				Content Pane
	 *		* jdk1.5 이전에 반드시 content pane 사용
	 *		    이후 사용 안 하고 JFrame - 컴포넌트를 배치해도 됨 (알아서 content pane 인식) 
	 */
	public JButtonClass() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
						//중앙 정렬 - 가로로 배치
		getContentPane().add(jb1);
		getContentPane().add(jb2);
		getContentPane().add(jb3);
		getContentPane().add(jb4);
		getContentPane().add(jb5);
		getContentPane().add(jb6);
		
	}
	public static void main(String[] args) {
		JButtonClass jbc = new JButtonClass();
		
		jbc.setTitle("Button");
		jbc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//단, x 버튼으로 창문을 닫아도 프레임은 종료되었지만 실행 프로그램은 아직 종료 전임
		//따라서 위의 메소드를 추가하여 완전히 종료할 수 있다.
		jbc.setSize(300, 200);
		jbc.setVisible(true);
		
	}

}
