package curs8;

import java.io.IOException;

public class TestPropertiesFile {

    public static void main(String[] args) throws IOException {

        PropertiesFileProcessor propFile =  new PropertiesFileProcessor();

        propFile.writePropertiesFile();
        propFile.readPropertiesFile("email");

        propFile.readPropertiesFile("password");

    }
}
