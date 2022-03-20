package curs6;
import java.util.Scanner;


public class ForEachExample3 {
    public static void main(String[] args) {

        System.out.println("Te rog introdu un text:");
        Scanner scan =  new Scanner(System.in);
        String text =  scan.next();
        scan.close();

        //caut litera A in textul masina
        //masina --> String --> este o secventa de caractere
        //012345


        boolean letterFound = false;
        int counter = 0;

        /*
         * for(int i=0;i<text.length();i++) {
         *
         * char currentLetter = text.charAt(i);
         *
         * if(currentLetter == 'A' || currentLetter == 'a') {
         * //System.out.println("Letter 'A' is present in text  at index :" + i);
         * letterFound = true; counter++; //break; } }
         */


        //"masina" --> char[] charArray = {'m', 'a', 's', 'i', 'n', 'a'}
        char[] charArray = text.toCharArray();
        for(char ch : charArray) {

            if(ch == 'A' || ch == 'a') {
                //System.out.println("Letter 'A' is present in text  at index :" + i);
                letterFound =  true;
                counter++;
                //break;
            }
        }




        if(letterFound) {
            System.out.println("Letter 'A' is present in text " + counter + " times");

        }else {
            System.out.println("Litera 'A' nu a fost gasita!");

        }

    }

}
