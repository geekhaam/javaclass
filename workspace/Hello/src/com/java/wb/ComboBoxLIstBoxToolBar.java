package com.java.wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.AbstractListModel;
import java.awt.Color;

public class ComboBoxLIstBoxToolBar extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBoxLIstBoxToolBar frame = new ComboBoxLIstBoxToolBar();
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
	public ComboBoxLIstBoxToolBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == comboBox) {
					JOptionPane.showMessageDialog(comboBox, (String)comboBox.getSelectedItem()+"�� �����Ͽ����ϴ�.");
												//�޼��� �ڽ��� ������ ��ġ ����, null�� ��쿣 ȭ���� ���߾�,
												// parentComponent ������ �־��ָ� �� ���� �����ȴ�.
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC0AC\uACFC", "\uBC30", "\uAC10"}));
		comboBox.setBounds(35, 108, 137, 21);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(244, 83, 157, 67);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setBackground(new Color(240, 230, 140));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"\uCD95\uAD6C", "\uC57C\uAD6C", "\uB18D\uAD6C", "\uBC30\uAD6C", "\uC871\uAD6C"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(e.getSource() == list) {
					int size = list.getModel().getSize();
					int index = list.getSelectedIndex();
					String indexElement = (String) list.getModel().getElementAt(index);
					JOptionPane.showMessageDialog(null, "��ü ������ "+size+" ���� element��"+indexElement);
					/*JOptionPane.showMessageDialog(list, "���õ� ������ "+(String)list.getSelectedValue()
											+"�̰�, ������ �� "+list.getVisibleRowCount()+"���Դϴ�.");*/
				}
			}
		});
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
	}
}