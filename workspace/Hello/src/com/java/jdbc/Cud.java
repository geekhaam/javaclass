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
		
		//���̺� ����� 
		//102 ����ȫ 010-3333-5555 �λ��
		
		/*String sql = "CREATE TABLE insatable ("
				+ "id number(5), "
				+ "name varchar2(20), "
				+ "phone_number varchar2(20), "
				+ "department varchar2(30)"
				+ ")";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.execute();
		conn.commit();
		System.out.println("���̺� �����, Ŀ�� ����");*/
		
		
		//������ ����
		Scanner sc = new Scanner(System.in);
		/*System.out.print("��� ��ȣ : ");
		int id = Integer.parseInt(sc.next());
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("��ȭ��ȣ : ");
		String pNum = sc.next();
		System.out.print("�μ��� : ");
		String dept = sc.next();
		
		String sql = "INSERT INTO insatable VALUES(?, ?, ?, ?)";
	
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, pNum);
		pstmt.setString(4, dept);
		
		int result = pstmt.executeUpdate();
		if(result == 0) {
			System.out.println("�Է� ����");
		} else {
			System.out.println(result + "���� �Է� ����");
			conn.commit();
		}*/
		
		
		// ������ ����
		/*System.out.print("������ ����� ��ȣ : ");
		int id = Integer.parseInt(sc.next());
		System.out.println("������ ����� �μ��� : ");
		String dept = sc.next();
		
		String sql = "UPDATE insatable SET department=? WHERE id=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dept);
		pstmt.setInt(2, id);
		
		int result = pstmt.executeUpdate();
		if(result == 0) {
			System.out.println("���� ����");
		} else {
			System.out.println(result + "���� ���� ����");
			conn.commit();
		}*/
		
		//������ ����2 : id �� �̸�, ��ȭ��ȣ, �ٲ� �μ��� ��� �Է� �޾� �ش� id�� ��� ������ �����Ͻÿ�
		//(��, ���� �����ϱ� ���� �÷��� ����� ���� �ٽ� �Է���)
		
		System.out.print("������ ����� ��ȣ : ");
		int id = Integer.parseInt(sc.next());
		System.out.print("�ٲ� ����� ��ȣ : ");
		int cId = Integer.parseInt(sc.next());
		System.out.print("������ ����� �̸� : ");
		String name = sc.next();
		System.out.print("������ ��ȭ��ȣ : ");
		String pNum = sc.next();
		System.out.println("������ ����� �μ��� : ");
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
			System.out.println("���� ����");
		} else {
			System.out.println(result + "���� ���� ����");
			conn.commit();
		}
		
		//������ ���� 
		System.out.print("������ ����� ��ȣ : ");
		int delId = Integer.parseInt(sc.next());
		
		sql = "DELETE FROM insatable WHERE id=?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, delId);
		
		result = pstmt.executeUpdate();
		
		System.out.println(result + "���� ���� ����");
		conn.commit();
	}

}
