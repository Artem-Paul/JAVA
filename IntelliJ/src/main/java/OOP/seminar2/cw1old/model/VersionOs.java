package OOP.seminar2.cw1old.model;

public class VersionOs extends Notebook {
    private String os;

    public VersionOs(String brand, String model, String cpu, Integer ram, Integer ssd, Integer price, String os) {
        super (brand, model, cpu, ram, ssd, price);
        this.os = os;

    }



    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
