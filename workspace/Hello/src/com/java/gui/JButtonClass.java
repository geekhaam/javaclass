package com.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonClass extends JFrame {
	//awt�� �޸� â�� �ݴ� ����� �⺻���� �����Ǿ� �ִ�.
	
	JButton jb1 = new JButton("���");
	JButton jb2 = new JButton("��");
	JButton jb3 = new JButton("��");
	JButton jb4 = new JButton("��");
	JButton jb5 = new JButton("����");
	JButton jb6 = new JButton("�ڵ�");
	
	/*
	 * swing (4���� pane)
	 *	JFrame
	 *		�޴���
	 *			��ư, �ۻ���, ... => Component
	 *				Content Pane
	 *		* jdk1.5 ������ �ݵ�� content pane ���
	 *		    ���� ��� �� �ϰ� JFrame - ������Ʈ�� ��ġ�ص� �� (�˾Ƽ� content pane �ν�) 
	 */
	public JButtonClass() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
						//�߾� ���� - ���η� ��ġ
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
		//��, x ��ư���� â���� �ݾƵ� �������� ����Ǿ����� ���� ���α׷��� ���� ���� ����
		//���� ���� �޼ҵ带 �߰��Ͽ� ������ ������ �� �ִ�.
		jbc.setSize(300, 200);
		jbc.setVisible(true);
		
	}

}