package standart.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");

            System.out.println(username);
            System.out.println(password);
            System.out.println(host);
            System.out.println(port);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Error");
        }

        try{
            Properties properties = new Properties();
            properties.put("database.username", "root");
            properties.put("database.password", "password");
            properties.store(new FileOutputStream("name.properties"), "Configurati User");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Error");
        }



    }
}
