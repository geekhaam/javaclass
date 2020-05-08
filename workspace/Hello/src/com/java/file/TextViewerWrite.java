package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TextViewerWrite {

	public static void main(String[] args) throws IOException {
		//2. Writer
		//Scanner ��� file ���� ��� : Ű���� �Է�
		/*InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(is);*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�Ϲ������� ����� ��, �Ʒ� �� ���� ��ü�� ��� ����Ѵ�.
		/*FileWriter fw = new FileWriter("D:/Java_Web_PM_Class_JB/test.txt", true); //true => append
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw, true); /println() */
		
		PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("D:/Java_Web_PM_Class_JB/test.txt", true)));
			//println() ��� ����
		/* PrintWirter���� true�� ���� �����ϸ�, true�� ������ autoflush ����� ������ �ǹ��Ѵ�.
		flush : ��� ���ۿ� ���ִ� ������ ��Ʈ������ ������ ��
		PrintWriter�� ������ Reader�� ����. */
				
		String s = null;
		while((s=br.readLine()) != null) {
			System.out.println("������");
			pw.println(s);
		} br.close(); pw.close(); //fw.close(); //fr.close();
		

	}

}