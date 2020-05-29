package ClassContent;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPByName {

	public static void main(String[] args) throws UnknownHostException {
		
		//도메인 네임으르 서버 IP 주소 받아오기 getByName
		String addr = "www.naver.com";
		InetAddress inet1 = InetAddress.getByName(addr);
		
		System.out.println(inet1.getHostAddress()); //dotted decimal address
		System.out.println(inet1.getHostName()); //domain name

		System.out.println("-----------------------------");
		
		//도메인의 서버 IP 주소가 여러개일 경우 getAllByName
		InetAddress[] inetArr = InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress ia : inetArr) {
			System.out.println(ia);
			System.out.println(ia.getHostAddress());
			System.out.println(ia.getHostName());
		}
		
		System.out.println("-----------------------------");
		
		//InetAddress 클래스는 IP주소 표현을 위해 사용
		InetAddress inet2 = InetAddress.getLocalHost();
		
		byte[] byte4 = inet2.getAddress();
		for(byte b : byte4) {
			if((int)b < 0) {
				System.out.print(((int)b+256)+"\t");				
			} else {
				System.out.print((int)b+"\t");						
			}
		}
		System.out.println();
		
		//IP 주소 음수->양수		방법2 (bit 연산)
		int cnt = 0;
		StringBuilder sbAddress = new StringBuilder();
		for(byte b : byte4) {
			sbAddress.append(b & 0xFF);
			
			cnt += 1;
			if(cnt < 4) {
				sbAddress.append(".");
			}
		}
		System.out.println(sbAddress.toString());
	}

}
