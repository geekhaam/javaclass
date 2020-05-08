package com.java.basic;

public class CommandLine {

	public static void main(String[] args) {
		//명령어 인자 ==> 명령행인자(commandline argument)
					//예) String[] args
		
		//명령어 : plus 30 80
		//			(명령행인자)
		//args[0] = "30"
		//args[1] = "80"

		if(args.length != 2) {
			System.out.println("사용법은 java com.java.basic.CommandLine [숫자1] [숫자2]");
			return;
			//System.exit(-1); //C : exit(-1); C# : Environment.Exit(-1)
		}
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));			
		
	}

}
