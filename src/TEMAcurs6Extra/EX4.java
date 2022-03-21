package TEMAcurs6Extra;

import java.util.Scanner;

public class EX4 {

    //Scriem un program care valideaza ca o parola introdusa
    //respecta anumite reguli.
    // Programul intreaba userul un username si o parola.
    // Dupa care va aplica urmatoarele reguli de validare asupra parolei:

    //Reguli :
    // 1. Parola sa aiba 10 caractere
    // 2. Sa aiba cel putin un caracter upperCase
    // 3. Sa nu fie la fel ca usernameul
    // Cand userul introduce parola, daca nu respecta cerintele printam
    //ce anume nu respecta si cerem sa introduca parola din nou.


        public static void main(String[] args){


            Scanner scan = new Scanner(System.in);
            System.out.println("Introdu username: ");
            String username = scan.next();
            System.out.println("Introdu password: ");
            String password = scan.next();


//            if ((password.equals(10)) && (password.toUpperCase().equals(1)) && (password.equalsIgnoreCase(username)){
//
//            }
            boolean areLiteraMare = false;

            for (int i=0; i<= password.length(); i++){
                if (password.length()< 10){
                System.out.println("Trebuie minim 10 char");
                    break;
                }
                 else if (65>= password.charAt(i) && password.charAt(i) <= 90) {
                    areLiteraMare = true;
                }

                 else if (password.equals(username)){
                 System.out.println("password diferita de username");
                    break;
                  }

                 else {
                 System.out.println("parola ok");
                  }
                 break;
            }
            if (!areLiteraMare) {
                System.out.println("trebuie majuscula");
            }




    }

}
