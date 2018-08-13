package com.st.Img;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class OrientingImage {

	 public static void main( String[] args ) throws IOException
	  {
	    // loads methods of the opencv library
	    System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
	 
	    // input buffered image object
	    File input = new File("C:\\Users\\13615\\Desktop\\Capture.png");
	    BufferedImage image = ImageIO.read(input);
	 
	    // converting buffered image object to mat object
	    byte[] data = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
	    Mat mat = new Mat(image.getHeight(),image.getWidth(),CvType.CV_8UC3);
	    mat.put(0, 0, data);
	 
	    // creating a new mat object and putting the modified input mat object by using flip()
	    Mat newMat = new Mat(image.getHeight(),image.getWidth(),CvType.CV_8UC3);
	    Core.flip(mat, newMat, -1);  //flipping the image about both axis
	 
	    // converting the newly created mat object to buffered image object
	    byte[] newData = new byte[newMat.rows()*newMat.cols()*(int)(newMat.elemSize())];
	    newMat.get(0, 0, newData);
	    BufferedImage image1 = new BufferedImage(newMat.cols(), newMat.rows(), 5);
	    image1.getRaster().setDataElements(0,0,newMat.cols(),newMat.rows(),newData);
	 
	    File ouptut = new File("C:\\Users\\13615\\Desktop\\result.jpg");
	    ImageIO.write(image1, "jpg", ouptut);
	  }
}
