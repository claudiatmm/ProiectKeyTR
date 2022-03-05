package TEMAcurs3;

public class Qualification extends Teacher{


    public Qualification (String cr, int experience, String sch){
        setCourse(cr);
        setExperienceYears(experience);
        setSchedule(sch);
        
    }


    public void verify(){
        if ((getCourse() == "Java") && (getExperienceYears() > 3) && (getSchedule() == "Afternoon")){
            System.out.println ("You qualify to teach at this school!");
        }
        else {
            System.out.println("You do not qualify!");
        }
    }

}
