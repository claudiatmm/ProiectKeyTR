package TEMAcurs6Extra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX3 {

    //Scriem un program care are un Array de tip string care contine zilele
    //saptamanii.
    // Intrebam user-ul o zi a saptamanii si printam ziua respectiva.
    //Ex: userul introduce 7 si printam Duminica.
    //Nota: nu folosim nici o structura repetitiva

    public static void main(String[] args) {


        String[] zileSaptamana = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introdu o zi a saptamanii : ");
            int zi = scan.nextInt();

            switch(zi){

                case 1:
                    System.out.println("ziua saptamanii este: Luni");
                    break;

                case 2 :
                    System.out.println("ziua saptamanii este: Marti");
                    break;

                case 3 :
                    System.out.println("ziua saptamanii este: Miercuri");
                    break;

                case 4 :
                    System.out.println("ziua saptamanii este: Joi");
                    break;

                case 5 :
                    System.out.println("ziua saptamanii este: Vineri");
                    break;

                case 6 :
                    System.out.println("ziua saptamanii este: Sambata");
                    break;

                case 7 :
                    System.out.println("ziua saptamanii este: Duminica");
                    break;

                default:
                    System.out.println ("Te rugam sa introduci un numar intre 1 si 7.");

            }

        }
        catch (InputMismatchException e) {
            System.out.println("Te rog introdu un nr. !");
        }


//        switch(zi) {
//
//            case 1:
//                System.out.println("ziua saptamanii este: Luni");
//                break;
//        }


    }

}
