package com.java.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

class BaseComponents extends JFrame{
	
	JLabel jlabel;
	JTextField jtextfield; //�� ��
	
	JButton jbutton;
	JComboBox jcombo; //JTextField + JList
	JList jlist;
	
	public BaseComponents() {
		getContentPane().setLayout(new GridLayout(0, 2, 20, 20));
		//���� �� 2���� �׸��� ���� ���� ������ ���� 20�ȼ�
		jlabel = new JLabel("�� �� ��");
		getContentPane().add(jlabel);
		
		jtextfield = new JTextField("���� �־��");
		getContentPane().add(jtextfield);
		
		String [] itemBae =
			{"����", "����", "�߱�", "�౸", "��", "�¸�", "����"};
		jcombo = new JComboBox();
		for(int i=0; i<itemBae.length; i++) {
			jcombo.addItem(itemBae[i]); //ItemEvent : ���õ� �������� ��������
		}
		getContentPane().add(jcombo);
		
		String[] itemBae2 = {"����", "����", "�Ȱ�", "���", "�縻"};
		jlist = new JList(itemBae2); //�迭�� ��ǥ��
		jlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//=> ���������� ���� ���� ����(ctrl ������ �����ϴ� ���)
		//.SINGLE_INTERVAL_SELECTION => ���̾ ���� ����(shift ������ �����ϴ� ���), ctrl ��� �Ұ�
		//.SINGLE_SELECTION => �ϳ��� ���� ����
		getContentPane().add(jlist);
		
		setBackground(Color.LIGHT_GRAY);
		setSize(800, 800);
		setVisible(true);
	}
}

public class BaseComponentClass {

	public static void main(String[] args) {
		new BaseComponents();

	}

}