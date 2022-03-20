package curs8;

import java.io.*;
import java.util.Properties;

public class PropertiesFileProcessor {

    public void writePropertiesFile() throws IOException {
        try {
            OutputStream outputStrem = new FileOutputStream("test.properties");
            Properties file = new Properties();
            //defineste proprietati de key - valoare
            file.setProperty("username", "oana");
            file.setProperty("password", "aaa");
            file.setProperty("email", "oana@yahoo.com");

            file.store(outputStrem, "am salvat fisierul");
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //metoda sa citesca din fisierul respectiv
    public void readPropertiesFile(String key) throws IOException {
        try {
            InputStream inputStream = new FileInputStream("test.properties");

            Properties file = new Properties();
            file.load(inputStream);

            //String value = file.getProperty(key);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
