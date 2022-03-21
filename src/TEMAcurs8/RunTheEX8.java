package TEMAcurs8;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class RunTheEX8 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ce leguma vreti sa cumparati :");
        String legumaUser = scan.next();


        EX1din8 runExemple = new EX1din8(legumaUser);
        runExemple.scriuProprietatiInFisier();
        runExemple.citestePropInFisier();

        runExemple.returneazaDataStructure(legumaUser);



    }
}
