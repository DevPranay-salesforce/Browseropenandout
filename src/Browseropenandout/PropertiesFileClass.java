/*
 * package Browseropenandout;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.io.FileOutputStream; import java.io.IOException; import
 * java.io.InputStream; import java.io.OutputStream; import
 * java.util.Properties;
 * 
 * public class PropertiesFileClass {
 * 
 * public static void writeInToPropertiesFile() throws IOException { Properties
 * prop = new Properties(); File file = new File("Config1/Config.Properties");
 * FileInputStream input = new FileInputStream(file) ; prop.load(input);
 * prop.setProperty("username", "usernameggkggk"); FileOutputStream out = new
 * FileOutputStream(file); prop.store(out, "");
 * 
 * }
 * 
 * 
 * public static String readFromPropertiesFile(String key) throws IOException {
 * Properties prop = new Properties(); File file = new
 * File("Config1/Config.Properties"); FileInputStream input = new
 * FileInputStream(file) ; prop.load(input); return prop.getProperty(key); }
 * 
 * public static void main(String[] args) throws IOException {
 * writeInToPropertiesFile();
 * 
 * System.out.println(readFromPropertiesFile("username"));
 * 
 * } }
 */
package Browseropenandout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class PropertiesFileClass {
    
    public static void writeInToPropertiesFile(String filePath, String key, String value) throws IOException {
        Properties prop = new Properties();
        File file = new File(filePath);
        FileInputStream input = new FileInputStream(file);
        prop.load(input);
        prop.setProperty(key, value);
        FileOutputStream out = new FileOutputStream(file);
        prop.store(out, "");
        out.close();
    }
    
    public static String readFromPropertiesFile(String filePath, String key) throws IOException {
        Properties prop = new Properties();
        File file = new File(filePath);
        FileInputStream input = new FileInputStream(file);
        prop.load(input);
        return prop.getProperty(key);
    }
    
    public static void main(String[] args) throws IOException {
//        String filePath = "Config1\\ConfigFile1.Properties";
//        String key = "username";
       // String value = "ITECHCLOUDSURAT";
        
        writeInToPropertiesFile("Config1\\ConfigFile2.Properties", "Company Name",":SURAT SOFTWARE HUB");
        writeInToPropertiesFile("Config1\\ConfigFile2.Properties", "Address",":VARRACHHA");
        writeInToPropertiesFile("Config1\\ConfigFile2.Properties", "State",":Gujrat");
        writeInToPropertiesFile("Config1\\ConfigFile2.Properties", "Country",":India");
        String retrievedValue1 = readFromPropertiesFile("Config1\\ConfigFile2.Properties","Company Name");
        String retrievedValue2 = readFromPropertiesFile("Config1\\ConfigFile2.Properties","Address");
        String retrievedValue3 = readFromPropertiesFile("Config1\\ConfigFile2.Properties","State");
        String retrievedValue4 = readFromPropertiesFile("Config1\\ConfigFile2.Properties","Country");

        System.out.println("Retrieved value" + retrievedValue1);
        System.out.println("Retrieved value" + retrievedValue2);
        System.out.println("Retrieved value" + retrievedValue3);
        System.out.println("Retrieved value" + retrievedValue4);
    }
}
