package ClassContent;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class IPMainClass {

	public static void main(String[] args) throws IOException {

		//InetAddress 클래스는 자바 클래스로 IP 주소 표현을 위해 사용
		InetAddress inet1 = InetAddress.getLocalHost(); //클래스명.static 메소드()
		//자신이 사용중인 localhost(127.0.0.1)의 InetAddress 객체 리턴
		
		//ip 주소
		System.out.println(inet1.getHostAddress()); //String
		//즉, getHostAddress는 IP 주소를 문자열로 return
		//dotted decimal address 예) 192.168.0.10
		
		System.out.println(inet1.getHostName()); //String
		//로컬 컴퓨터 이름
		
		//getAddress() : IP 주소를 byte[]로 return
		byte[] byte4 = inet1.getAddress();
		
		for(byte b : byte4) {
			System.out.print((int)b + "\t");
		} System.out.println();
		//byte이므로 127부터는 음수로 출력 
		//sbyte : -127 ~ 128
		//byte : 0 ~ 255 총 256개
		
		//256 - 64 = 192
		//256 - 88 == 168
		
		byte[] byte5 = new byte[4];
		
		byte5[0] = (byte)-64;
		byte5[1] = (byte)-88;
		byte5[2] = (byte)56;
		byte5[3] = (byte)1;
		
		InetAddress inet2 = InetAddress.getByAddress(byte5);
		System.out.println(inet2);
		System.out.println(inet2.getHostAddress());
				
		
	}
		

}
