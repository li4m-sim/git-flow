package ch.bbw.ls.motogp;

import java.util.Arrays;

public class Team {

    private String name;
    private String country;
    private String type;
    private Motocycle[] motos;
    private Driver driver1;
    private Driver driver2;

    public Team(String name, String country, String type){
        this.name = name;
        this.country = country;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", motos=" + Arrays.toString(motos) +
                ", driver1=" + driver1 +
                ", driver2=" + driver2 +
                '}';
    }

    public void setDrivers(Driver driver1, Driver driver2) {
        this.driver1 = driver1;
        this.driver2 = driver2;
    }

    public void resetDrivers(){
        this.driver1 = null;
        this.driver2 = null;
    }
}
