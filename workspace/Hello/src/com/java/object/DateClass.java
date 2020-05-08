package com.java.object;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println(d1); //toString() -> overrding
		
		System.out.println(d1.toLocaleString());
		System.out.println(d1.getYear()+"�� "+d1.getMonth()+"�� "+d1.getDate()+"��");
		
		String[] day = {"��", "��", "ȭ", "��", "��", "��", "��"};
		String str = "���� : ";
		str += (d1.getYear()+1900) + "�� ";
		str += (d1.getMonth()+1) + "�� ";
		str += d1.getDate() + "�� ";
		str += day[d1.getDay()] + "����"; //getDay() : ����
		System.out.println(str);
		//1900���� ����, 1���� 0, 2���� 1 ... 12���� 11
		
		Date d2 = new Date(1000L); //long, 1000ms = 1��
		String s = d2.toLocaleString();
		System.out.println("���ؿ��� 1�� ������ : " + s);
		
		Date d3 = new Date(1037436398768L);
		String s2 = d3.toLocaleString();
		System.out.println("���ؿ��� ���� ������ " + s2);
		
		System.out.println(d1);
		System.out.println(d1.toGMTString());
		
		
		//���� ���� ����� ������ 100���� �Ǵ� ���� ��� ��� ���������� ����Ͻÿ�
		Date d4 = new Date();
		d4.setDate(d4.getDate()+100-1);
		System.out.println(d4.toLocaleString());
		
		//��ƿ� ��¥���� ����Ͻÿ�
		Date today = new Date();
		Date birth = new Date(1992-1900, 11-1, 6);
		long ms = (today.getTime() - birth.getTime());
		long dayAfterBirth = ms/1000/3600/24;
		System.out.println(dayAfterBirth);
	}
}
