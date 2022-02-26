package TEMAcurs2;

import java.util.Scanner;

public class TemaIFElseIF {

    // Scriem un program care intreaba utilizatorul ce varsta are.
    // Daca utilizatorul introduce o valoare sub 18 , printeaza ”Esti minor”
    // Daca utilizatorul introduce o valoare intre 18 si 65, printeaza ”Esti
    // adult” (conditii multiple deci folosim if ((conditie 1)&&(conditie 2)))
    // Daca utilizatorul introduce o valoare peste 65 , printeaza ”Esti
    //batran
     public static void main(String [] args){

    System.out.println("Intoduceti varsta pe care o aveti: ");

    Scanner scan = new Scanner(System.in);
    int varsta = scan.nextInt();


        if (varsta < 18) {
           System.out.println("Esti Minor !");

        } else if ((varsta >= 18) && (varsta <= 65)){
             System.out.println("Esti adult !  MAJOR ");
        }

         else {
        System.out.println("Esti mega batran :)))");
         }

       }

}
