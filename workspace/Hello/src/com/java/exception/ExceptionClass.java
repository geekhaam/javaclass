package com.java.exception;
import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		try {
			/*Scanner sc = new Scanner(System.in);
			
			System.out.print("ù��° �� : ");
			String one = sc.nextLine();
			
			int num = Integer.parseInt(one);
			
			System.out.print("�ι�° �� : ");
			String two = sc.nextLine();
			int num2 = Integer.parseInt(two);*/
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println(num1/num2);
			
			/* Exception (��� ����)
			 *  - ArrayIndexOutOfBoundsException (�迭���� �ε����� ��� ����� ����)
			 * 	- NumberFormatException (���� ������ �ƴ� ��� ����)
			 * 	- ArithmeticException (0�� ���� ������ �߻��ϴ� ��쿡 ���� ����)
			 */
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ڸ� �־��ּ���");
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� �Է����ּ���");
		} catch(ArithmeticException e) {
			System.out.println("0�� �ƴ� �ٸ� ���� �Է��ϼ���");
		} catch(Exception e) {
			System.out.println("0�� �ƴ� �� ���� ������ �Է��ϼ���");
			System.out.println(e); //toString()
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Finally good");
		}
	}

}
