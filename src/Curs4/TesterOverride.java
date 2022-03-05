package Curs4;

public class TesterOverride {

    public static void main(String[] args) {
        Angajat angajat = new Angajat();
        angajat.work();

       // Tester tester = new Tester();
       // tester.work(); /// daca sterg din tester metoda va rula de la parinte

        //data tipe               //o instanta
        Angajat tester2 = new Tester();
        tester2.work();
        // SUPRASCRIEREA implica intotdeauna Mostenire
        // mostenirea este cea care ne permite sa schimbam data type

        Angajat tester3 = new Tester();
        tester3.work();

        tester3 = new Developer();
        tester3.work();

    }



}
