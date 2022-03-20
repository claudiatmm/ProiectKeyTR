package curs8;

public class TestTester {


    public static void main(String[] args) {

        Tester t1 = new Tester("23");// "23" --> este data type String
        t1.printAge();

        Tester t2 =  new Tester(24.6);//24.6 este data type Double
        t2.printAge();

        Tester t3 = new Tester(23);// 23 este data type  Integer
        t3.printAge();



    }
}
