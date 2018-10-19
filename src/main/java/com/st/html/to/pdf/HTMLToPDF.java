package com.st.html.to.pdf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class HTMLToPDF {

	public static void generatePDFFromHTML(String filename) throws DocumentException, IOException {
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E:/html.pdf"));
		document.open();
		XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream(filename));
		document.close();
	}

	public static void main(String[] args) throws DocumentException, IOException {
		HTMLToPDF.generatePDFFromHTML("E:/test.html");
	}

}
