package com.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class GoodBurger extends JFrame implements ActionListener {
	
	private JLabel lblWelcome, lblChoose;
	private JButton btnHotSource, btnDoubleBeef, btnVegeShrimp, btnTriTomato,
					btnOrder, btnCancel;
	private JList<String> listLocation;
	private int price, cntBurger = 0;
	private String msg = "";
	
	public GoodBurger() {
		setTitle("어서오세요 굿버거입니다");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0, 2, 20, 30));
		
		lblWelcome = new JLabel("**굿버거 햄버거 입니다**");
		lblWelcome.setFont(new Font("굴림", Font.BOLD, 20));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblWelcome);
		
		lblChoose = new JLabel("드실 메뉴를 선택하세요");
		lblChoose.setFont(new Font("굴림", Font.BOLD, 20));
		lblChoose.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblChoose);
		
		btnHotSource = new JButton("매운 소스 햄버거 : 5000");
		btnHotSource.setFont(new Font("굴림", Font.BOLD, 18));
		btnHotSource.addActionListener(this);
		add(btnHotSource);
		
		btnDoubleBeef = new JButton("더블 비프 햄버거 : 7000");
		btnDoubleBeef.setFont(new Font("굴림", Font.BOLD, 18));
		btnDoubleBeef.addActionListener(this);
		add(btnDoubleBeef);
		
		btnVegeShrimp = new JButton("야채 새우 햄버거 : 4500");
		btnVegeShrimp.setFont(new Font("굴림", Font.BOLD, 18));
		btnVegeShrimp.addActionListener(this);
		add(btnVegeShrimp);
		
		btnTriTomato = new JButton("세겹 토마토 햄버거 : 5500");
		btnTriTomato.setFont(new Font("굴림", Font.BOLD, 18));
		btnTriTomato.addActionListener(this);
		add(btnTriTomato);
		
		btnOrder = new JButton("주문합니다");
		btnOrder.setFont(new Font("굴림", Font.BOLD, 18));
		btnOrder.setBackground(Color.ORANGE);
		btnOrder.addActionListener(this);
		add(btnOrder);
		
		btnCancel = new JButton("취소합니다");
		btnCancel.setFont(new Font("굴림", Font.BOLD, 18));
		btnCancel.setBackground(Color.YELLOW);
		btnCancel.addActionListener(this);
		add(btnCancel);
		
		listLocation = new JList<String>();
		listLocation.setModel(new AbstractListModel<String>() {
			String[] locs = {"종로", "종로외"};
			@Override
			public String getElementAt(int index) {
				// TODO Auto-generated method stub
				return locs[index];
			}
			@Override
			public int getSize() {
				// TODO Auto-generated method stub
				return locs.length;
			}
		});
		listLocation.setVisibleRowCount(2);
		listLocation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listLocation.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()) {
					if(e.getSource() == listLocation) {
						price -= 1000;
						msg += listLocation.getSelectedValue()+" 지역 할인 : -1000원\n";	
					}
				}
				
			}
		});
		
		add(listLocation);
		
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnHotSource) {
			price += 5000;
			cntBurger += 1;
			msg += btnHotSource.getText() + "\n";
		}
		
		if(e.getSource() == btnDoubleBeef) {
			price += 7000;
			cntBurger += 1;
			msg += btnDoubleBeef.getText() + "\n";
		}
		
		if(e.getSource() == btnVegeShrimp) {
			price += 4500;
			cntBurger += 1;
			msg += btnVegeShrimp.getText() + "\n";
		}
		
		if(e.getSource() == btnTriTomato) {
			price += 5500;
			cntBurger += 1;
			msg += btnTriTomato.getText() + "\n";
		}
		
		if(e.getSource() == btnOrder) {
			msg += "총 금액 : "+ price +"원\n총 주문 수량 : " + cntBurger;
			int result = JOptionPane.showConfirmDialog(null, msg,
										"확인하세요", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "주문이 완료되었습니다.\n감사합니다.");
				price = 0;
				cntBurger = 0;
				msg = "";
			} else {
				JOptionPane.showMessageDialog(null, "취소되었습니다.");
				price = 0;
				cntBurger = 0;
				msg = "";
			}
		}
		
		if(e.getSource() == btnCancel) {
			JOptionPane.showMessageDialog(null, "취소되었습니다.");
			price = 0;
			cntBurger = 0;
			msg = "";
		}
		
	}
	
}

public class GoodBurgerMain {

	public static void main(String[] args) {
		new GoodBurger();

	}

}
