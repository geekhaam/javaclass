package ThreadChat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		if(args.length != 2) {
			System.out.println("»ç¿ë¹ý : java [file name] [IP Address] [port number]");
			System.exit(1);
		}
		
		Socket s = new Socket(args[0], Integer.parseInt(args[1]));
		ThreadSend tSendSer = new ThreadSend(s);
		ThreadRcv tRcvSer = new ThreadRcv(s);
		
		tSendSer.start();
		tRcvSer.start();

	}

}
