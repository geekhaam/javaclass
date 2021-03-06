package com.java.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

class BaseComponents extends JFrame{
	
	JLabel jlabel;
	JTextField jtextfield; //한 줄
	
	JButton jbutton;
	JComboBox jcombo; //JTextField + JList
	JList jlist;
	
	public BaseComponents() {
		getContentPane().setLayout(new GridLayout(0, 2, 20, 20));
		//임의 행 2열로 그리고 가로 세로 간격은 각각 20픽셀
		jlabel = new JLabel("다 모 아");
		getContentPane().add(jlabel);
		
		jtextfield = new JTextField("글자 넣어봐");
		getContentPane().add(jtextfield);
		
		String [] itemBae =
			{"골프", "수영", "야구", "축구", "농구", "승마", "낚시"};
		jcombo = new JComboBox();
		for(int i=0; i<itemBae.length; i++) {
			jcombo.addItem(itemBae[i]); //ItemEvent : 선택된 아이템이 무엇인지
		}
		getContentPane().add(jcombo);
		
		String[] itemBae2 = {"구두", "가방", "안경", "향수", "양말"};
		jlist = new JList(itemBae2); //배열의 대표명
		jlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//=> 개별적으로 복수 선택 가능(ctrl 누르고 선택하는 방식)
		//.SINGLE_INTERVAL_SELECTION => 연이어서 범위 선택(shift 누르고 선택하는 방식), ctrl 방식 불가
		//.SINGLE_SELECTION => 하나만 선택 가능
		getContentPane().add(jlist);
		
		setBackground(Color.LIGHT_GRAY);
		setSize(800, 800);
		setVisible(true);
	}
}

public class BaseComponentClass {

	public static void main(String[] args) {
		new BaseComponents();

	}

}
