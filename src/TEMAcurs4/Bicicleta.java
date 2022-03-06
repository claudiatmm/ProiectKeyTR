package TEMAcurs4;

public class Bicicleta extends Vehicul{

    public Bicicleta (String brand, int nivelPoluare, int vitezaMedie){
        setBrand(brand);
        setNivelPoluare(nivelPoluare);
        setVitezaMedie(vitezaMedie);

    }

    @Override

    public String nume (String numeBicicleta){
        return numeBicicleta;
    }

    public String motorizare (String motorizare){
        return motorizare;
    }

    public void detaliiVehicul (){
        System.out.println("Nivelul de poluare pentru " + getBrand()+ " este " + getNivelPoluare() + " si viteza medie atinsa este de " +  getVitezaMedie() );
    }


}
