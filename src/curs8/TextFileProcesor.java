package curs8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcesor {

    //sa scriu in fisierul de tip text
    public void writeToFile(String text) {
        try {
            FileWriter mywriter = new FileWriter("filename.txt");
            mywriter.write(text);
            mywriter.close(); // ca la scaner inchid, ca sa nu consume resurse
            System.out.println("success");
        } catch (IOException e) {
            System.out.println("an error ");
            e.printStackTrace();
        }

    }


    //citesc din fisier
    public void readFile() {

        File file = new File("filename.txt");

        try {
            Scanner scan =  new Scanner(file);
            while(scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();


        } catch (FileNotFoundException e) {
            System.out.println("An error has occured!!!");
            e.printStackTrace();
        }

    }



        public void addToFile() {
            try {
                FileWriter myWriter = new FileWriter("filename.txt", true);
                myWriter.write("new line!\n aaa");
                myWriter.close();

            } catch (IOException e) {
                System.out.println("an error ");
                e.printStackTrace();
            }
        }


        public void deleteFile(){
          File myFile = new File("filename.txt");
          myFile.delete();
            System.out.println("deleted file name" + myFile.getName());
        }


}
