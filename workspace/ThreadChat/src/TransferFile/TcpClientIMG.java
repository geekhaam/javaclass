package TransferFile;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

import javax.imageio.ImageIO;

public class TcpClientIMG {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 7883);
		
		BufferedImage buffImg = ImageIO.read(s.getInputStream());
		
		File img = new File("D:/aa2.png");
		ImageIO.write(buffImg, "png", img);
		System.out.println("png∑Œ ¿˙¿Â");
		
		s.close();
		
	}

}
