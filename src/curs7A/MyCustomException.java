package curs7A;

public class MyCustomException extends Exception {

    public MyCustomException(String mesaj) {
        super(mesaj);

        //this --> face referinta catre obiectul clasei in care se afla
        //super --> face referinta catre obiectul clasei parinte


        //in aceasi clasa:
        //String nume --> this.nume

        //ClasaParinte contine String prenume  si faci referire la el in clasa copil
        // clasaCopil --> super.prenume

    }
}
