package TransferFile;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TransferImageFIle {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/aa.jpg");
		BufferedImage buffImage = ImageIO.read(file); //���� ���� read
		
		File file2 = new File("D:/bb.jpg");
		ImageIO.write(buffImage, "jpg", file2); //������.jpg write
		System.out.println("jpg �����");
		
		File file3 = new File("D:/cc.gif");
		ImageIO.write(buffImage, "gif", file3); //gif
		System.out.println("gif �����");
		
		File file4 = new File("D:/dd.png");
		ImageIO.write(buffImage, "png", file4); //png
		System.out.println("png �����");
	}

}
