package ThreadChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class ThreadClientSendClass extends Thread {
	public Socket socket;
	public DataOutputStream outputStream;
	public String nickname;
	
	public ThreadClientSendClass(Socket socket, String nickname) throws IOException {
		this.socket = socket;
		outputStream = new DataOutputStream(socket.getOutputStream());
		this.nickname = nickname;
	}
	
	public void run() {
		Scanner in = new Scanner(System.in);
		try {
			if(outputStream != null) {
				outputStream.writeUTF(nickname);
			}
			while(outputStream != null) {
				outputStream.writeUTF("["+ nickname +"] "+ in.nextLine());
			}
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println("!!! 클라이언트 에러 !!!");
		}
	}
	
}

class ThreadClientRcvClass extends Thread {
	public Socket socket;
	public DataInputStream inputStream;
	
	public ThreadClientRcvClass(Socket socket) throws IOException {
		this.socket = socket;
		inputStream = new DataInputStream(socket.getInputStream());
	}
	
	public void run() {
		try {
			while(inputStream != null) {
				System.out.println(inputStream.readUTF());
			}
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println("!!! 클라이언트 에러 !!!");
		}
	}
}

public class TcpMulClient {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("사용법 : java [file name] [ip address] [port no] [nickname]");
			System.exit(1);
		}
		try {
			Socket s = new Socket(args[0], Integer.parseInt(args[1]));
			System.out.println("===== 서버에 연결 =====");
																		//nickname
			ThreadClientSendClass tcSend = new ThreadClientSendClass(s, args[2]);
			ThreadClientRcvClass tcRcv = new ThreadClientRcvClass(s);
			
			Thread tSend = new Thread(tcSend);
			Thread tRcv = new Thread(tcRcv);
			
			tSend.start();
			tRcv.start();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("!!! 클라이언트 에러 !!!");
		}
	}

}
