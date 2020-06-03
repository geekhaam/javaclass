package ThreadChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass {
	
	private ArrayList<ThreadServerClass> threadList = new ArrayList<ThreadServerClass>();
	//private Socket socket; //Ŭ���̾�Ʈ �޾� ����
	//private DataOutputStream outputStream;
	
	public ServerClass(int portNo) throws IOException {
		Socket s = null;
		ServerSocket ss = new ServerSocket(portNo);
		System.out.println("===== ���� ���� =====");
		while(true) {
			s = ss.accept();
			System.out.println("���� �ּ� : "+s.getInetAddress()+", ���� ��Ʈ : "+s.getPort());
			ThreadServerClass tServer = new ThreadServerClass(s);
			tServer.start();
			threadList.add(tServer);
			
			System.out.println("������ �� : "+threadList.size()+"��");
		}
	}
	
	public void sendChat(String chat) throws IOException { //������ ������ Ŭ���̾�Ʈ ��ο��� ä���� ����
		for(ThreadServerClass tsc : threadList) {
			tsc.outputStream.writeUTF(chat);
		}
	}
	
	//ThreadServerClass : ����� �����ڼ�, ����� ��ü, ... , ����� ó��
	class ThreadServerClass extends Thread {
		
		public Socket socket;
		public DataOutputStream outputStream;
		public DataInputStream inputStream;
		
		public ThreadServerClass(Socket s) throws IOException {
			socket = s;
			inputStream = new DataInputStream(s.getInputStream());
			outputStream = new DataOutputStream(s.getOutputStream());
		}
		
		public void run() {
			String nickname = "";
			try {
				if(inputStream != null) {
					nickname = inputStream.readUTF();
					sendChat("===== ["+ nickname +"]�� ���� =====\t" + "(������ �� : "+threadList.size()+"��)");
				}
				while(inputStream != null) { 
					sendChat(inputStream.readUTF()); //Ŭ���̾�Ʈ�� ���� ä���� ������ ��� �������� ����
				}
			} catch(IOException e) {
				//e.printStackTrace();
				System.out.println("!!! ���� ���� !!!");
			} finally {
				for(ThreadServerClass tsc : threadList) {
					if(socket.equals(tsc.socket)) {
						threadList.remove(threadList.indexOf(tsc));
						try {
							sendChat("///// ["+ nickname +"]�� ���� /////\t" + "(������ �� : "+threadList.size()+"��)");
						} catch(IOException e) {
							//e.printStackTrace();
							System.out.println("!!! ���� ���� !!!");
						}
					}
				} System.out.println("������ �� : "+threadList.size()+"��");
			}
		}
		
	} //ThreadServerClass-End
	
}//ServerClass-End

public class TcpMulServer {

	public static void main(String[] args) throws IOException {
		if(args.length != 1) {
			System.out.println("���� : java [file name] [port no]");
			System.exit(1);
		}		
		ServerClass server = new ServerClass(Integer.parseInt(args[0]));

	}

}
