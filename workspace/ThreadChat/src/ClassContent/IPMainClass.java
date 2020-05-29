package ClassContent;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class IPMainClass {

	public static void main(String[] args) throws UnknownHostException, SocketException {

				//InetAddress Ŭ������ �ڹ� Ŭ������ IP �ּ� ǥ���� ���� ���
				InetAddress inet1 = InetAddress.getLocalHost(); //Ŭ������.static �޼ҵ�()
				//�ڽ��� ������� localhost(127.0.0.1)�� InetAddress ��ü ����
				
				//ip �ּ�
				System.out.println(inet1.getHostAddress()); //String
				//��, getHostAddress�� IP �ּҸ� ���ڿ��� return
				//dotted decimal address ��) 192.168.0.10
				
				System.out.println(inet1.getHostName()); //String
				//���� ��ǻ�� �̸�
				
				//getAddress() : IP �ּҸ� byte[]�� return
				byte[] byte4 = inet1.getAddress();
				
				for(byte b : byte4) {
					System.out.print((int)b + "\t");
				} System.out.println();
				//byte�̹Ƿ� 127���ʹ� ������ ��� 
				//sbyte : -127 ~ 128
				//byte : 0 ~ 255 �� 256��
				
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
