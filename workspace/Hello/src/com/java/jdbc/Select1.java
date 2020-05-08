package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Select1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//DB 연결 설정
		Connection conn = null;
		//ojdbc6.jar --> jre/lib/ext
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//driver load
		conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:"
		+"1521:xe", "hr", "hr");
		
		//System.out.println("연결 성공");
		
		
		//SQL 쿼리문 입력 및 실행
		//Q1) 사원의 이름을 입력받아 사원번호, 이름, 입사일을 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 사원을 입력해주세요 : ");
		String input = sc.next();
		
		String sql = "SELECT employee_id, first_name, hire_date FROM employees "
				+ "WHERE lower(first_name)='" + input + "'";
		
		Statement st = conn.createStatement();
		st.execute(sql);
		
		ResultSet rs = st.getResultSet();
		while(rs.next()) {
			int id = Integer.parseInt(rs.getString("employee_id"));
			String name = rs.getString("first_name");
			Date date = rs.getDate("hire_date");
			System.out.println(id + "\t" + name + "\t" + date);
		}
		System.out.println();
		
		
		//Q2) 부서번호가 90 또는 60인 직원의 이름, 부서번호, 부서명 출력 (입력X)
		System.out.print("첫번째 부서 번호를 입력해주세요 : ");
		int id1 = Integer.parseInt(sc.next());
		System.out.print("두번째 부서 번호를 입력해주세요 : ");
		int id2 = Integer.parseInt(sc.next());
		
		sql = "SELECT e.first_name, e.department_id, d.department_name "
				+ "FROM employees e, departments d "
				+ "WHERE e.department_id=d.department_id "
				+ "AND e.department_id IN (" + id1 + ", " + id2
				+ ") ORDER BY e.department_id";
		
		st = conn.createStatement();
		st.execute(sql);
		
		rs = st.getResultSet();
		while(rs.next()) {
			String name = rs.getString("first_name");
			int id = Integer.parseInt(rs.getString("department_id"));
			String deptName = rs.getString("department_name");
			System.out.println(name + "\t" + id + "\t" + deptName);
		}
		
		//Q3) PreparedStatement 객체를 활용하여 다시 풀자
		
		System.out.print("첫번째 부서 번호를 입력해주세요 : ");
		id1 = Integer.parseInt(sc.next());
		System.out.print("두번째 부서 번호를 입력해주세요 : ");
		id2 = Integer.parseInt(sc.next());
		
		sql = "SELECT e.first_name, e.department_id, d.department_name "
				+ "FROM employees e, departments d "
				+ "WHERE e.department_id=d.department_id "
				+ "AND e.department_id IN (?, ?) "
				+ "ORDER BY e.department_id";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id1);
		pstmt.setInt(2, id2);
		
		rs = pstmt.executeQuery();
		while(rs.next()) {
			String name = rs.getString("first_name");
			int id = Integer.parseInt(rs.getString("department_id"));
			String dname = rs.getString("department_name");
			System.out.println(name + "\t" + id + "\t" + dname);
		}
		System.out.println();
		
		
		//Q4) 부서번호가 60 또는 90이면서 2005년도에 입사한 직원의 이름, 부서번호, 부서명 출력 (부서 번호와, 연도를 입력받아)
		System.out.print("첫번째 부서 번호 : ");
		int dId1 = Integer.parseInt(sc.next());
		System.out.print("두번째 부서 번호 : ");
		int dId2 = Integer.parseInt(sc.next());
		System.out.print("입사 연도 : ");
		String year = sc.next();
		year = year + "%";
		
		sql = "SELECT e.first_name, e.department_id, d.department_name "
				+ "FROM employees e, departments d "
				+ "WHERE e.department_id=d.department_id "
				+ "AND e.department_id IN (?, ?) "
				+ "AND e.hire_date LIKE ?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, dId1);
		pstmt.setInt(2, dId2);
		pstmt.setString(3, year);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			String name = rs.getString("first_name");
			int id = Integer.parseInt(rs.getString("department_id"));
			String dname = rs.getString("department_name");
			System.out.println(name + "\t" + id + "\t" + dname);
		}
				
	}

}
