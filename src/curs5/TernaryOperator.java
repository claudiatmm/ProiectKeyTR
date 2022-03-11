package curs5;

public class TernaryOperator {

    public static void main(String [] arg) {

        int num1 =40;
        int num2 =120;

        int var = (num1>num2) ? num1 : num2;
        //este echivalentul liniei de mai sus
        if(num1>num2) {
            var =  num1;
        }else {
            var = num2;
        }



        System.out.println(var);


    }
}
