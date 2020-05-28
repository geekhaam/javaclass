package com.java.thread;

class BankClass1 extends Thread {
	
	public void run() {
		Account ac = new Account("������", 300);
		System.out.println("1st ���� ����");
		System.out.println(ac);
		ac.withdraw(100);
		ac.deposit(500);
		System.out.println("1st ���� ������ ������");
		
	}
}

class BankClass2 extends Thread {
	
	public void run() {
		Account ac = new Account("������", 500);
		System.out.println("2nd ���� ����");
		System.out.println(ac);
		ac.withdraw(300);
		ac.deposit(100);
		System.out.println("2nd ���� ������ ������");
		
	}
}

class Account {
	private String customer;
	private int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String customer, int balance) {
		super();
		this.customer = customer;
		this.balance = balance;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
		System.out.println(customer+"���� ���-----�ݾ�:"+amount+"\n"+toString());
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println(customer+"���� �Ա�+++++�ݾ�:"+amount+"\n"+toString());
	}
	
	@Override
	public String toString() {
		return customer+"���� �ܾ��� "+balance+"�����Դϴ�.";
	}
	
}

public class BankMainClass {

	public static void main(String[] args) {
		System.out.println("�ϳ��� â���� ���� ����");
		
		/*System.out.println("1st ���� ����");
		Account ac1 = new Account("������", 300);
		System.out.println(ac1);
		ac1.withdraw(100);
		ac1.deposit(500);
		System.out.println("1st ���� ������ ������");
		
		System.out.println("2nd ���� ����");
		Account ac2 = new Account("������", 500);
		System.out.println(ac2);
		ac2.withdraw(300);
		ac2.deposit(100);
		System.out.println("2nd ���� ������ ������");*/
		
		
		//Thread ���
		BankClass1 b1 = new BankClass1();
		BankClass2 b2 = new BankClass2();
		
		b1.start();
		b2.start();
		
	}
	
}