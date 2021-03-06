package com.java.wb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ToolbarIcon extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToolbarIcon frame = new ToolbarIcon();
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
	public ToolbarIcon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1580, 404);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 10, 1580, 267);
		contentPane.add(toolBar);
		
		JButton btnNewButton = new JButton("Color Red");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					lblNewLabel.setForeground(Color.RED);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(ToolbarIcon.class.getResource("/images/color1.png")));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Color Blue");
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_1) {
					lblNewLabel.setForeground(Color.BLUE);
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ToolbarIcon.class.getResource("/images/color2.png")));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Font 30");
		btnNewButton_2.setBackground(new Color(255, 165, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_2) {
					lblNewLabel.setFont(new Font("����������", Font.BOLD, 30));
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(ToolbarIcon.class.getResource("/images/font1.png")));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Font 50");
		btnNewButton_3.setBackground(new Color(176, 224, 230));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_3) {
					lblNewLabel.setFont(new Font("����������", Font.BOLD, 50));
				}
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(ToolbarIcon.class.getResource("/images/font2.png")));
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("STOP");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_4) {
					System.exit(0);
				}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(ToolbarIcon.class.getResource("/images/stop.png")));
		toolBar.add(btnNewButton_4);
		
		lblNewLabel = new JLabel("JToolbar\uB85C \uAE00\uC790 \uBC14\uAFB8\uAE30");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����������", Font.BOLD, 20));
		lblNewLabel.setBounds(396, 288, 848, 60);
		contentPane.add(lblNewLabel);
	}
}
