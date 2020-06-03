package TransferFile;

import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;

public class TcpServerDataIMG {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(9124);
		
		while(true) {
			Socket s = ss.accept();
			
			File img = new File("D:/aa.jpg");
			FileInputStream fis = new FileInputStream(img);
			DataInputStream inputStream = new DataInputStream(fis);
			DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
			
			BufferedImage buffImg = ImageIO.read(inputStream);
			ImageIO.write(buffImg, "jpg", outputStream);
			
			s.close();
			System.out.println("jpg º¸³¿");
		}
		
	}

}
