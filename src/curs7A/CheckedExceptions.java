package curs7A;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptions {

    public static void main(String[] args) {

        try {
            Scanner scan =  new Scanner(new File("test.txt"));

        } catch (FileNotFoundException e) {

            System.out.println("Error!");
            e.printStackTrace();
        }

        System.out.println("Test");


        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        //checked exception -- te anunta compilatorul --> compilatorul stie pentru ca in
        //clasa pe care o chemi --> se arunca o exceptie



    }
}
