package com.java.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JLabelClass extends JFrame implements ActionListener{
	JLabel jl;
	JButton jb;
	
	public JLabelClass() {
		ImageIcon img1 = new ImageIcon("D:/record.jpg"); 
		//JLabel은 출력 전문 컴포넌트, 입력X
		//jl = new JLabel("JLabel")
		jb = new JButton("RECORD", img1);
		jb.setFont(new Font("Consolas", Font.BOLD, 32));
		jb.setBackground(Color.LIGHT_GRAY);
		
		jb.addActionListener(this);
		getContentPane().add(jb);
		
		setVisible(true);
		setSize(1000, 1000);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb) {
			ImageIcon img2 = new ImageIcon("D:/green.jpg");
			jb.setIcon(img2);
			jb.setText("GREEN MOOD");
			jb.setFont(new Font("Consolas", Font.BOLD, 22));
			jb.setBackground(Color.BLACK);
			
		}
		
	}
	
	public static void main(String[] args) {
		new JLabelClass();

	}


}
