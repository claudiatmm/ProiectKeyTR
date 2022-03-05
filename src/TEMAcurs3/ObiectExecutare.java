package TEMAcurs3;

import curs2.ParsauImpar;

public class ObiectExecutare {

    public static void main(String[] arg) {


        Qualification pers1 = new Qualification("Java", 4,"Afternoon");
        pers1.verify();

        Qualification pers2 = new Qualification("Java", 4,"Afternoon");
        pers2.setExperienceYears(1);
        pers2.verify();

    }
}
