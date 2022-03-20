package curs6;
import java.util.ArrayList;
import java.util.List;

public class ListTesters {
    public static void main(String[] args) {

        Tester t1 = new Tester("Oana", 25, "QA");
        Tester t2 = new Tester("Maria", 30, "DEV");
        Tester t3 = new Tester("Gabi", 32, "QA");

        List<Tester> listaTesteri = new ArrayList<>();
        listaTesteri.add(t1);
        listaTesteri.add(t2);
        listaTesteri.add(t3);


        System.out.println(t1.name);
        //System.out.println(t1);
        //listaTesteri.get(0) == t1
        System.out.println(listaTesteri.get(0).name);
        System.out.println(listaTesteri.get(0).printCeva());

        //printCeva() este o metoda a clasei Tester
        //o accesezi cu obiecte din clasa Tester => t1 sau t2 sau t3
        //t1.printCeva()

        //listaTesteri ==> un container { t1 , t2, t3}
        //listaTester.printCeva() XX nu merge
        //listaTester.index.printCeva -->listaTesteri.get(0) == t1


        for (Tester t : listaTesteri) {

            System.out.println(t.name + " | " + t.age + " | " + t.departament);
        }

    }
}