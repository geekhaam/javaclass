package EchoUdpServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EchoUDPServer {
	
	public void connect(int portNo) throws IOException {
		byte[] byteArr = new byte[1024];
		
		DatagramSocket ds = new DatagramSocket(portNo); //UDP Socket
		//서버와 클라이언트의 Socket 이름은 같으며, 서버는 인자를 가진 생성자를, 클라이언트는 디폴트 생성자를 사용한다.
		DatagramPacket dpRcv;
		System.out.println("=== UDP 서버 가동 ===");
		
		while(true) {
			dpRcv = new DatagramPacket(byteArr, byteArr.length); //수신을 받기위한 패킷 준비(바이트배열, 길이)
			ds.receive(dpRcv); //dpRcv 사용하여 패킷 수신
			
			//address, port 출력
			InetAddress inetAddress = dpRcv.getAddress();
			int port2 = dpRcv.getPort();
			System.out.println(inetAddress + " 주소는 "+ port2 +"포트를 통해 들어옴");
			System.out.println(dpRcv.getData() + "데이터 내용의 길이는 " + dpRcv.getLength());
			
			DatagramPacket dpSend = new DatagramPacket(dpRcv.getData(), dpRcv.getLength(), dpRcv.getAddress(), dpRcv.getPort());
														//데이터, 길이, 주소, 포트
			ds.send(dpSend); //받은 패킷을 보낸 곳으로 다시 전송 (Echo이므로)
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		if(args.length != 1) {
			System.out.println("!! 인자로 포트 번호를 입력하시오 !!");
			System.exit(0);
		}
		int port = Integer.parseInt(args[0]);
		new EchoUDPServer().connect(port);
	}

}
