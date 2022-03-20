package TEMAcurs6;
import java.util.Scanner;

public class SumaNumereListaEX1 {


    //Scriem un program care ii cere userului 10 numere. Va pune acele numere
    //intr-un array si va calcula suma lor.
    //La final va printa suma numerelor.


    public static void main(String[] args) {

        Scanner scan  =  new Scanner(System.in);
//        System.out.println("Introdu 10 numere: " );
//
//        int numar1 = scan.nextInt();
//        int numar2 = scan.nextInt();
//        int numar3 = scan.nextInt();
//        int numar4 = scan.nextInt();
//        int numar5 = scan.nextInt();
//        int numar6 = scan.nextInt();
//        int numar7 = scan.nextInt();
//        int numar8 = scan.nextInt();
//        int numar9 = scan.nextInt();

        int[] nr = new int [10]; // mi-am definit array

        for(int i=0; i<10; i++){
            System.out.println("Introdu numarul " + (i+1) + " : " ); // fara paranteze concateneza nr ca string
            int numar =scan.nextInt();
            nr[i]= numar; // se va salva nr citit pe fiecare pozitie in parte incepe de la 0-9
        }


        int suma = 0;

        for( int i = 0; i< nr.length; i++) {
            suma = suma + nr[i];
        }
            System.out.println("Suma nr din array este: " +suma);

        }


    }




