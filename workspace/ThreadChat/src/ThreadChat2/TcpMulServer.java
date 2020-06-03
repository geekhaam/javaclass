package ThreadChat2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass {
	
	private ArrayList<ThreadServerClass> threadList = new ArrayList<ThreadServerClass>();
	//private Socket socket; //클라이언트 받아 저장
	//private DataOutputStream outputStream;
	
	public ServerClass(int portNo) throws IOException {
		Socket s = null;
		ServerSocket ss = new ServerSocket(portNo);
		System.out.println("===== 서버 가동 =====");
		while(true) {
			s = ss.accept();
			System.out.println("접속 주소 : "+s.getInetAddress()+", 접속 포트 : "+s.getPort());
			ThreadServerClass tServer = new ThreadServerClass(s);
			tServer.start();
			threadList.add(tServer);
			
			System.out.println("접속자 수 : "+threadList.size()+"명");
		}
	}
	
	public void sendChat(String chat) throws IOException { //서버가 접속한 클라이언트 모두에게 채팅을 전달
		for(ThreadServerClass tsc : threadList) {
			tsc.outputStream.writeUTF(chat);
		}
	}
	
	//ThreadServerClass : 입출력 접속자수, 입출력 자체, ... , 퇴장시 처리
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
					sendChat("===== ["+ nickname +"]님 입장 =====\t" + "(접속자 수 : "+threadList.size()+"명)");
				}
				while(inputStream != null) { 
					sendChat(inputStream.readUTF()); //클라이언트가 보낸 채팅을 접속한 모든 유저에게 보냄
				}
			} catch(IOException e) {
				//e.printStackTrace();
				System.out.println("!!! 서버 에러 !!!");
			} finally {
				for(ThreadServerClass tsc : threadList) {
					if(socket.equals(tsc.socket)) {
						threadList.remove(threadList.indexOf(tsc));
						try {
							sendChat("///// ["+ nickname +"]님 퇴장 /////\t" + "(접속자 수 : "+threadList.size()+"명)");
						} catch(IOException e) {
							//e.printStackTrace();
							System.out.println("!!! 서버 에러 !!!");
						}
					}
				} System.out.println("접속자 수 : "+threadList.size()+"명");
			}
		}
		
	} //ThreadServerClass-End
	
}//ServerClass-End

public class TcpMulServer {

	public static void main(String[] args) throws IOException {
		if(args.length != 1) {
			System.out.println("사용법 : java [file name] [port no]");
			System.exit(1);
		}		
		ServerClass server = new ServerClass(Integer.parseInt(args[0]));

	}

}
