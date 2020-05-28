package com.java.wb;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JFrame;

class EDisplay extends JFrame implements ActionListener {
	
	static int sw = 0;
	static String s = "				I LOVE YOU";
	Timer t = new Timer();
	
	//GUI
	private Button b1 = new Button("Ω√¿€");
	private Button b2 = new Button("≥°");
	private TextField tf = new TextField();
	
	public EDisplay() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class ElectronicDisplay {

	public static void main(String[] args) {
		
		new EDisplay();
	}
}
