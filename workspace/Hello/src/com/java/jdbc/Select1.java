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
		
		//DB ���� ����
		Connection conn = null;
		//ojdbc6.jar --> jre/lib/ext
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//driver load
		conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:"
		+"1521:xe", "hr", "hr");
		
		//System.out.println("���� ����");
		
		
		//SQL ������ �Է� �� ����
		//Q1) ����� �̸��� �Է¹޾� �����ȣ, �̸�, �Ի����� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ����� �Է����ּ��� : ");
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
		
		
		//Q2) �μ���ȣ�� 90 �Ǵ� 60�� ������ �̸�, �μ���ȣ, �μ��� ��� (�Է�X)
		System.out.print("ù��° �μ� ��ȣ�� �Է����ּ��� : ");
		int id1 = Integer.parseInt(sc.next());
		System.out.print("�ι�° �μ� ��ȣ�� �Է����ּ��� : ");
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
		
		//Q3) PreparedStatement ��ü�� Ȱ���Ͽ� �ٽ� Ǯ��
		
		System.out.print("ù��° �μ� ��ȣ�� �Է����ּ��� : ");
		id1 = Integer.parseInt(sc.next());
		System.out.print("�ι�° �μ� ��ȣ�� �Է����ּ��� : ");
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
		
		
		//Q4) �μ���ȣ�� 60 �Ǵ� 90�̸鼭 2005�⵵�� �Ի��� ������ �̸�, �μ���ȣ, �μ��� ��� (�μ� ��ȣ��, ������ �Է¹޾�)
		System.out.print("ù��° �μ� ��ȣ : ");
		int dId1 = Integer.parseInt(sc.next());
		System.out.print("�ι�° �μ� ��ȣ : ");
		int dId2 = Integer.parseInt(sc.next());
		System.out.print("�Ի� ���� : ");
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
