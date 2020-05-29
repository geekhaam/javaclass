package ClassContent;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPByName {

	public static void main(String[] args) throws UnknownHostException {
		
		//������ �������� ���� IP �ּ� �޾ƿ��� getByName
		String addr = "www.naver.com";
		InetAddress inet1 = InetAddress.getByName(addr);
		
		System.out.println(inet1.getHostAddress()); //dotted decimal address
		System.out.println(inet1.getHostName()); //domain name

		System.out.println("-----------------------------");
		
		//�������� ���� IP �ּҰ� �������� ��� getAllByName
		InetAddress[] inetArr = InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress ia : inetArr) {
			System.out.println(ia);
			System.out.println(ia.getHostAddress());
			System.out.println(ia.getHostName());
		}
		
		System.out.println("-----------------------------");
		
		//InetAddress Ŭ������ IP�ּ� ǥ���� ���� ���
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
		
		//IP �ּ� ����->���		���2 (bit ����)
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
