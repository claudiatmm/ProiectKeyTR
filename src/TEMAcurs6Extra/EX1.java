package TEMAcurs6Extra;

import java.util.*;


public class EX1 {

       // Scriem un program care inverseaza un Array.
      //Avem o metoda care intreaba userul care este lungimea Array-ului.: "Cate elemente trebuie sa aiba array-ul

//Avem o metoda care utilizeaza un For pentru a inversa Arrayul si alta metoda
//care utilizeaza un while pentru a face acelasi lucru

// Hint:
// Schimbam primul element cu ultimul si tot asa pentru fiecare iteratie. Deci la
//prima iteratie in for putem avea i cu index al primului element si putem avea j
//cu indexul ultimului element si tot asa.


    public static void main(String[] args) {


     //   List <Integer> nrUser = new ArrayList<Integer>();


        Scanner scan  =  new Scanner(System.in);
        System.out.println("Cate elemente trebuie sa aiba array-ul : " );

        int x = scan.nextInt();
        int []numereUser = new int[x];

        // System.out.println(numereUser[1]);


//        Scanner scanUnu  =  new Scanner(System.in);
//        System.out.println("Introdu primul element:" );
//        int a = scan.nextInt();
//        numereUser[0]= a;



         for(int i=0; i< numereUser.length; i++){
             System.out.println("Introdu elementul " +(i+1) + ":");
            // Scanner scanGeneral  =  new Scanner(System.in);
             int element = scan.nextInt();
             numereUser[i]= element;
         }

         // varianta 1
         int [] reverseArray = new int[numereUser.length];
         int ultimaPozitie = numereUser.length - 1;
           for(int i=ultimaPozitie; i >= 0; i--){
              reverseArray[ultimaPozitie - i ] = numereUser[i];

              // reverseArray[0] = numereUser[7]; // reverserArray[7-7] = numereUser[7] => reverserArray[7-i] = numereUser[i]
              // reverseArray[1] = numereUser[6]; // reverserArray[7-6] = numereUser[6] => reverserArray[7-i] = numereUser[i]
              // reverseArray[2] = numereUser[5]; // reverserArray[7-5] = numereUser[5] => reverserArray[7-i] = numereUser[i]
              //  ...
              // reverseArray[7] = numereUser[0];
          }

         for(int s: reverseArray){
        System.out.print(s + " ");}


         //varianta 2

         int totalNumere = numereUser.length;
         int ultimaPoz = totalNumere - 1;
         for(int i =0; i<totalNumere/2;i ++ ) {    // "/" - iti retureneza impartirea fara rest - returneaza doar partea intreaga
             int aux = numereUser[i];
             numereUser[i]=numereUser[ultimaPoz-i]; // cu cat creste i-ul in stanga cu atat scade valoare cu -i in dreapta
             numereUser[ultimaPoz - i] = aux;
         }

        for(int s: numereUser){
            System.out.print(s + " ");}



    }

}
