package Temacurs5;

import java.util.Scanner;

public class TemaArrays {

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number:");

        int numar = scan.nextInt();


        String[] numeLuni = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};


        switch(numar){

            case 1:
                System.out.println(numeLuni[0]);
                break;

            case 2 :
                System.out.println(numeLuni[1]);
                break;

            case 3 :
                System.out.println(numeLuni[2]);
                break;

            case 4 :
                System.out.println(numeLuni[3]);
                break;

            case 5 :
                System.out.println(numeLuni[4]);
                break;

            case 6 :
                System.out.println(numeLuni[5]);
                break;

            case 7 :
                System.out.println(numeLuni[6]);
                break;

            case 8 :
                System.out.println(numeLuni[7]);
                break;

            case 9 :
                System.out.println(numeLuni[8]);
                break;

            case 10 :
                System.out.println(numeLuni[9]);
                break;

            case 11 :
                System.out.println(numeLuni[10]);
                break;

            case 12 :
                System.out.println(numeLuni[11]);
                break;

            default:
                System.out.println ("Te rugam sa introduci un numar intre 1 si 12.");

        }

//        try {
//
//            System.out.println(numeLuni[12]);
//
//        }catch (Exception e) {
//
//            System.out.println("Ai incercat sa printezi in afara arrayului");
//        }
    }
}
