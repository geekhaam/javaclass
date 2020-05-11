package com.java.wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.Timer;

import javax.swing.JButton;

public class movingString extends JFrame {
	static int sw = 0;
	static String s = "				I LOVE YOU";
	Timer t = new Timer();
	
	
	//GUI
	private JPanel contentPane;
	private JTextField txtILoveYou;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movingString frame = new movingString();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public movingString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtILoveYou = new JTextField();
		txtILoveYou.setForeground(new Color(255, 0, 0));
		txtILoveYou.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 25));
		txtILoveYou.setBackground(new Color(0, 0, 0));
		txtILoveYou.setBounds(91, 40, 246, 51);
		contentPane.add(txtILoveYou);
		txtILoveYou.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC2DC \uC791");
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 20));
		btnNewButton.setBounds(134, 119, 156, 44);
		contentPane.add(btnNewButton);
		
		button = new JButton("\uB05D");
		button.setBackground(new Color(123, 104, 238));
		button.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 20));
		button.setBounds(134, 184, 156, 44);
		contentPane.add(button);
	}

}
