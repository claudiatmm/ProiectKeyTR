package curs5;

import java.util.Scanner;

public class Calculator {


    public static void main(String [] arg) {

        Calculator calc = new Calculator();
        calc.askTheUser();
        calc.calculateValues();
        calc.printResults();

    }

    //daca nu declaram aici variabilele nu le puteam folosi decat in metoda unde ele erau
    int num1; //double si o sa afiseze si cu virgula
    int num2;  //double
    char calculs;
    int result;  // double

    //afla numele si operatia
    public void askTheUser(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter first number!");
        num1 = scann.nextInt();
        System.out.println("Please enter the calculus");
        calculs = scann.next().charAt(0);
        System.out.println("Please enter second number!");
        num2 = scann.nextInt();
    }

        //sa calculam
       public void calculateValues(){

        if(calculs == '+'){
             result = num1 + num2;
        }
        else if (calculs == '-'){
             result = num1 - num2;
        }
        else if (calculs == '*' || calculs =='x'){
             result = num1 * num2;
        }
        else if (calculs == '/'){
            result = num1 / num2;
           }
        else {
            System.out.println("wrong caracter");
        }
       }

       public void printResults(){
           System.out.println(num1 + " " + calculs + " " + num2 + " " + "=" + " " + result);
       }


    //sa printam
    public void printResults2() {
        System.out.println(num1 + " " + calculs +  " " + num2 + " = " + result);
    }

}
