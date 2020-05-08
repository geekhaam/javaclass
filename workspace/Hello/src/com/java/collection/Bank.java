package com.java.collection;

import java.util.ArrayList;

class Account {
	private int accountId;
	private String name;
	private String tel;
	private long balance;
	public Account() {
		// default constructor
	}
	public Account(int accountId, String name, String tel, long balance) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.tel = tel;
		this.balance = balance;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String toString() {
		return "고객의 첫 거래 정보입니다. [계좌번호는 "+accountId+"번, 성함: "+name+", 전화번호: "+tel
				+", 잔액: "+balance+"원 입니다.]";
	}
}

public class Bank {

	public static void main(String[] args) {
		/*Q1) 은행 방문 고객 순서대로 객체를 만들어 ArrayList에 넣고 출력하시오
		 * (고객은 현재 5명, 필드 accountId, name, tel, balance)
		 */
		Account a1 = new Account(1, "이창호", "010-1234-5678", 1000);
		Account a2 = new Account(2, "양수영", "010-2222-4321", 10000);
		Account a3 = new Account(3, "박건민", "010-3231-4331", 100000);
		Account a4 = new Account(4, "이송훈", "010-1251-8458", 1000000);
		Account a5 = new Account(5, "송진아", "010-7777-8888", 10000000);
		
		ArrayList<Account> arr = new ArrayList<Account>();
		arr.add(a1);
		arr.add(a2);
		arr.add(a3);
		arr.add(a4);
		arr.add(a5);
		
		for(Account ac : arr) {
			System.out.println(ac);
		}
		
		for(Account ac : arr) {
			System.out.println(ac.getName());
		}
		
	}

}
