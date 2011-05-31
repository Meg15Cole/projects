package java112.labs2;

import java.util.*;
import java.io.*;

public class LabThree  {

    private Properties properties;

    public void run(String propertiesFilePath) {

        loadProperties(propertiesFilePath);
        System.out.println("Author's name.." + properties.getProperty("author.name"));
        System.out.println("Author's email.." + properties.getProperty("author.email"));
        System.out.println("Class day.." + properties.getProperty("section.day"));
        System.out.println("Class time.." + properties.getProperty("section.time"));
    }

    public void loadProperties(String propertiesFilePath)  {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        }
        catch(IOException ioe) {
            System.out.println("Can't load the properties file");
            ioe.printStackTrace();
        }
        catch(Exception e) {
            System.out.println("Problem: " + e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LabThree lab = new LabThree();
        lab.run(args[0]);
    }

}
