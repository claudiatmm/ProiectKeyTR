package curs8;

public class VarargsExample {

    public static void main(String[] args) {

        //printStringArguments("unu", "doi", "trei", "patru");
        //printInArguments(1, 2, 3, 3, 5, 6, 7, 8);
        //printMultipleArguments("Ceva", 33, 44, 55);

        printGenrics("unu", "doi","trei", "patru", 33, 55, 23.45, 'c', 'b');

    }

    public static<T> void printGenrics(T...values){
        for(T value: values) {
            System.out.println(value);
        }
    }



    public static void printStringArguments(String...values) {

        for(String value: values) {
            System.out.println(value);
        }
    }


    public static void printInArguments(int...values) {

        for(int value: values) {
            System.out.println(value);
        }
    }

    public static void printMultipleArguments(String text,int...values) {
        System.out.println(text);
        for(int value: values) {
            System.out.println(value);
        }
    }

}
