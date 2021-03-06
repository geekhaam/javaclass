package com.java.thread;

class BankClass1 extends Thread {
	
	public void run() {
		Account ac = new Account("정은주", 300);
		System.out.println("1st 고객 입장");
		System.out.println(ac);
		ac.withdraw(100);
		ac.deposit(500);
		System.out.println("1st 고객 은행을 나간다");
		
	}
}

class BankClass2 extends Thread {
	
	public void run() {
		Account ac = new Account("서원국", 500);
		System.out.println("2nd 고객 입장");
		System.out.println(ac);
		ac.withdraw(300);
		ac.deposit(100);
		System.out.println("2nd 고객 은행을 나간다");
		
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
		System.out.println(customer+"님의 출금-----금액:"+amount+"\n"+toString());
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println(customer+"님의 입금+++++금액:"+amount+"\n"+toString());
	}
	
	@Override
	public String toString() {
		return customer+"님의 잔액은 "+balance+"만원입니다.";
	}
	
}

public class BankMainClass {

	public static void main(String[] args) {
		System.out.println("하나의 창구를 가진 은행");
		
		/*System.out.println("1st 고객 입장");
		Account ac1 = new Account("정은주", 300);
		System.out.println(ac1);
		ac1.withdraw(100);
		ac1.deposit(500);
		System.out.println("1st 고객 은행을 나간다");
		
		System.out.println("2nd 고객 입장");
		Account ac2 = new Account("서원국", 500);
		System.out.println(ac2);
		ac2.withdraw(300);
		ac2.deposit(100);
		System.out.println("2nd 고객 은행을 나간다");*/
		
		
		//Thread 사용
		BankClass1 b1 = new BankClass1();
		BankClass2 b2 = new BankClass2();
		
		b1.start();
		b2.start();
		
	}
	
}
