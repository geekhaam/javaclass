package com.java.inheritance;

public class Parent {
	
	protected String addr;
	
	public Parent() {
		System.out.println("Parent 100");
	}
	
	public Parent(int age) {
		System.out.println("Parent" + age);
	}

	public void flex() {
		System.out.println("A lot of money");
	}
	
	public static void main(String[] args) {
		
	}
	
}

class Child extends Parent {
	protected int age;
	
	public Child(String addr, int age) {
		super(age);
		this.addr = addr;
		this.age = age;
		System.out.println("Child Constructor");
	}
	
	public Child() {
		// Default Constructor
	}
}

