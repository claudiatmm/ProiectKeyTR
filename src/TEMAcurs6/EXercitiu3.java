package TEMAcurs6;

public class EXercitiu3 {

    //Scriem un program care verifica daca avem nume duplicate in
    //urmatorul array :
    //String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana",
    //"Bogdan", "Oana", "Ion"};

    public static void main(String[] args) {


        String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana","Bogdan", "Oana", "Ion"};



         //de la 0 pana length -1 = ia toate elementele mai putin ultimul
        // length -1 = pentru ca ultimul element nu mai trebuie comparat cu nimeni, intrucat a fost comparat cu toate celalalte nr.

         for (int i = 0; i < myStringArray.length; i++){
             String nume =  myStringArray[i];
             for(int j = i+1; j<myStringArray.length; j++ ){ // verificam numele cu toate celalalte nume de dupa el in lista (eliminam cazul in care verificam un nume cu el insusi)
                 String numeDoi = myStringArray[j];
                 if(nume.equals(numeDoi)){
                     System.out.println("nume duplicat: " +numeDoi);
                 }
                 // System.out.println("i = "+ i + " j = "+ j);

             }
         }




//         for (int i =1; i < myStringArray.length; i++){
//             if (dup == myStringArray[i]){
//                 System.out.println("Nume duplicat :" + dup);
//                 dup = myStringArray[i];
//             }
//
//         }






    }
}
