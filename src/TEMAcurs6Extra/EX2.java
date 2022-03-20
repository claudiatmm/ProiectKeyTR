package TEMAcurs6Extra;

import java.util.Scanner;

public class EX2 {
    //Scriem un program care intreaba utilizatorul 2 numere. Va printa
    //doar numerele pare aflate intre acele 2 numere.
    //Facem asta in 3 moduri diferite : for, while si do while


    public static void main(String[] args){

        // 5 si 10 -> 6; 8;
        Scanner scan  =  new Scanner(System.in);
        System.out.println("Introdu 2 numere:" );
        int x = scan.nextInt();
        int y = scan.nextInt();


            int max = Math.max(x, y);
            for(int i = (max == x ? y : x) + 1 ; i < max ; i++) {
                //System.out.println(i);
                if(i%2==0){
                    System.out.println("nr pare sunt: " +i);
                }

            }

        }






    }


