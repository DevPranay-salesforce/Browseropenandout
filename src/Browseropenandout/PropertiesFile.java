package Browseropenandout;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {
	        Properties properties = new Properties();
	        FileInputStream fileInputStream = null;

	        try {
	            // Load the properties file
         fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);

            // Access the properties
            String browser = properties.getProperty("browser");
            String url = properties.getProperty("url");

            // Use the properties in your Selenium code
            System.out.println("Browser: " + browser);
            System.out.println("URL: " + url);

            // Rest of your Selenium code...
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the FileInputStream
	            if (fileInputStream != null) {
	                try {
	                    fileInputStream.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	}

