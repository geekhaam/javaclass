package EchoProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/* echo program�� ���������(CommandLine Argument)�� �޾Ƽ� ó���غ���
 * + program
 * 30+80	args[0]	args[1]
 */

public class ClaEchoServer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		if(args.length != 1) {
			System.out.println("��ɾ� ���ڷ� ��Ʈ��ȣ�� �����ÿ�");
			System.exit(0);
		}
		
		ServerSocket ss1 = new ServerSocket(Integer.parseInt(args[0]));
		
		Socket s1 = ss1.accept();
		String serverInfo = s1.getInetAddress().getHostAddress();
		
		BufferedReader br1 = new BufferedReader
				(new InputStreamReader(s1.getInputStream()));
		
		BufferedWriter bw1 = new BufferedWriter
				(new OutputStreamWriter(s1.getOutputStream()));
		
		bw1.write("������ "+serverInfo+"�Դϴ�");
		bw1.newLine();
		bw1.flush();
		
		String recv;
		while(true) {
			recv = br1.readLine(); //�� �پ� �Է� ����
			if(recv == null) {
				break;
			}
			bw1.write(recv);
			bw1.newLine();
			bw1.flush();
		}
		s1.close();
		
	}

}
