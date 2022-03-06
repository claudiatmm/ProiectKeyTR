package TEMAcurs4;

public class Masina extends Vehicul{

    public Masina (String brand, int nivelPoluare, int vitezaMedie){
        setBrand(brand);
        setNivelPoluare(nivelPoluare);
        setVitezaMedie(vitezaMedie);
    }


    @Override

    public String nume (String numeMasina){
        return numeMasina;
    }

    public String motorizare (String motorizareMasina){
        return motorizareMasina;
    }

    public void detaliiVehicul (){
        System.out.println("Nivelul de poluare pentru " + getBrand() + " este " + getNivelPoluare() + " si viteza medie atinsa este de " +  getVitezaMedie() );
    }

}
