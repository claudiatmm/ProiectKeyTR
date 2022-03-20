package curs3;

public class DoWhileExample {

    public static void main(String [] arg) {

        String[] array ={"one", "two", "three","four"};
        int j =0;

        while(j< array.length){
            System.out.println(array[j]);
            j++;
        }

        int x =0;
        do{
            System.out.println(array[x]);
            x++;
        } while (x< array.length);
    }


}
