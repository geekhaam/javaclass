package com.java.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

//JavaFX -> xml�� �ڵ� -> tool : SceneBuilder
//Swing -> tool : WindowBuilder (���� �ð��� ����� tool)

class JFileChooserClass extends JFrame implements ActionListener{
	
	JFileChooser jfilechooser;
	JButton jbutton1, jbutton2;
	JLabel jlabel;
	
	public JFileChooserClass() {
		setLayout(new FlowLayout());
		
		jfilechooser = new JFileChooser("D:");
		
		jbutton1 = new JButton("���� ����");
		add(jbutton1); //contentPane ��� �ȴ�.
		jbutton1.addActionListener(this); //��ư1 �̺�Ʈ ���
		
		jbutton2 = new JButton("���� ����");
		add(jbutton2);
		jbutton2.addActionListener(this); //��ư2 �̺�Ʈ ���
		
		jlabel = new JLabel("���� ���");
		add(jlabel);
		
		setSize(700, 700);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbutton1) {
			int isOpenClose = jfilechooser.showOpenDialog(jbutton1);
			//���� ���ÿ� ���� ��ȯ��				//����-������ Ž����
			File filePath = jfilechooser.getSelectedFile();//��� + ����
			
			//���������� ������ �����ߴ��� üũ
			if(isOpenClose == JFileChooser.APPROVE_OPTION) { //0�� ����, 1�� ����
							// == �ƴϸ� ��Ҹ� �����ų� �ٸ� ������ �߻��� �����
				jlabel.setText("���� ��� �� �̸� : " + filePath); //getText() ����
				System.out.println(filePath);
			}
		}
		if(e.getSource() == jbutton2) {
			int isOpenClose = jfilechooser.showSaveDialog(jbutton2);
			File dirPath = jfilechooser.getSelectedFile();
			//String fileString = jfilechooser.getSelectedFile().getName(); => ���� �̸���
			if(isOpenClose == JFileChooser.APPROVE_OPTION) {
				jlabel.setText("������ ��� �� �̸� : " + dirPath);
				System.out.println(dirPath);
			}
		}
		
	}
	
}

public class JFileChooserMainClass {

	public static void main(String[] args) {
		new JFileChooserClass();

	}

}