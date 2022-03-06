package Curs4;

public class TesterOverride {

    public static void main(String[] args) {

       // Angajat angajat = new Angajat();
       // angajat.work();

       // Tester tester = new Tester();
       // tester.work(); /// daca sterg din tester metoda "work" va rula de la parinte
       // Tester tester1 = new Tester();
      //  tester1.work();
       // tester1.scrieTeste();

       // Developer developer = new Developer();
       // developer.work();


        //data tipe       //o instanta
        Angajat tester2 = new Tester();
        tester2.work();
        ((Tester) tester2).scrieTeste();
        // SUPRASCRIEREA implica intotdeauna Mostenire
        // mostenirea este cea care ne permite sa schimbam data type

        Angajat tester3 = new Tester();
        tester3.work();

        tester3 = new Developer();
        tester3.work();

        // sau mai pot sa scriu:
        Angajat tester4;
        tester4 = new Tester();
        tester4.work();
        tester4 = new Developer();
        tester4.work();

    }

}
