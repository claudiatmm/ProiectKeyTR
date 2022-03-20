package TEMAcurs6;

public class EXercitiu2 {

    //Scriem un program care numara cate vocale contine textul ” Eu invat Java”.
    // Va printa urmatorul mesaj : Vocale: nr de vocale din text

    public static void main(String[] args) {


        String cuvantA = "eu invat java";

        int countVocaleA = 0;


        for (int i=0; i< cuvantA.length(); i++) {
            char s = cuvantA.charAt(i);
            if (cuvantA.charAt(i) == 'a' ||
                    cuvantA.charAt(i) == 'e' ||
                    cuvantA.charAt(i) == 'i' ||
                    cuvantA.charAt(i) == 'o' ||
                    cuvantA.charAt(i) == 'u')   {  // "a" - aici este ca si String si 'a' - aici este ca si caracter.
                countVocaleA ++;
            }}
            System.out.println("nr de vocale din text " +countVocaleA);



        // varianta 2

//        String[] cuvant = {"eu invat java"};
//        int countVocale = 0;
//
//        for (int i = 0; i < cuvant.length; i++) {
//            if (cuvant[i].charAt(0) == 'a') {
//                countVocale++;
//            }
//            System.out.println("nr de vocale din text " +countVocale);
//        }




        //varianta 3
        String cuvantB = "eu invat java";
        int count = 0;
        for (char s : cuvantB.toCharArray()) {
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ) {
                count++;
            }
        }
        System.out.println("nr de vocale din text " +count);





    }
}