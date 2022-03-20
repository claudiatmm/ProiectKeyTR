package curs6;
import java.util.Scanner;

public class DiceGame {

    /**
     * Facem un joc de zaruri care are urmatoarele reguli:
     * daca userul da in total : 2, 6, 12 Pierde
     * daca userul da in total : 7, 11 Castiga
     * daca userul da in total : 3, 10 Repeta
     * daca da oricare dintre cele care nu sunt mai sus, il intrebam daca mai da o data :)
     */

    public static void main(String[] args) {

        boolean condition = true;

        while(condition) {

            int dice1 = (int) (Math.random()*6+1);
            int dice2 = (int) (Math.random()*6+1);
            int sum =  dice1+dice2;

            System.out.println("Ai dat :" + sum);

            // daca userul da in total : 2, 6, 12 Pierde
            if(sum == 2 || sum == 6 || sum == 12) {
                System.out.println("Imi pare rau ai dat :" + sum + "! Ai pierdut partida!");
                break;
            }
            // daca userul da in total : 7, 11 Castiga
            else if(sum == 7 || sum == 11) {
                System.out.println("Ai dat :" + sum + " Ai castigat!");
                break;
            }
            // daca userul da in total : 3, 10 Repeta
            else if(sum == 3 || sum == 10) {
                System.out.println("Ai dat :" + sum + " Automat mai dai o data!!");
                continue;
            }

            System.out.println("Mai dai o data ?");
            Scanner scan = new Scanner(System.in);
            condition =  scan.nextBoolean();



        }


    }
}
