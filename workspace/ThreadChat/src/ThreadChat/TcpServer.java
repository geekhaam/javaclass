package ThreadChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class ThreadSend extends Thread {
	private Socket socket;
	private DataOutputStream dos;
	private String chat;
	
	public ThreadSend(Socket socket) throws IOException {
		this.socket = socket;
		dos = new DataOutputStream(socket.getOutputStream());
		chat = "채팅중==>"; //대화시 항상 앞에 붙는 단어
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);		
		while(dos != null) {
			try {
				dos.writeUTF(chat + sc.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
	
class ThreadRcv extends Thread {
	private Socket socket;
	private DataInputStream dis;
	
	public ThreadRcv(Socket socket) throws IOException {
		this.socket = socket;
		dis = new DataInputStream(socket.getInputStream());
	}
	
	public void run() {
		while(dis != null) {
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TcpServer {

	public static void main(String[] args) throws IOException {
		if(args.length != 1) {
			System.out.println("사용법 : java [file name] [port number]");
			System.exit(1);
		}
		
		ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]));
		Socket s = ss.accept();
	
		ThreadSend tSendSer = new ThreadSend(s);
		ThreadRcv tRcvSer = new ThreadRcv(s);
		
		tSendSer.start();
		tRcvSer.start();


	}

}
