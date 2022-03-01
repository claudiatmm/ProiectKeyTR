package clasa3Mostenire;

public class TesterInheritanceExecutie {

    public static void main(String[] args){

        TesterAutomat tester =new TesterAutomat();
        tester.setProgammingLanguage("Java");//clasa TesterAutomat
        tester.setDepartament("QA"); //clasa tester
        tester.setSeniority("Junior");// clasa tester
        tester.setEmail("anan@yahoo.com");// clasa angajat
        tester.setName("anan");

        System.out.println("nume este: "+tester.getName());
    }

}
