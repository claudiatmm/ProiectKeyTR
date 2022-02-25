package curs2;

import java.util.Scanner;

public class IfElseIfExamples {

    public static void main(String [] args){

        System.out.println ("introdu punctaj obtinut:");
        Scanner sscann = new Scanner(System.in);

        int punctaj =sscann.nextInt();
        char calificativ;
        if (punctaj<=60){
            calificativ ='E';
        } else if (punctaj <= 70){
            calificativ ='C';
        }
        else if (punctaj <= 80){
            calificativ ='B';
        }
        else {
            calificativ ='A';
        }


        System.out.println("calificativul este"+calificativ);
    }


}
