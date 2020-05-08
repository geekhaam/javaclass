package com.java.exception;
import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		try {
			/*Scanner sc = new Scanner(System.in);
			
			System.out.print("첫번째 수 : ");
			String one = sc.nextLine();
			
			int num = Integer.parseInt(one);
			
			System.out.print("두번째 수 : ");
			String two = sc.nextLine();
			int num2 = Integer.parseInt(two);*/
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println(num1/num2);
			
			/* Exception (모든 예외)
			 *  - ArrayIndexOutOfBoundsException (배열에서 인덱스를 벗어난 경우의 예외)
			 * 	- NumberFormatException (숫자 형식이 아닐 경우 예외)
			 * 	- ArithmeticException (0이 들어와 에러가 발생하는 경우에 대한 예외)
			 */
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 넣어주세요");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 입력해주세요");
		} catch(ArithmeticException e) {
			System.out.println("0이 아닌 다른 값을 입력하세요");
		} catch(Exception e) {
			System.out.println("0이 아닌 두 개의 정수를 입력하세요");
			System.out.println(e); //toString()
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Finally good");
		}
	}

}
