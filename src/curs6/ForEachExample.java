package curs6;

public class ForEachExample {

    public static void main(String[] args) {

        int[] arrayNumbers = {10, 20, 30, 40, 50};


        for(int i= 0; i<arrayNumbers.length; i++) {

            System.out.println("Clasic for : " + arrayNumbers[i]);
        }

        //for each --> codul de mai jos este echivalent cu codul de mai sus :)

        for(int num : arrayNumbers) {

            System.out.println("For each : " + num);

        }




    }
}
