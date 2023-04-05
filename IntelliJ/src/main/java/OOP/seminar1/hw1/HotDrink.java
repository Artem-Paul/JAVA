package OOP.seminar1.hw1;

public class HotDrink extends Product {

    private int temp;

    public HotDrink(String name, int volume, int temp) {
        super(name, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
//    @Override
//    public String toString() {
//        return "температура: " + temp + "°C";
//    }
}
