package com.java.string;

public class IndexOf {
	
	public static String[] searchJava(String[] strs) {
		String[] strs2 =new String[strs.length];
		int n = -1;
		for(int i=0; i<strs.length; i++) {
			if(strs[i].toUpperCase().indexOf("JAVA") != -1) {
				n++;
				strs2[n] = strs[i];
			}
		}
		int nullCnt = 0;
		for(int j=0; j<strs2.length; j++) {
			if(strs2[j] == null) {
				nullCnt++;
			}
		}
		String[] returnThis = new String[strs2.length - nullCnt];
		for(int k=0; k<returnThis.length; k++) {
			returnThis[k] = strs2[k];
		}
		return returnThis;
	}

	public static void main(String[] args) {
		String[] bae = {"java Programming",
				"C# Proramming",
				"easy Java Programming",
				"Master of JAVA",
				"C Language and java",
				"Power Builder",
				"Oracle and Java-JDBC"
				};
		
		String[] result = searchJava(bae);
		
		for(String str : result) {
			System.out.println(str);
		}
		
	}

}
