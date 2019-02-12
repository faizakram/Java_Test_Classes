package com.st.Img;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class OrientingImage {

	public static void main(String[] args) throws IOException {

		/*File input = new File("C:\\Users\\13615\\Desktop\\img.jpg");
		BufferedImage thumb = ImageIO.read(input);

		thumb = Scalr.resize(thumb, Method.SPEED, thumb.getWidth(),
				thumb.getWidth(), Scalr.OP_ANTIALIAS);

		File ouptut = new File("C:\\Users\\13615\\Desktop\\testa1.jpg");
		ImageIO.write(thumb, "jpg", ouptut);*/
		
		
		 File input = new File("C:\\Users\\13615\\Desktop\\car1.png");
		    BufferedImage image = ImageIO.read(input);

		    File compressedImageFile = new File("C:\\Users\\13615\\Desktop\\car1Compress.png");
		    OutputStream os = new FileOutputStream(compressedImageFile);

		    Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
		    ImageWriter writer =  writers.next();

		    ImageOutputStream ios = ImageIO.createImageOutputStream(os);
		    writer.setOutput(ios);

		    ImageWriteParam param = writer.getDefaultWriteParam();

		    //param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
		    //param.setCompressionQuality(0.2f);  // Change the quality value you prefer
		   // writer.write(null, new IIOImage(image, null, null), param);
		    
		    writer.write(image);
		    os.close();
		    ios.close();
		    writer.dispose();
	}
	
	public static byte[] setGlitchQuality(byte[] inputImageBytes, int quality) throws Exception
	{
		Iterator<ImageWriter> iter = ImageIO.getImageWritersByFormatName("png");
		ImageWriter writer = (ImageWriter)iter.next();  
		ImageWriteParam iwp = writer.getDefaultWriteParam(); 
	    BufferedImage originalImage = ImageIO.read(new ByteArrayInputStream(inputImageBytes)); 
	    IIOImage image = new IIOImage(originalImage, null, null);
	    ByteArrayOutputStream out=new ByteArrayOutputStream();
	    ImageOutputStream imageOut=ImageIO.createImageOutputStream(out);
	    writer.setOutput(imageOut);  
	    writer.write(null, image, iwp);  
	    byte[] qualityImageBytes = out.toByteArray();
	    return qualityImageBytes;
	}
}
