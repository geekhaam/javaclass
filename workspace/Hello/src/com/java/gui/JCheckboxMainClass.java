package com.java.gui;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckboxMainClass extends JFrame {
	private JPanel jp;
	private JCheckBox jcb1, jcb2, jcb3;
	
	public JCheckboxMainClass() {
		jp = new JPanel();
		jcb1 = new JCheckBox("ȸ��ī�� ����", true);
		jcb2 = new JCheckBox("��� ȸ��", true);
		jcb3 = new JCheckBox("�ؿ� ���� ��û ����", true);
		
		jp.add(jcb1); //������Ʈ �г� ���� add
		jp.add(jcb2);
		jp.add(jcb3);
		getContentPane().add(jp); //�г��� Content Pane�� add
	}
	
	public static void main(String[] args) {
		JCheckboxMainClass jcbc = new JCheckboxMainClass();
		jcbc.setTitle("Check Box");
		jcbc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jcbc.setSize(500, 500);
		jcbc.setVisible(true);

	}

}
