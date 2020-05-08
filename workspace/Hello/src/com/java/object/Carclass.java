package com.java.object;

class Car {
	private String color;
	private int door;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}

	public void run() {
		System.out.println("달리자");
	}
	public String toString() {
		return "차 색깔은 " + color + "이고 문은 " + door + "개";
	}
}

public class Carclass {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.setColor("Black");
		mycar.setDoor(2);
		
		Car urcar = new Car();
		urcar.setColor("White");
		urcar.setDoor(4);
		
		System.out.println(mycar.getColor() + " " + mycar.getDoor() + "개\n"
				+ urcar.getColor() + " " + urcar.getDoor() + "개");
		mycar.run();
		System.out.println(mycar);

	}

}
