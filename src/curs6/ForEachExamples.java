package curs6;

public class ForEachExamples {
    public static void main(String[] arg) {
        int [] arrayNumber = {10, 20, 30, 40, 50};

        for (int i=0; i<arrayNumber.length; i++){
            System.out.println("clasic for: "+ arrayNumber[i]);
        }

        //FOR EACH - codul de mai jos este echivalent cu codul de mai sus

        for(int num : arrayNumber){
            System.out.println("for each: " + num);
        }



    }

}
