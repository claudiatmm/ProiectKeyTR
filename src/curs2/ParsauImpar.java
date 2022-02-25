package curs2;

public class ParsauImpar {

    public static void main (String[] args){

        int number =6;

        if (number % 2 == 0){
            System.out.println(number +"este par");
        }else{
            System.out.println(number + "este impar");
        }

        //am creat un obiect care imi apeleza metoda de mai jos
        ParsauImpar obiect = new ParsauImpar();
        obiect.verificaParsauImpar(8);

    }


    public void verificaParsauImpar(int number){

        if (number % 2 == 0){
            System.out.println(number +"este par");
        }else{
            System.out.println(number + "este impar");
        }

    }


}
