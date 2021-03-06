package com.java.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

class KGBroadcast extends JFrame implements ActionListener {
	
	private JLabel lbl1, lbl2, lbl3;
	private JButton btnSing, btnDance, btnEng, btnSports, btnEscape, btnGag,
					btnPush, btnCancel;
	private JComboBox<String> comboBox;
	private String msg = "";
	private int score = 0;
	
	public KGBroadcast() {
		
		setSize(620, 860);
		setLayout(new GridLayout(0, 3, 10, 10));

		lbl1 = new JLabel("KG ��� �ְ�");
		lbl1.setFont(new Font("����", Font.BOLD, 20));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl1);
		
		lbl2 = new JLabel("��㼱�ߴ�ȸ");
		lbl2.setFont(new Font("����", Font.BOLD, 20));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl2);
		
		lbl3 = new JLabel("���� �ڳʴ�");
		lbl3.setFont(new Font("����", Font.BOLD, 20));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl3);
		
		btnSing = new JButton("�뷡 10��");
		btnSing.setFont(new Font("����", Font.BOLD, 15));
		btnSing.setHorizontalAlignment(SwingConstants.CENTER);
		btnSing.addActionListener(this);
		add(btnSing);
		
		btnDance = new JButton("���� 20��");
		btnDance.setFont(new Font("����", Font.BOLD, 15));
		btnDance.setHorizontalAlignment(SwingConstants.CENTER);
		btnDance.addActionListener(this);
		add(btnDance);
	
		btnEng = new JButton("������� 30��");
		btnEng.setFont(new Font("����", Font.BOLD, 15));
		btnEng.setHorizontalAlignment(SwingConstants.CENTER);
		btnEng.addActionListener(this);
		add(btnEng);
		
		btnSports = new JButton("ö�λ������ 100��");
		btnSports.setFont(new Font("����", Font.BOLD, 15));
		btnSports.setHorizontalAlignment(SwingConstants.CENTER);
		btnSports.addActionListener(this);
		add(btnSports);
		
		btnEscape = new JButton("�̷�Ż�� 90��");
		btnEscape.setFont(new Font("����", Font.BOLD, 15));
		btnEscape.setHorizontalAlignment(SwingConstants.CENTER);
		btnEscape.addActionListener(this);
		add(btnEscape);
		
		btnGag = new JButton("���� 80��");
		btnGag.setFont(new Font("����", Font.BOLD, 15));
		btnGag.setHorizontalAlignment(SwingConstants.CENTER);
		btnGag.addActionListener(this);
		add(btnGag);
		
		btnPush = new JButton("������!");
		btnPush.setFont(new Font("����", Font.BOLD, 20));
		btnPush.setForeground(Color.WHITE);
		btnPush.setBackground(Color.BLUE);
		btnPush.setHorizontalAlignment(SwingConstants.CENTER);
		btnPush.addActionListener(this);
		add(btnPush);
		
		btnCancel = new JButton("���");
		btnCancel.setFont(new Font("����", Font.BOLD, 20));
		btnCancel.setBackground(Color.ORANGE);
		btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancel.addActionListener(this);
		add(btnCancel);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"10��", "20��", "30�� �̻�"}));
		comboBox.addActionListener(this);
		add(comboBox);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnSing) {
				score += 10;
				msg += btnSing.getText() + "\n";
		} else if(e.getSource() == btnDance) {
				score += 20;
				msg += btnDance.getText() + "\n";
		} else if(e.getSource() == btnEng) {
				score += 30;
				msg += btnEng.getText() + "\n";
		} else if(e.getSource() == btnSports) {
				score += 100;
				msg += btnSports.getText() + "\n";
		} else if(e.getSource() == btnEscape) {
				score += 90;
				msg += btnEscape.getText() + "\n";
		} else if(e.getSource() == btnGag) {
				score += 80;
				msg += btnGag.getText() + "\n";
		}
		
		if(e.getSource() == btnPush) {
			if(comboBox.getSelectedItem().equals("10��")) {
				score += 30;
				msg += comboBox.getSelectedItem() + " ������ 30��\n";
			} else if(comboBox.getSelectedItem().equals("20��")) {
				score += 20;
				msg += comboBox.getSelectedItem() + " ������ 20��\n";
			} else if(comboBox.getSelectedItem().equals("30�� �̻�")) {
				score += 10;
				msg += comboBox.getSelectedItem() + " ������ 10��\n";
			}
			
			msg += "�� ���� : " + score;
			int result = JOptionPane.showConfirmDialog(null, msg, "����", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.CLOSED_OPTION) {
				score = 0;
				msg = "";
			} else if(result == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, msg);
				score = 0;
				msg = "";
			} else {
				JOptionPane.showMessageDialog(null, "���");
				score = 0;
				msg = "";
			}
			
			
			
		} else if(e.getSource() == btnCancel) {
			score = 0;
			msg = "";
			JOptionPane.showMessageDialog(null, "���\n������ �ʱ�ȭ �մϴ�.");
		}
		
		
	}
}

public class KGBroadcastMain {

	public static void main(String[] args) {
		KGBroadcast kgb = new KGBroadcast();
		kgb.setVisible(true);
		

	}

}
