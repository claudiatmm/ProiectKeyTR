package TEMAcurs2;

import java.util.Scanner;

public class TemaIFandElse {

    //Scrie un program care intreaba utilizatorul punctajul unui test.
    // Daca utilizatorul introduce o valoare intre 0 si 65 atunci printeaza ”Ai
    //picat. Mai incearca”
    // Daca utilizatorul introduce o valoare mai mare sau egala cu 66
    //atunci printeaza ”Felicitari, Ai trecut


    public static void main(String [] arg){

        System.out.println("Introdu punctajul testului:");

        Scanner scan = new Scanner(System.in);
        int punctajUser = scan.nextInt();


        if ( punctajUser <= 65 ){
            System.out.println("Ai picat mai incearca !! HA HA !!");
        }  else {
            System.out.println("Felicitari ai trecut !! ");
        }

    }
}
