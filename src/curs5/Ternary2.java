package curs5;
import java.util.Scanner;
public class Ternary2 {

    public static void main(String [] arg) {

        int num1;
        int num2;

        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the first number : ");
        num1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        num2 = scan.nextInt();


        String answer;
        // verifica daca fiecare este pozitiv
        //cazul 1 cu if-else
        if(num1>0) {
            System.out.println("Num1 is positive");
        }else {
            System.out.println("Num 1 is negative");
        }
        //cazul2 cu operator ternar
        answer = num1>0 ? "Num1 is positive" : "Num 1 is negative";
        System.out.println(answer);


        // verifica daca ambele sunt pozitive

        if(num1 >0 && num2>0) {
            System.out.println("Both are positive");
        }else {
            System.out.println("One is negative");
        }

        answer = (num1>0)&&(num2>0)? "Both are positive": "One is negative";
        System.out.println(answer);

        // verifica care este cel mai mic numar
        if(num1<num2) {
            System.out.println("Num 1 is the smallest");
        }else if(num1 == num2) {
            System.out.println("Numbers are equal");
        }else {
            System.out.println("Num 2 is the smallest");

        }
        answer = num1==num2?"numbers are equals" :num1<num2 ? "Num 1 is the smallest": "Num 2 is the smallest";


    }

}


