package com.java.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/* event ó�� ����
��ư�� �̺�Ʈ�� �ش�ȴٴ� ǥ�� : addActionListner() => ��ư, �޴�, ����Ʈ
(����) WindowEvent ==> ������ �ִ�ȭ, �ּ�ȭ �� ������� ���õ� �̺�Ʈ
	  MouseEvent  ==> ���콺 Ŭ��, move, ...
��ư ����(�̺�Ʈ) - JVM - �̺�Ʈ ó�� �޼ҵ�(event handler) */
public class JTextAreaClass extends JFrame implements ActionListener{
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JTextArea jta = new JTextArea();
	
	public JTextAreaClass() {
		jb.addActionListener(this); //�̺�Ʈ ���, jb�� �̺�Ʈ ���
		jp.add(jb); //�гο�  add
		
		jta.append("Text Area�� ���� �ֱ�");
		jta.setCaretPosition(0); //Ŀ���� �� ó������
		//int endOfContent = jta.getText().length();
		//jta.setCarePosition(endOfContent); //Ŀ���� �� �ڷ�
		jp.add(jta);
		
		getContentPane().add(jp);
		//JPanel�� Container�� ���� JFrame�� add�Ѵ�.
	}	
	
	//button Ŭ��  - �̺�Ʈ �߻� - JVM - �Ʒ� ó�� �Լ� ����
	@Override //�̺�Ʈ ó�� �޼ҵ�
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb) {
			jta.select(3, 7); //�� ������ ĥ�ϰ� Ŀ���� ĥ�� �κ� ���� ��ġ�� (>=3 && <7)
			jta.requestFocus(); //�� �޼ҵ尡 �־�� ĥ�� �κ��� ���δ�.
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