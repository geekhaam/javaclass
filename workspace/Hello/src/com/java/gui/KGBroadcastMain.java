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

		lbl1 = new JLabel("KG 방송 주관");
		lbl1.setFont(new Font("굴림", Font.BOLD, 20));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl1);
		
		lbl2 = new JLabel("비담선발대회");
		lbl2.setFont(new Font("굴림", Font.BOLD, 20));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl2);
		
		lbl3 = new JLabel("잘한 코너는");
		lbl3.setFont(new Font("굴림", Font.BOLD, 20));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl3);
		
		btnSing = new JButton("노래 10점");
		btnSing.setFont(new Font("굴림", Font.BOLD, 15));
		btnSing.setHorizontalAlignment(SwingConstants.CENTER);
		btnSing.addActionListener(this);
		add(btnSing);
		
		btnDance = new JButton("댄스 20점");
		btnDance.setFont(new Font("굴림", Font.BOLD, 15));
		btnDance.setHorizontalAlignment(SwingConstants.CENTER);
		btnDance.addActionListener(this);
		add(btnDance);
	
		btnEng = new JButton("영어웅변 30점");
		btnEng.setFont(new Font("굴림", Font.BOLD, 15));
		btnEng.setHorizontalAlignment(SwingConstants.CENTER);
		btnEng.addActionListener(this);
		add(btnEng);
		
		btnSports = new JButton("철인삼종경기 100점");
		btnSports.setFont(new Font("굴림", Font.BOLD, 15));
		btnSports.setHorizontalAlignment(SwingConstants.CENTER);
		btnSports.addActionListener(this);
		add(btnSports);
		
		btnEscape = new JButton("미로탈출 90점");
		btnEscape.setFont(new Font("굴림", Font.BOLD, 15));
		btnEscape.setHorizontalAlignment(SwingConstants.CENTER);
		btnEscape.addActionListener(this);
		add(btnEscape);
		
		btnGag = new JButton("개그 80점");
		btnGag.setFont(new Font("굴림", Font.BOLD, 15));
		btnGag.setHorizontalAlignment(SwingConstants.CENTER);
		btnGag.addActionListener(this);
		add(btnGag);
		
		btnPush = new JButton("눌러요!");
		btnPush.setFont(new Font("굴림", Font.BOLD, 20));
		btnPush.setForeground(Color.WHITE);
		btnPush.setBackground(Color.BLUE);
		btnPush.setHorizontalAlignment(SwingConstants.CENTER);
		btnPush.addActionListener(this);
		add(btnPush);
		
		btnCancel = new JButton("취소");
		btnCancel.setFont(new Font("굴림", Font.BOLD, 20));
		btnCancel.setBackground(Color.ORANGE);
		btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancel.addActionListener(this);
		add(btnCancel);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"10대", "20대", "30대 이상"}));
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
			if(comboBox.getSelectedItem().equals("10대")) {
				score += 30;
				msg += comboBox.getSelectedItem() + " 가산점 30점\n";
			} else if(comboBox.getSelectedItem().equals("20대")) {
				score += 20;
				msg += comboBox.getSelectedItem() + " 가산점 20점\n";
			} else if(comboBox.getSelectedItem().equals("30대 이상")) {
				score += 10;
				msg += comboBox.getSelectedItem() + " 가산점 10점\n";
			}
			
			msg += "총 점수 : " + score;
			int result = JOptionPane.showConfirmDialog(null, msg, "결정", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.CLOSED_OPTION) {
				score = 0;
				msg = "";
			} else if(result == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, msg);
				score = 0;
				msg = "";
			} else {
				JOptionPane.showMessageDialog(null, "취소");
				score = 0;
				msg = "";
			}
			
			
			
		} else if(e.getSource() == btnCancel) {
			score = 0;
			msg = "";
			JOptionPane.showMessageDialog(null, "취소\n점수를 초기화 합니다.");
		}
		
		
	}
}

public class KGBroadcastMain {

	public static void main(String[] args) {
		KGBroadcast kgb = new KGBroadcast();
		kgb.setVisible(true);
		

	}

}
