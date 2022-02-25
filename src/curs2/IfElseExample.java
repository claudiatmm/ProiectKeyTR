package curs2;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String [] arg){
        String username ="test";
        String password ="test123";

        System.out.println("Introdu usrname:");
        Scanner scan = new Scanner(System.in); //sa ducem in program | functionalitate care exsta in java deja

        String user = scan.next();

        System.out.println("Introdu parola:");
        String pass = scan.next();

        if (username.equals(user)&&password.equals(pass)){
            System.out.println("Login success");
        }  else {
            System.out.println("pass or user wrong");
        }
    }

}
