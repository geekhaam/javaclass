package com.java.basic;

public class CommandLine {

	public static void main(String[] args) {
		//��ɾ� ���� ==> ���������(commandline argument)
					//��) String[] args
		
		//��ɾ� : plus 30 80
		//			(���������)
		//args[0] = "30"
		//args[1] = "80"

		if(args.length != 2) {
			System.out.println("������ java com.java.basic.CommandLine [����1] [����2]");
			return;
			//System.exit(-1); //C : exit(-1); C# : Environment.Exit(-1)
		}
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));			
		
	}

}
