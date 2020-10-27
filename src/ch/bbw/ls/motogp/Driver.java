package ch.bbw.ls.motogp;

import java.util.Date;

public class Driver {

    private String name;
    private String firstname;
    private Date birthdate;
    private Motocycle bike;

    public Driver(String name, String firstname, Date birthdate){
        this.name = name;
        this.firstname = firstname;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthdate=" + birthdate +
                ", bike=" + bike +
                '}';
    }

    public void setMotocycle(Motocycle bike){
        this.bike = bike;
    }

    public void resetMotocycle(){
        this.bike = null;
    }
}
