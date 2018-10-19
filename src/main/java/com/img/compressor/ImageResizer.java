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

	public static void main(String[] args) throws IOException {
		BufferedImage resizedImage = null;
		BufferedImage bufferedImage = null;

		bufferedImage = ImageIO.read(new File("E:/ImageStore/32-bit-before.jpg"));

		/*
		 * if (bufferedImage.getWidth() >= 1000 && bufferedImage.getHeight() >= 1000) {
		 * resizedImage = Scalr.resize(bufferedImage, Mode.FIT_TO_WIDTH, 750, 750); }
		 * else if (bufferedImage.getWidth() >= 500 && bufferedImage.getHeight() >= 500)
		 * { resizedImage = Scalr.resize(bufferedImage, Mode.FIT_TO_WIDTH, 500, 500); }
		 * else { resizedImage = Scalr.resize(bufferedImage, Mode.FIT_TO_WIDTH, 300,
		 * 200); }
		 */
		int maxWidth = 385;
		int maxHeight = 428;
		Mode mode = Mode.AUTOMATIC;
		int maxSize = Math.min(maxWidth, maxHeight);
		double dh = (double) bufferedImage.getHeight();
		if (dh > Double.MIN_VALUE) {
			double imageAspectRatio = (double) bufferedImage.getWidth() / dh;
			if (maxHeight * imageAspectRatio <= maxWidth) {
				maxSize = maxHeight;
				mode = Mode.FIT_TO_HEIGHT;
			} else {
				maxSize = maxWidth;
				mode = Mode.FIT_TO_WIDTH;
			}
		}
		// resizedImage = Scalr.resize(bufferedImage, Method.QUALITY, mode, maxSize,
		// Scalr.OP_ANTIALIAS) ;
		resizedImage = Scalr.resize(bufferedImage, Mode.FIT_EXACT, 428, 385);
		ImageIO.write(resizedImage, "jpg", new File("E:/ImageStore/32-bit-before1.jpg"));

	}
}
