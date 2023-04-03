package OOP.seminar1.cw2;

public class Chocolate extends Product{

    private Integer sugar;

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    public Chocolate(String name, Double price, Integer sugar) {
        super(name, price);
        this.sugar = sugar;
    }

    public Chocolate(String name, Double price) {
        super(name, price);
    }

}