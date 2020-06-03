package TransferFile;

import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.imageio.ImageIO;

public class TcpClientDataIMG {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("127.0.0.1", 9124);
		
		FileOutputStream fos = new FileOutputStream("D:/aa2.png");
		DataInputStream inputStream = new DataInputStream(s.getInputStream());
		
		BufferedImage buffImg = ImageIO.read(inputStream);
		ImageIO.write(buffImg, "png", fos);
		
		s.close();
		System.out.println("jpg 저장 완료");
	}

}
