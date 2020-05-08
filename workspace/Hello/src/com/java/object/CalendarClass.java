package com.java.object;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //클래스명.스태틱메소드	 //new 없이
								//singleton
		
		cal.add(Calendar.DATE, 100-1); //오늘부터 100번째 일이 되는 날
		String str = "100일은 ";
		str += cal.get(Calendar.YEAR) + "년 ";
		str += (cal.get(Calendar.MONTH)+1) + "월 ";
		str += cal.get(Calendar.DATE) + "일입니다.";
		System.out.println(str);
		
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("G yyyy년 MM월 dd일 E요일 hh:mm:ss a 일년중 D번째 일");
													//G (BC/AD)				a AM/PM		D(1년 중 몇번째)
		System.out.println(sdf2.format(d));
	}

}
