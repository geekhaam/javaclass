package com.java.basic;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfElseScanner {
			//���ǹ��� �ܼ� �Է�(Scanner)
	public static void main(String[] args) {
		
		/*Q) 210�� 3�� ����ΰ�? */
		if (210%3 == 0) {
			System.out.println("3�� ���");
		} else {
			System.out.println("3�� ����� �ƴ�");
		}
		
		/*Q) ���� kab�� 75�� ���� ��, ������ 3�� ����̸� "3�� ���"
		 * 5�� ����̸� "5�� ���", 3�� 5�� ���� ����̸� "���� ���"�� ����ϴ�
		 * ���α׷��� �ۼ��Ͻÿ�.
		 */
		int kab = 75; //����if, ��ø if
		if (kab%15 == 0)  // (kab%3==0 && kab%5==0)
			System.out.println("���� ���");
		else if (kab%5 == 0) 
			System.out.println("5�� ���");
		else if (kab%3 == 0)
			System.out.println("3�� ���");
		else 
			System.out.println("�Ѵ� �ƴ�");
		
		/*Q) �񸸵� BMI ���ϱ�*/
		Scanner in = new Scanner(System.in);
		
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = in.nextLine();
		System.out.print("�����Ը� �Է����ּ��� : ");
		/*nextInt() �޼ҵ忡�� ������ �ǳ� �ٴ� ������ �ֱ� ������
		  next()�� ���ڿ��� ������ �̸� Integer.parseInt()�� ���� int�� ��ȯ�Ѵ�.*/
		//int weight = in.nextInt();
		int weight = Integer.parseInt(in.next());
		//System.out.print("Ű�� �Է����ּ��� : ");
		//int height = Integer.parseInt(in.next());
		int height = Integer.parseInt(JOptionPane.showInputDialog("Ű�� �Է����ּ��� : "));
		//-- JOptionPane Ŭ������ Ȱ���� GUI �Է� ���
		double meterHeight = height / 100.0;
		double bmi = weight/(meterHeight*meterHeight);
		//double bmi = weight/(Math.pow(meterHeight, 2.0));
		//-- Math.pow()�Լ��� ���� ����
		System.out.print(bmi + " ");
		if (bmi >= 30) {
			System.out.println("��");
		} else if (bmi >= 25) { //30�̻��� ������ �ɷ����� ������ 30�̸� ���� ����
			System.out.println("��ü��");
		} else if (bmi >= 20) {
			System.out.println("����");
		} else {
			System.out.println("��ü��");
		}
		

	}

}
