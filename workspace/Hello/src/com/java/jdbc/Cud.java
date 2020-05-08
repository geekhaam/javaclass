package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Cud {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:"
		+"1521:xe", "hr", "hr");
		
		//테이블 만들기 
		//102 김지홍 010-3333-5555 인사부
		
		/*String sql = "CREATE TABLE insatable ("
				+ "id number(5), "
				+ "name varchar2(20), "
				+ "phone_number varchar2(20), "
				+ "department varchar2(30)"
				+ ")";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.execute();
		conn.commit();
		System.out.println("테이블 만들기, 커밋 성공");*/
		
		
		//데이터 삽입
		Scanner sc = new Scanner(System.in);
		/*System.out.print("사원 번호 : ");
		int id = Integer.parseInt(sc.next());
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String pNum = sc.next();
		System.out.print("부서명 : ");
		String dept = sc.next();
		
		String sql = "INSERT INTO insatable VALUES(?, ?, ?, ?)";
	
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, pNum);
		pstmt.setString(4, dept);
		
		int result = pstmt.executeUpdate();
		if(result == 0) {
			System.out.println("입력 실패");
		} else {
			System.out.println(result + "개열 입력 성공");
			conn.commit();
		}*/
		
		
		// 데이터 수정
		/*System.out.print("수정할 사원의 번호 : ");
		int id = Integer.parseInt(sc.next());
		System.out.println("수정할 사원의 부서명 : ");
		String dept = sc.next();
		
		String sql = "UPDATE insatable SET department=? WHERE id=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dept);
		pstmt.setInt(2, id);
		
		int result = pstmt.executeUpdate();
		if(result == 0) {
			System.out.println("수정 실패");
		} else {
			System.out.println(result + "개열 수정 성공");
			conn.commit();
		}*/
		
		//데이터 수정2 : id 및 이름, 전화번호, 바뀔 부서를 모두 입력 받아 해당 id의 사원 내용을 변경하시오
		//(단, 만일 변경하기 싫은 컬럼은 현재와 같게 다시 입력함)
		
		System.out.print("수정할 사원의 번호 : ");
		int id = Integer.parseInt(sc.next());
		System.out.print("바뀔 사원의 번호 : ");
		int cId = Integer.parseInt(sc.next());
		System.out.print("수정할 사원의 이름 : ");
		String name = sc.next();
		System.out.print("수정할 전화번호 : ");
		String pNum = sc.next();
		System.out.println("수정할 사원의 부서명 : ");
		String dept = sc.next();
		
		String sql = "UPDATE insatable SET id=?, name=?, phone_number=?, department=? "
				+ "WHERE id=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, cId);
		pstmt.setString(2, name);
		pstmt.setString(3, pNum);
		pstmt.setString(4, dept);
		pstmt.setInt(5, id);
		
		int result = pstmt.executeUpdate();
		if(result == 0) {
			System.out.println("수정 실패");
		} else {
			System.out.println(result + "개열 수정 성공");
			conn.commit();
		}
		
		//데이터 삭제 
		System.out.print("삭제할 사원의 번호 : ");
		int delId = Integer.parseInt(sc.next());
		
		sql = "DELETE FROM insatable WHERE id=?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, delId);
		
		result = pstmt.executeUpdate();
		
		System.out.println(result + "개열 삭제 성공");
		conn.commit();
	}

}
