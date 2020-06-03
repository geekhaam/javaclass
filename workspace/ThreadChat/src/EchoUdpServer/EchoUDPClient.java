package EchoUdpServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class EchoUDPClient {
	
	public static void main(String[] args) throws IOException {
		if(args.length != 2) {
			System.out.println("!! 인자로 IP주소와 포트를 입력하시오 !!");
			System.exit(0);
		}
		DatagramSocket ds = new DatagramSocket();
		DatagramPacket dpSend;
		DatagramPacket dpRcv;
		
		byte[] byteArr = new byte[1024];
		
		InetAddress inetAddr = InetAddress.getByName(args[0]);
		int port = Integer.parseInt(args[1]);

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("입력 : ");
			String input = sc.nextLine();
			if(input.length() == 0) {
				break;
			}
			byteArr = input.getBytes();
			dpSend = new DatagramPacket(byteArr, byteArr.length, inetAddr, port);
			ds.send(dpSend);
			
			//byteArr = new byte[1024];
			dpRcv = new DatagramPacket(byteArr, byteArr.length);
			ds.receive(dpRcv);
			String fromServer = new String(byteArr); //dpRcv.getData()
			System.out.println("서버로 부터 되돌아옴 --> " + fromServer);
		}


	}

}
