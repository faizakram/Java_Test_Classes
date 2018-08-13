import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReaderProp {

	private final Properties configProp = new Properties();

    /**
     * read property file
     * 
     * @param propertyName
     * @param path
     * 
     * @throws IOException
     */
    public ReaderProp(String propertyName, String path) {
        try {
            InputStream in;
            File file;

            if (path.equals("")) {
                in = this.getClass().getClassLoader().getResourceAsStream(propertyName);
            }
            else {
                file = new File(path + propertyName);
                in = new FileInputStream(file);
            }
            configProp.load(in);
        }
        catch (IOException e) {

        }
    }

    
  
     
    public static void main(String[] args) {
        ReaderProp  readerProp = new ReaderProp("error.properties",new File("").getAbsolutePath()+"\\src\\");
        System.out.println(readerProp.configProp.get("E1000_SE_ERROR-CODE"));// output E1000
    } 
}


