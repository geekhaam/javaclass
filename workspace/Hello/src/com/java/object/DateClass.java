package com.java.object;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println(d1); //toString() -> overrding
		
		System.out.println(d1.toLocaleString());
		System.out.println(d1.getYear()+"년 "+d1.getMonth()+"월 "+d1.getDate()+"일");
		
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		String str = "현재 : ";
		str += (d1.getYear()+1900) + "년 ";
		str += (d1.getMonth()+1) + "월 ";
		str += d1.getDate() + "일 ";
		str += day[d1.getDay()] + "요일"; //getDay() : 요일
		System.out.println(str);
		//1900년을 기준, 1월이 0, 2월이 1 ... 12월이 11
		
		Date d2 = new Date(1000L); //long, 1000ms = 1초
		String s = d2.toLocaleString();
		System.out.println("기준에서 1초 지나면 : " + s);
		
		Date d3 = new Date(1037436398768L);
		String s2 = d3.toLocaleString();
		System.out.println("기준에서 한참 지나면 " + s2);
		
		System.out.println(d1);
		System.out.println(d1.toGMTString());
		
		
		//오늘 만난 사람과 만난지 100일이 되는 날이 몇년 몇월 몇일인지를 출력하시오
		Date d4 = new Date();
		d4.setDate(d4.getDate()+100-1);
		System.out.println(d4.toLocaleString());
		
		//살아온 날짜수를 출력하시오
		Date today = new Date();
		Date birth = new Date(1992-1900, 11-1, 6);
		long ms = (today.getTime() - birth.getTime());
		long dayAfterBirth = ms/1000/3600/24;
		System.out.println(dayAfterBirth);
	}
}
