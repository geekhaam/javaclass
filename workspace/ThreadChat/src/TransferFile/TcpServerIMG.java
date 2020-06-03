package TransferFile;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;

public class TcpServerIMG {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(7883);
		while(true) {
			Socket s = ss.accept();
			System.out.println(s.getInetAddress() + "에서 접속");
	
			File img = new File("D:/aa.jpg");
			//System.out.println(img.canRead());
			BufferedImage buffImg = ImageIO.read(img);
			
			ImageIO.write(buffImg, "jpg", s.getOutputStream());
			s.close();
			
			System.out.println("jpg 전송");
		}

	}

}
