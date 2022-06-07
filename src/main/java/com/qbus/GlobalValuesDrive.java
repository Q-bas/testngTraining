package com.qbus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/java/com/qbus/data.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        prop.setProperty("browser", "firefox");
        System.out.println(prop.getProperty("browser"));
        FileOutputStream  fos = new FileOutputStream("src/main/java/com/qbus/data.properties");
        prop.store(fos, null);

        
    }
}
