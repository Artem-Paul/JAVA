package OOP.seminar2.hw2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Покупатель1");
        Human human2 = new Human("Покупатель2");
        Human human3 = new Human("Покупатель3");
        Human human4 = new Human("Покупатель4");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();
    }
}

