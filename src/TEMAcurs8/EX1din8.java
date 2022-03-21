package TEMAcurs8;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class EX1din8 {
    //   Scriem un program care printeaza in consola cate calorii are o
    //   leguma pe care utilizatorul vrea sa o cumpere.
    //    Avem o metoda care scrie intr-un properties file 3 legume si un  numar de calorii asociat lor (exemplu morcov=58)

    //     Avem o metoda care citeste si din properties file valoarea caloriilor.

    //     Avem o metoda care pune intr-un data structure tip cheie valoare
    //    legumele si caloriile citite din properties file si returneaza caloriile.

    //    Daca utilizatorul introduce o leguma care nu se afla in acest data
    //    structure returneaza “Nu vindem aceasta leguma”

    //    In metoda main intrebam utilizatorul ce leguma vrea sa cumpere.
    //      Daca leguma se afla in cele pe care le avem in data structure
    //    printam : “Leguma aleasa de tine are X calorii”. Daca nu se afla
    //     printam “Nu vindem aceasta leguma” si rugam utilizatorul sa
    //    aleaga alta leguma.





    public EX1din8 (String constructor){
    }


    //    Avem o metoda care scrie intr-un properties file 3 legume si un  numar de calorii asociat lor (exemplu morcov=58)
    public void scriuProprietatiInFisier() throws IOException {
        try {
            OutputStream abc = new FileOutputStream("/KeyTrainingProject/src/TEMAcurs8/fisierLegume.txt");
            Properties file = new Properties();

            file.setProperty("morcov", "52");
            file.setProperty("struguri", "160");
            file.setProperty("mar", "45");

            file.store(abc, "am salvat fisierul");
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    // Avem o metoda care citeste si din properties file(in cazul meu: fisierLegume) valoarea caloriilor.

    public Properties citestePropInFisier() throws IOException, FileNotFoundException {

            InputStream inputStream = new FileInputStream("/KeyTrainingProject/src/TEMAcurs8/fisierLegume.txt");

            Properties file = new Properties();
            file.load(inputStream);

            return file;
    }



    // Avem o metoda care pune intr-un data structure tip cheie valoare
    // legumele si caloriile citite din properties file si returneaza caloriile.

    public void returneazaDataStructure(String abc) throws IOException {
        HashMap<String, String> proprietati = new HashMap<String, String>();

        Properties aux = citestePropInFisier();        // pot sa folosesc cu -this sau fara

        for(String leguma :aux.stringPropertyNames()){
            proprietati.put(leguma, aux.getProperty(leguma));
        }
        if (proprietati.containsKey(abc)){
            System.out.println("Leguma aleasa de tine are " +(proprietati.get(abc))+ " calorii");
        }
        else{
            System.out.println("Nu vindem aceasta leguma");
        }

    }

}



