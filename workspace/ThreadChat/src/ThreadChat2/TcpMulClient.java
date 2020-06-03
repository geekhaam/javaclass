package ThreadChat2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpMulClient {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("사용법 : java [file name] [IP Address] [port no] [nickname]");
			System.exit(1);
		}
		
		try {
			Socket s = new Socket(args[0], Integer.parseInt(args[1]));
			System.out.println("=== 서버 연결 ===");
			
			DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
			DataInputStream inputStream = new DataInputStream(s.getInputStream());
			outputStream.writeUTF("##" + args[2]); //닉네임 서버에 전달
			
			new ChatClientGUI(outputStream, inputStream, args[2]) {
				public void closeWork() throws IOException {
					outputStream.close();
					inputStream.close();
					System.exit(0);
				}
			};
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
