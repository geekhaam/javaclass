package com.java.object;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //Ŭ������.����ƽ�޼ҵ�	 //new ����
								//singleton
		
		cal.add(Calendar.DATE, 100-1); //���ú��� 100��° ���� �Ǵ� ��
		String str = "100���� ";
		str += cal.get(Calendar.YEAR) + "�� ";
		str += (cal.get(Calendar.MONTH)+1) + "�� ";
		str += cal.get(Calendar.DATE) + "���Դϴ�.";
		System.out.println(str);
		
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH:mm:ss");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("G yyyy�� MM�� dd�� E���� hh:mm:ss a �ϳ��� D��° ��");
													//G (BC/AD)				a AM/PM		D(1�� �� ���°)
		System.out.println(sdf2.format(d));
	}

}
