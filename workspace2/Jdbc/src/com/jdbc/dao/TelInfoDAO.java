package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.dbconn.TelInfoDBConn;
import com.jdbc.vo.TelInfoVO;

public class TelInfoDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public TelInfoDAO() throws ClassNotFoundException, SQLException {
		conn = new TelInfoDBConn().getConnection();
	}
	
	//��ü ��� �޼ҵ� getAllInfo() (Select All)
	//VO�� �����Ͽ� ����Ѵ�.
	public ArrayList<TelInfoVO> getAllInfo() throws SQLException {
		ArrayList<TelInfoVO> telInfoList = new ArrayList<TelInfoVO>();
		
		String sql = "SELECT * FROM teltable5 ORDER BY id";
		
		pstmt = conn.prepareStatement(sql);	
		rs = pstmt.executeQuery();
		while(rs.next()) {
			TelInfoVO telInfo = new TelInfoVO(rs.getInt("id"), rs.getString("name"),
					rs.getString("tel"), rs.getDate("d"));
			telInfoList.add(telInfo);
		} return telInfoList;
	}
	
	//�ϳ��� ���� ��ȸ
	public TelInfoVO getOneInfo(int searchId) throws SQLException {
		String sql = "SELECT * FROM teltable5 WHERE id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, searchId);
		
		TelInfoVO vo = new TelInfoVO();
		rs = pstmt.executeQuery();
		while(rs.next()) {
			vo.setId(rs.getInt("id"));
			vo.setName(rs.getString("name"));
			vo.setTel(rs.getString("tel"));
			vo.setD(rs.getDate("d"));
		} return vo;
	}
	
	//�̸��� �Ķ���ͷ� �޾� ����
	public boolean update_nametel(String prevName, String modName){
		String sql = "UPDATE teltable5 SET name=? WHERE name=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, modName);
			pstmt.setString(2, prevName);
			pstmt.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} return true;
	}
	
	//ID �Է� �޾� ����
	public boolean delete_idtel(int delId) {
		String sql = "DELETE FROM teltable5 WHERE id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, delId);
			pstmt.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} return true;
	}
}