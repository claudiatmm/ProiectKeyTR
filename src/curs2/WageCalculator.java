package curs2;

public class WageCalculator {

    int hoursWorked =40;

    public static void main (String[] args){

        Tester tester1 = new Tester();
        tester1.setName("OOOana");
        tester1.setRatePerHour(30);

        System.out.println(tester1.getName());

        // (aici e acelasi lucru cum am facut pentru Tester tester; trebuie sa creez obiect ca sa pot apela metoda de mai jos)
        WageCalculator obiect =new WageCalculator(); // trebuie sa creez obiectul inainte de apelare
        // mai jos am apelat obiectul

        System.out.println("Salariu" +tester1.getName()+ " " + obiect.calculateSlary(tester1.getRatePerHour()));


        Tester tester2 = new Tester();
        tester2.setName("Elena");
        tester2.setRatePerHour(45);
        System.out.println(tester2.getName());

    }

    public int calculateSlary(int plataPeOra){
        int salary  = plataPeOra * hoursWorked;
        return salary;
    }



}
