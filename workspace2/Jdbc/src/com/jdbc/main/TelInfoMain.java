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
			System.out.println("비상 연락망 관리!!");
			System.out.println("----------------------------");
			System.out.println("1: 한명 입력\n2: 수정\n3: 삭제\n4: 전체 출력\n5: 종료");
			System.out.println("----------------------------");
			System.out.println("사용할 메뉴를 선택하세요\n");
			sel = Integer.parseInt(JOptionPane.showInputDialog("메뉴 선택 : "));
			switch(sel) {
			case 1:
				int searchId = Integer.parseInt(JOptionPane.showInputDialog("조회할 ID 입력 : "));
				TelInfoVO vo = dao.getOneInfo(searchId);
				System.out.println("ID : " + vo.getId());
				System.out.println("이름 : " + vo.getName());
				System.out.println("전화번호 : " + vo.getTel());
				System.out.println("등록 날짜 : " + vo.getD() + "\n");
				break;
			case 2:
				String prev = JOptionPane.showInputDialog("기존 이름 : ");
				String mod = JOptionPane.showInputDialog("수정 이름 : ");
				if(dao.update_nametel(prev, mod)) {
					System.out.println("UPDATE OK\n");
				} else {
					System.out.println("ERROR\n");
				} break;
			case 3:
				int delId = Integer.parseInt(JOptionPane.showInputDialog("삭제할 ID 입력 : "));
				if(dao.delete_idtel(delId)) {
					System.out.println("DELETE OK\n");
				} else {
					System.out.println("ERROR\n");
				} break;
			case 4:
				ArrayList<TelInfoVO> result = dao.getAllInfo();
				for(TelInfoVO telInfo : result) {
					System.out.println("ID : " + telInfo.getId());
					System.out.println("이름 : " + telInfo.getName());
					System.out.println("전화번호 : " + telInfo.getTel());
					System.out.println("등록 날짜 : " + telInfo.getD() + "\n");
				} break;
			case 5: System.out.println("종료합니다."); break;
			default : System.out.println("1~5만 넣어주세요.\n");
			}
		} while(sel!=5);
		
		
	}

}
