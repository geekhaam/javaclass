package com.java.object;

public class BBang2 {
	private String bbang;
	private int price;
	
	public BBang2() {
		// Default Constructor
	}
	public BBang2(String bbang, int price) {
		super();
		this.bbang = bbang;
		this.price = price;
	}

	public String getBbang() {
		return bbang;
	}
	public void setBbang(String bbang) {
		this.bbang = bbang;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BBang2 [bbang=" + bbang + ", price=" + price + "]";
	}
	
}
