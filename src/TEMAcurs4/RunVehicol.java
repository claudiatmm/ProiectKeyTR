package TEMAcurs4;

public class RunVehicol {

    public static void main(String[] arg) {

        Vehicul vechicul1 = new Bicicleta("Bicicleta", 0, 20);
        vechicul1.detaliiVehicul();



        Vehicul vechicul2 = new Masina("Audi",100, 250 );
        vechicul2.detaliiVehicul();

        RunVehicol abc = new RunVehicol();
        abc.verificaMotorizarea(vechicul2);
        abc.verificaMotorizarea(vechicul1);

    }


    public void verificaMotorizarea(Vehicul vechicolGeneral){
        System.out.println(vechicolGeneral.nume(vechicolGeneral.getBrand()));

    }

}
