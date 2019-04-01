package com.st.convert.video.img;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.FrameGrabber.Exception;

public class CovertVideoToImg {

	public static void main(String[] args) throws IOException, Exception {
		FFmpegFrameGrabber frameGrabber = new FFmpegFrameGrabber("C:\\Users\\13615\\Desktop\\AwsKey\\check\\abc.mp4");
	    frameGrabber.start();
	    IplImage i;
	    try {

	      i = frameGrabber.grab();
	      BufferedImage  bi = i.getBufferedImage();
	      ImageIO.write(bi,"png", new File("C:\\Users\\13615\\Desktop\\AwsKey\\check\\Img.png"));
	      frameGrabber.stop();
	    } catch (Exception e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();

	}}

}
