package TEMAcurs3;

public class ForExamplesHomework {

    public static void main(String[] arg) {
        //Scriem un program care printeaza doar numerele pare intre 0-20

        for(int i=0; i<=20; i++){
            if (i % 2 == 0){
                System.out.println( "acestea sunt nr. pare: " +i);
            }
        }

    }
}
