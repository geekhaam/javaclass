package telinfoPrintMain;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane; ////////////////

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class TelInfoMain {//TelInfoMain.java
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException {                     
		
		TelInfoDAO tidao = new TelInfoDAO();///////////////
		ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();
		
		for(TelInfoVO imsi : tiArray){
			System.out.print(imsi.getId()+"\t");
			System.out.print(imsi.getName()+"\t");
			System.out.print(imsi.getTel()+"\t");
			System.out.println(imsi.getD());//
		
		}//for-end
	}//main-end
}//class-end