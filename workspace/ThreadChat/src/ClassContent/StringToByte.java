package ClassContent;

public class StringToByte {

	public static void main(String[] args) {
		// String name = "온달";
		String name = "온달";
		
		byte[] bytes = name.getBytes();
		
		for(byte b : bytes) {
			System.out.print((int)b + "\t");
		} System.out.println();
		
		String name2 = new String(bytes);
		System.out.println(name2);
		
				
	}

}
