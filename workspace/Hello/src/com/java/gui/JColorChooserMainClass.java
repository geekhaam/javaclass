package com.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JColorChooserClass extends JFrame implements ActionListener {
	JButton jbutton = new JButton("���� ����");
	JLabel jlabel1 = new JLabel("���� �� ����");
	JLabel jlabel2 = new JLabel("���� ����");
	JLabel jlabel3 = new JLabel("���� ���� �ڵ�");
	Color color;
	
	public JColorChooserClass() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
		
		add(jbutton);
		jbutton.addActionListener(this);
		
		jlabel1.setFont(new Font("����������", Font.BOLD, 25));
		add(jlabel1);
		
		jlabel2.setFont(new Font("����������", Font.BOLD, 25));
		add(jlabel2);
		
		jlabel3.setFont(new Font("����������", Font.BOLD, 25));
		add(jlabel3);
		
		setSize(1500, 200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbutton) {
			color = JColorChooser.showDialog(jbutton, "���� ����", Color.green);
			jlabel1.setForeground(color); //�۾��� �ش� ������
			jlabel2.setText("RGB �� " + color); //rgb ���ڷ�
			jlabel3.setText(Integer.toString(color.getRGB()));
			System.out.println(color);
		}
		
	}
}

public class JColorChooserMainClass {

	public static void main(String[] args) {
		new JColorChooserClass();

	}

}
