package curs2;

public class Tester {

    //intr-o clasa avem: variabile, constructor, metode
    int ratePerHour =20;
    String name;

    //metode
    public int getRatePerHour(){
        return ratePerHour;
    }

    public void setRatePerHour (int ratePerHour){
        this.ratePerHour =ratePerHour; // face referinta catre ratePerHour
    }

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name= name;
    }

}
