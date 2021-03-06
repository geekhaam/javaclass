package com.java.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/* event 처리 과정
버튼이 이벤트에 해당된다는 표시 : addActionListner() => 버튼, 메뉴, 리스트
(참고) WindowEvent ==> 윈도우 최대화, 최소화 등 윈도우와 관련된 이벤트
	  MouseEvent  ==> 마우스 클릭, move, ...
버튼 누름(이벤트) - JVM - 이벤트 처리 메소드(event handler) */
public class JTextAreaClass extends JFrame implements ActionListener{
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JTextArea jta = new JTextArea();
	
	public JTextAreaClass() {
		jb.addActionListener(this); //이벤트 등록, jb는 이벤트 대상
		jp.add(jb); //패널에  add
		
		jta.append("Text Area에 글자 넣기");
		jta.setCaretPosition(0); //커서를 맨 처음으로
		//int endOfContent = jta.getText().length();
		//jta.setCarePosition(endOfContent); //커서를 맨 뒤로
		jp.add(jta);
		
		getContentPane().add(jp);
		//JPanel은 Container를 거쳐 JFrame에 add한다.
	}	
	
	//button 클릭  - 이벤트 발생 - JVM - 아래 처리 함수 동작
	@Override //이벤트 처리 메소드
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb) {
			jta.select(3, 7); //이 범위를 칠하고 커서는 칠한 부분 끝에 위치함 (>=3 && <7)
			jta.requestFocus(); //이 메소드가 있어야 칠한 부분이 보인다.
		}
		
	}
	
	public static void main(String[] args) {
		JTextAreaClass jtac = new JTextAreaClass();
		
		jtac.setTitle("Text Area");
		jtac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtac.setSize(1000, 700);
		jtac.setVisible(true);

	}

	

}
