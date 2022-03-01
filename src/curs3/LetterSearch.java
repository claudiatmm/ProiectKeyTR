package curs3;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String [] arg) {

        System.out.println("Introdu un text");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        scan.close(); //am incarcat textul intr-o variablia si dupa pot sa inchid canalul de comunicare

        boolean letterFound = false;
        int counter =0;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);

            if(currentLetter== 'A'|| currentLetter == 'a'){
            System.out.println("letter " + i);}
            letterFound =true;
            counter++;
           // break; // cand o gasit A se opreste; se ruleza de 2ori
        }

        if (letterFound == true){
            System.out.println("letter is present in text" +counter);
        } else{
            System.out.println("nu a fost gasita");
        }



    }
}
