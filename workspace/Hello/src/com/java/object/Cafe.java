package com.java.object;

class Cafe1 {
	private String bev;
	private int price;
	private String location;
	private String size;
	
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
	public String getBev() {
		return bev;
	}
	public void setBev(String bev) {
		this.bev = bev;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String toString() {
		return bev+"의 사이즈가 "+size+"인 경우 가격은 "+price+"원이며 "
				+location+"지점에서 판매합니다.";
	}
	
}

public class Cafe {

	public static void main(String[] args) {
		String pummok = "coffee**big**1500**jongro";
		//String pummok = "coffee.big.1500.jongro";
		
		Cafe1 c = new Cafe1();
		c.setBev(pummok.split("\\*\\*")[0]); // .만 쓰면 all로 적용되기 때문에 \\.으로 써야 가능하다.(정규표현식)
		c.setSize(pummok.split("\\*\\*")[1]);
		c.setPrice(Integer.parseInt(pummok.split("\\*\\*")[2]));
		c.setLocation(pummok.split("\\*\\*")[3]);
		
		System.out.println(c);

	}

}
