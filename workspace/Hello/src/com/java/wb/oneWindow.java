package com.java.wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class oneWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oneWindow frame = new oneWindow();
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
	public oneWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC0C8\uCC3D \uC804\uD658");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); //���� â ���� //�������� �ݴ� ��
				setVisible(false); //���� â �� ���̰�
				new twoWIndow().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("����������", Font.PLAIN, 16));
		btnNewButton.setBounds(159, 50, 97, 47);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(new Color(240, 230, 140));
		textField.setBounds(145, 122, 126, 39);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
