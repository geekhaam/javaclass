package com.java.object;

public class Cpmain {

	public static void main(String[] args) {
		Cellphone cp1 = new Cellphone("ȫ�浿", "������xs", 1500000, "��������");
		Cellphone cp2 = new Cellphone();
		cp2.setDevice("������s8");
		cp2.setName("�̵���");
		cp2.setPrice(900000);
		cp2.setLocation("��������");
		
		System.out.println(cp1+"\n"+cp2);
	}

}
