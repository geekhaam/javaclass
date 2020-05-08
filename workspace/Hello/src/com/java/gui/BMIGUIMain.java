package com.java.gui;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class BMIGUI extends JFrame implements ActionListener {
	private JButton b1 = new JButton("BMI ���");
	private JLabel la1 = new JLabel("����� Ű��");
	private JLabel la2 = new JLabel("����� �����Դ�");
	
	private JTextField tf1 = new JTextField();
	private JTextField tf2 = new JTextField();
	private JTextField tf3 = new JTextField();
	
	public BMIGUI() {
		this.setSize(500, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font nanumP = new Font("����������", Font.PLAIN, 12);
		Font nanumB = new Font("����������", Font.BOLD, 15);
		this.setLayout(null);
		b1.setSize(100, 70);
		b1.setLocation(200, 300);
		b1.setFont(nanumB);
		this.add(b1);
		b1.addActionListener(this);
		
		la1.setSize(90, 30);
		la1.setLocation(20, 70);
		la1.setFont(nanumP);
		this.add(la1);
		
		tf1.setSize(90, 30);
		tf1.setLocation(130, 70);
		this.add(tf1);
		
		la2.setSize(100, 30);
		la2.setLocation(20, 140);
		la2.setFont(nanumP);
		this.add(la2);
	
		tf2.setSize(90, 30);
		tf2.setLocation(130, 140);
		this.add(tf2);
		
		tf3.setSize(450, 80);
		tf3.setLocation(20, 400);
		tf3.setFont(nanumB);
		this.add(tf3);
	}
	
	//ü�� / ����^2
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			try {
				double height = ((Integer.parseInt(tf1.getText()))/100.0);
				int weight = Integer.parseInt(tf2.getText());
				double bmi = (float) (weight / (Math.pow(height, 2)));
				String isObesity = "";
				if(bmi >= 40.1) {
					isObesity = "���� ��";
				} else if(bmi >= 30) {
					isObesity = "2�� ��";
				} else if(bmi >= 25) {
					isObesity = "1�� ��";
				} else if(bmi >= 20) {
					isObesity = "����";
				} else {
					isObesity = "��ü��";
				}
				tf3.setText("����� BMI ������ " + bmi + "�̸�, " + isObesity + "�Դϴ�.");
			} catch(NumberFormatException ne) {
				tf3.setText("Ű�� �����Կ��� ���ڸ� �־��ּ���!");
			} catch(Exception er) {
				tf3.setText(er.getMessage());
			}
		}
		
	}
}

public class BMIGUIMain {

	public static void main(String[] args) {
		new BMIGUI();

	}

}