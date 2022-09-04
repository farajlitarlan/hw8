package happyfamily.humans;

import happyfamily.Family;
import happyfamily.Human;

import java.util.Map;
 import happyfamily.DayOfWeeks ;

public final class Man extends Human {

    public void sport(){
        System.out.println("Jack does sport!");
    }

    @Override
    public void greetPet() {
        System.out.println("Hello from Mr." + super.getName());
    }

    public Man () {
    }
    public Man(String name, String surname, int year, int iq, Map< DayOfWeeks, String> schedule, Family family){
        super(name,surname,year,iq,schedule,family);
    }
    public Man(String name, String surname, int year){
        super(name,surname,year);
    }
}
