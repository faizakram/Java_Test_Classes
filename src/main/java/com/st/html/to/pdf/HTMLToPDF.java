package com.st.html.to.pdf;

public class HTMLToPDF {

	/*public static void generatePDFFromHTML() throws DocumentException, IOException {
		ByteArrayInputStream css = new ByteArrayInputStream(
				FileUtils.readFileToByteArray(new File("E:/report/style.css")));
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E:/htmql.pdf"));
		document.open();
		XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream("E:/report/final_invoice.html"),
				new FileInputStream("E:/report/style.css"));
		document.close();
	}*/

	/*public static void main(String[] args) throws DocumentException, IOException {
		//HTMLToPDF.generatePDFFromHTML();
		
		Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E:/report/Reportpdf.pdf"));
        // step 3
        document.open();
        // step 4
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream("E:/report/final_invoice.html")); 
        //step 5
         document.close();
 
        System.out.println( "PDF Created!" );
	}*/

}
