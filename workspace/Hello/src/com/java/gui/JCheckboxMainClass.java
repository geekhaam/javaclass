package com.java.gui;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckboxMainClass extends JFrame {
	private JPanel jp;
	private JCheckBox jcb1, jcb2, jcb3;
	
	public JCheckboxMainClass() {
		jp = new JPanel();
		jcb1 = new JCheckBox("회원카드 보유", true);
		jcb2 = new JCheckBox("장기 회원", true);
		jcb3 = new JCheckBox("해외 여행 신청 여부", true);
		
		jp.add(jcb1); //컴포넌트 패널 위로 add
		jp.add(jcb2);
		jp.add(jcb3);
		getContentPane().add(jp); //패널을 Content Pane에 add
	}
	
	public static void main(String[] args) {
		JCheckboxMainClass jcbc = new JCheckboxMainClass();
		jcbc.setTitle("Check Box");
		jcbc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jcbc.setSize(500, 500);
		jcbc.setVisible(true);

	}

}
