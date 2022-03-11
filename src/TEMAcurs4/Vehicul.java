package TEMAcurs4;

public class Vehicul {

    private String brand;
    private int nivelPoluare;
    private int vitezaMedie;


    public String nume (String numeVechicul){
        return numeVechicul;
    }

    public String motorizare (String motorizareVehicul){
        return motorizareVehicul;
    }


    public void detaliiVehicul (){
        System.out.println("Nivelul de poluare pentru " + getBrand() + " este " + getNivelPoluare() + " si viteza medie atinsa este de " +  getVitezaMedie() );
    }



    //SET
    public void setBrand(String brand) {this.brand = brand;}

    public void setNivelPoluare(int nivelPoluare) {
        this.nivelPoluare = nivelPoluare;
    }

    public void setVitezaMedie(int vitezaMedie) {
        this.vitezaMedie = vitezaMedie;
    }

    //GET
    public String getBrand() {
        return brand;
    }

    public int getNivelPoluare() {
        return nivelPoluare;
    }

    public int getVitezaMedie() {
        return vitezaMedie;
    }


}