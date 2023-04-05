package OOP.seminar1.cw3;

import OOP.seminar1.cw2.Product;

public class Water extends Product {
    private Integer volume;

    public Water(String name, Double price, Integer volume) {
        super(name, price);
        this.volume = volume; // класс наследник, добавили воду
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Water(String name, Double price) {
        super(name, price);
    }
}

