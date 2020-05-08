package com.jdbc.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jdbc.dao.TelInfoDAO;
import com.jdbc.vo.TelInfoVO;

public class TelInfoMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TelInfoDAO dao = new TelInfoDAO();
		
		Scanner sc = new Scanner(System.in);
		
		int sel;
		do {
			System.out.println("��� ������ ����!!");
			System.out.println("----------------------------");
			System.out.println("1: �Ѹ� �Է�\n2: ����\n3: ����\n4: ��ü ���\n5: ����");
			System.out.println("----------------------------");
			System.out.println("����� �޴��� �����ϼ���\n");
			sel = Integer.parseInt(JOptionPane.showInputDialog("�޴� ���� : "));
			switch(sel) {
			case 1:
				int searchId = Integer.parseInt(JOptionPane.showInputDialog("��ȸ�� ID �Է� : "));
				TelInfoVO vo = dao.getOneInfo(searchId);
				System.out.println("ID : " + vo.getId());
				System.out.println("�̸� : " + vo.getName());
				System.out.println("��ȭ��ȣ : " + vo.getTel());
				System.out.println("��� ��¥ : " + vo.getD() + "\n");
				break;
			case 2:
				String prev = JOptionPane.showInputDialog("���� �̸� : ");
				String mod = JOptionPane.showInputDialog("���� �̸� : ");
				if(dao.update_nametel(prev, mod)) {
					System.out.println("UPDATE OK\n");
				} else {
					System.out.println("ERROR\n");
				} break;
			case 3:
				int delId = Integer.parseInt(JOptionPane.showInputDialog("������ ID �Է� : "));
				if(dao.delete_idtel(delId)) {
					System.out.println("DELETE OK\n");
				} else {
					System.out.println("ERROR\n");
				} break;
			case 4:
				ArrayList<TelInfoVO> result = dao.getAllInfo();
				for(TelInfoVO telInfo : result) {
					System.out.println("ID : " + telInfo.getId());
					System.out.println("�̸� : " + telInfo.getName());
					System.out.println("��ȭ��ȣ : " + telInfo.getTel());
					System.out.println("��� ��¥ : " + telInfo.getD() + "\n");
				} break;
			case 5: System.out.println("�����մϴ�."); break;
			default : System.out.println("1~5�� �־��ּ���.\n");
			}
		} while(sel!=5);
		
		
	}

}
