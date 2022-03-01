package curs3;

import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String [] arg) {

        System.out.println("Introdu un nr");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }

        System.out.println("------------------");

        int x=1;
        while(x<=10){
            System.out.println(number + "*" + x + "=" + number * x);
            x++;
        }

    }
}
