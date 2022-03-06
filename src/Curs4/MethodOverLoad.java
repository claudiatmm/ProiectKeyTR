package Curs4;

public class MethodOverLoad {

    public static void main(String[] args) {

        MethodOverLoad obj = new MethodOverLoad();

        System.out.println(obj.multiply(2,4));
        System.out.println(obj.multiply(0.2,0.5));

    }


    //overload Metode -- supraincarcarea metodei
    public int multiply(int num1, int num2){
        return num1 *num2;
    }

    public double multiply (double num1, double num2){
        return num1 *num2;
    }
}
