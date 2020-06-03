package EchoUdpServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EchoUDPServer {
	
	public void connect(int portNo) throws IOException {
		byte[] byteArr = new byte[1024];
		
		DatagramSocket ds = new DatagramSocket(portNo); //UDP Socket
		//������ Ŭ���̾�Ʈ�� Socket �̸��� ������, ������ ���ڸ� ���� �����ڸ�, Ŭ���̾�Ʈ�� ����Ʈ �����ڸ� ����Ѵ�.
		DatagramPacket dpRcv;
		System.out.println("=== UDP ���� ���� ===");
		
		while(true) {
			dpRcv = new DatagramPacket(byteArr, byteArr.length); //������ �ޱ����� ��Ŷ �غ�(����Ʈ�迭, ����)
			ds.receive(dpRcv); //dpRcv ����Ͽ� ��Ŷ ����
			
			//address, port ���
			InetAddress inetAddress = dpRcv.getAddress();
			int port2 = dpRcv.getPort();
			System.out.println(inetAddress + " �ּҴ� "+ port2 +"��Ʈ�� ���� ����");
			System.out.println(dpRcv.getData() + "������ ������ ���̴� " + dpRcv.getLength());
			
			DatagramPacket dpSend = new DatagramPacket(dpRcv.getData(), dpRcv.getLength(), dpRcv.getAddress(), dpRcv.getPort());
														//������, ����, �ּ�, ��Ʈ
			ds.send(dpSend); //���� ��Ŷ�� ���� ������ �ٽ� ���� (Echo�̹Ƿ�)
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		if(args.length != 1) {
			System.out.println("!! ���ڷ� ��Ʈ ��ȣ�� �Է��Ͻÿ� !!");
			System.exit(0);
		}
		int port = Integer.parseInt(args[0]);
		new EchoUDPServer().connect(port);
	}

}
