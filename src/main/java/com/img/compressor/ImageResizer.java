package com.img.compressor;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;

import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;
import org.imgscalr.Scalr.Mode;

public class ImageResizer {

	public static BufferedImage resizeAndCropToCenter(BufferedImage image, int width, int height) {
		/*image = Scalr.resize(image, Scalr.Method.QUALITY, Scalr.Mode.FIT_TO_WIDTH, width * 2, height * 2,
				Scalr.OP_ANTIALIAS);*/
		

		return Scalr.resize(image, 300, Scalr.OP_ANTIALIAS);
	}

	public static void main(String[] args) throws IOException {

		BufferedImage bufferedImage = resizeAndCropToCenter(ImageIO.read(new File("E:/ImageStore/images.jpeg")),300,300);

		ImageIO.write(bufferedImage, "jpg", new File("E:/ImageStore/images1.jpeg"));

	}
	
	/*public static void main(String[] args) {
		try {
			BufferedImage originalImgage = ImageIO.read(new File("E:/ImageStore/32-bit-before.jpg"));
			
			System.out.println("Original Image Dimension: "+originalImgage.getWidth()+"x"+originalImgage.getHeight());

			BufferedImage SubImgage = originalImgage.getSubimage(300, 150, 300, 300);
			System.out.println("Cropped Image Dimension: "+SubImgage.getWidth()+"x"+SubImgage.getHeight());

			File outputfile = new File("E:/ImageStore/32-bit-before12.jpg");
			ImageIO.write(SubImgage, "jpg", outputfile);

			System.out.println("Image cropped successfully: "+outputfile.getPath());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}
