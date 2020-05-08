package com.java.object;

public class Cellphone {
	private String name;
	private String device;
	private int price;
	private String location;
	
	public Cellphone() {
		// Default Constructor
	}

	public Cellphone(String name, String device, int price, String location) {
		super();
		this.name = name;
		this.device = device;
		this.price = price;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return name + " ������ �ڵ����� ���� ������ ������ �����ϴ�.\n������"
				+device+"�� ������ "+(price/10000)+"�����̰� ����ó�� "+location+"���� �����ϼ̳׿�.";
	}
	
}
