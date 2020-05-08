package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Basic implements DBInfo {
	
	private static Connection getConn() throws SQLException {
		return DriverManager.getConnection(URL, UID, UPW);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 사원의 이름을 입력해주세요 : ");
		
		String name = sc.next();
		
		String sql = "SELECT employee_id, first_name, last_name, hire_date FROM employees "
				+ "WHERE first_name=?";
		
		try(Connection conn = getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			Class.forName(DRIVER_NAME);
			
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("사원 번호 : " + rs.getInt("employee_id"));
				System.out.println("이름 : " + rs.getString("first_name") +" "+ rs.getString("last_name"));
				System.out.println("입사일 : " + rs.getDate("hire_date"));				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
