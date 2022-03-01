package curs3;

public class WhileExample2 {

    public static void main(String [] arg) {

        String[] array ={"one", "two", "three","four"};
        int j =0;

        while(j< array.length){
            // daca pun aici j++ sare peste un nr ; conteaza executia
            System.out.println(array[j]);
            j++;
        }

    }

}
