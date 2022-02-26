package TEMAcurs2;

import java.util.Scanner;

public class TemaSwitch {

    public static void main(String [] args){

        // Scriem un program care intreaba utilizatorul un numar.
        // Avem un switch care pentru fiecare numar de la 1 la 7 atribuie o
        //valoare reprezentand una din zilele saptamanii unei variabile care
        //se numeste ziuaSaptamanii.
        // Daca utilizatorul introduce orice numar peste 7 va primi mesajul “Te
        //rugam sa introduci un numar intre 1 si 7”
        //Daca a fost introdus un numar valid se va printa : ”ziua saptamanii
        //este <ziua aferenta nr introdus>”


        System.out.println("Intoduceti un numar: ");

        Scanner scan = new Scanner(System.in);
        int numar = scan.nextInt();

        String[] ziuaSaptamanii = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};

        switch(numar){

            case 1:
                System.out.println("ziua saptamanii este: Luni" + " " + ziuaSaptamanii[0] );
                break;

            case 2 :
                System.out.println("ziua saptamanii este: Marti" + " " + ziuaSaptamanii[1] );
                break;

            case 3 :
                System.out.println("ziua saptamanii este: Miercuri" + " " + ziuaSaptamanii[2] );
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

}
