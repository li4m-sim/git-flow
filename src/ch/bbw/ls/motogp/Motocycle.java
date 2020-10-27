package ch.bbw.ls.motogp;

public class Motocycle {

    private Boolean hasRainSetting;
    private String label;
    private int number;
    private String type;

    public Motocycle(String label, String type, Boolean hasRainSetting, int number){
        this.label = label;
        this.type = type;
        this.hasRainSetting = hasRainSetting;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Motocycle{" +
                "hasRainSetting=" + hasRainSetting +
                ", label='" + label + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                '}';
    }
}
