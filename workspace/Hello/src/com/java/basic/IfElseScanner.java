package com.java.basic;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfElseScanner {
			//조건문과 콘솔 입력(Scanner)
	public static void main(String[] args) {
		
		/*Q) 210은 3의 배수인가? */
		if (210%3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의 배수가 아님");
		}
		
		/*Q) 변수 kab에 75가 있을 때, 변수가 3의 배수이면 "3의 배수"
		 * 5의 배수이면 "5의 배수", 3과 5의 동시 배수이면 "동시 배수"를 출력하는
		 * 프로그램을 작성하시오.
		 */
		int kab = 75; //다중if, 중첩 if
		if (kab%15 == 0)  // (kab%3==0 && kab%5==0)
			System.out.println("동시 배수");
		else if (kab%5 == 0) 
			System.out.println("5의 배수");
		else if (kab%3 == 0)
			System.out.println("3의 배수");
		else 
			System.out.println("둘다 아님");
		
		/*Q) 비만도 BMI 구하기*/
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		String name = in.nextLine();
		System.out.print("몸무게를 입력해주세요 : ");
		/*nextInt() 메소드에서 가끔씩 건너 뛰는 오류가 있기 때문에
		  next()로 문자열로 받은후 이를 Integer.parseInt()를 통해 int로 변환한다.*/
		//int weight = in.nextInt();
		int weight = Integer.parseInt(in.next());
		//System.out.print("키를 입력해주세요 : ");
		//int height = Integer.parseInt(in.next());
		int height = Integer.parseInt(JOptionPane.showInputDialog("키를 입력해주세요 : "));
		//-- JOptionPane 클래스를 활용한 GUI 입력 방식
		double meterHeight = height / 100.0;
		double bmi = weight/(meterHeight*meterHeight);
		//double bmi = weight/(Math.pow(meterHeight, 2.0));
		//-- Math.pow()함수를 통한 제곱
		System.out.print(bmi + " ");
		if (bmi >= 30) {
			System.out.println("비만");
		} else if (bmi >= 25) { //30이상은 위에서 걸러지기 때문에 30미만 생략 가능
			System.out.println("과체중");
		} else if (bmi >= 20) {
			System.out.println("보통");
		} else {
			System.out.println("저체중");
		}
		

	}

}
