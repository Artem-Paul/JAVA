package OOP.seminar2.cw2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Вадим");
        Human human2 = new Human("Артем");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
