package EchoProgram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss1 = new ServerSocket(7114); //listen
		
		Socket s1 = ss1.accept();
		
		InputStream is1 = s1.getInputStream(); //소켓에서 입력스트림 얻기
		OutputStream os1 = s1.getOutputStream(); //소켓에서 출력스트림 얻기
		
		int b1; //byte stream을 처리
		while(true) {
			b1 = is1.read(); //문자열 읽기 Client --> Server (한 글자씩 입력 받음)
			if(b1 == -1) {
				break;
			}
			os1.write(b1); //문자열 출력 Server --> Client
		}
		
	}
	//실행은 Server 먼저 한 후 Client 실행
}
