package curs8;

public class TestTextFileProcessor {

    public static void main(String[] args) {

        TextFileProcesor txtFile = new TextFileProcesor();
        txtFile.writeToFile("success");
        txtFile.readFile();
        txtFile.addToFile();
        txtFile.deleteFile();
    }
}
