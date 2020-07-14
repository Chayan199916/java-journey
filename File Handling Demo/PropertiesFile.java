import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

    public static void main(String[] args) throws Exception {
        
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("dataCredentials.properties");
        p.setProperty("name", "Ashoka");
        p.setProperty("password", "1234");
        p.setProperty("mail-id", "abc@gmail.com");
        p.store(os, null);

        InputStream is = new FileInputStream("dataCredentials.properties");
        p.load(is);
        // System.out.println(p.getProperty("name")); 
        p.list(System.out);

    }

}