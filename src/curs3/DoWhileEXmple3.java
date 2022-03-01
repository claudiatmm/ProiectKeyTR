package curs3;

import java.util.Scanner;

public class DoWhileEXmple3 {

    public static void main(String[] arg) {

        int num;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("enter a number");
            num = scan.nextInt();
            System.out.println(num * 10);
        } while (num != 0);
    }

}

