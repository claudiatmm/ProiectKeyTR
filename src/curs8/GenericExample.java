package curs8;

public class GenericExample {

    public static void main(String[] args) {

        GenericExample obj = new GenericExample();
        obj.printDetails("String");
        obj.printDetails(12345);
        obj.printDetails(24.35);
        obj.printDetails('c');

    }


    public <T> void printDetails(T obj) {

        System.out.println("Obiectul meu este :" + obj);
        System.out.println("Type-ul este : " + obj.getClass().getName());

    }



}
