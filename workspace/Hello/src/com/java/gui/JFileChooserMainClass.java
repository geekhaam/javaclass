package com.java.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

//JavaFX -> xml로 코딩 -> tool : SceneBuilder
//Swing -> tool : WindowBuilder (수업 시간에 사용할 tool)

class JFileChooserClass extends JFrame implements ActionListener{
	
	JFileChooser jfilechooser;
	JButton jbutton1, jbutton2;
	JLabel jlabel;
	
	public JFileChooserClass() {
		setLayout(new FlowLayout());
		
		jfilechooser = new JFileChooser("D:");
		
		jbutton1 = new JButton("파일 선택");
		add(jbutton1); //contentPane 없어도 된다.
		jbutton1.addActionListener(this); //버튼1 이벤트 등록
		
		jbutton2 = new JButton("파일 저장");
		add(jbutton2);
		jbutton2.addActionListener(this); //버튼2 이벤트 등록
		
		jlabel = new JLabel("파일 경로");
		add(jlabel);
		
		setSize(700, 700);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbutton1) {
			int isOpenClose = jfilechooser.showOpenDialog(jbutton1);
			//파일 선택에 대한 반환값				//열기-윈도우 탐색기
			File filePath = jfilechooser.getSelectedFile();//경로 + 파일
			
			//정상적으로 파일을 선택했는지 체크
			if(isOpenClose == JFileChooser.APPROVE_OPTION) { //0은 열기, 1은 저장
							// == 아니면 취소를 눌렀거나 다른 에러가 발생한 경우임
				jlabel.setText("파일 경로 및 이름 : " + filePath); //getText() 참고
				System.out.println(filePath);
			}
		}
		if(e.getSource() == jbutton2) {
			int isOpenClose = jfilechooser.showSaveDialog(jbutton2);
			File dirPath = jfilechooser.getSelectedFile();
			//String fileString = jfilechooser.getSelectedFile().getName(); => 파일 이름만
			if(isOpenClose == JFileChooser.APPROVE_OPTION) {
				jlabel.setText("저장할 경로 및 이름 : " + dirPath);
				System.out.println(dirPath);
			}
		}
		
	}
	
}

public class JFileChooserMainClass {

	public static void main(String[] args) {
		new JFileChooserClass();

	}

}
