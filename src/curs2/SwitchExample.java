package curs2;

import java.util.Locale;
import java.util.Scanner;

public class SwitchExample {

    public static void main(String [] args){
        System.out.println ("introdu calificativ:");

        Scanner scan = new Scanner(System.in);
        String calificativ = scan.next();

        // System.out.println ("test".toUpperCase);
        switch(calificativ.toUpperCase(){

            case "A":
                System.out.println("great");
                break;

            case "B" :
                System.out.println("good");
                break;

            case "C" :
                System.out.println("good");
                break;

            default:
                System.out.println ("introdu ceva..");

        }


    }
}
