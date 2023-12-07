package OOP.seminar2.hw2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);  //зашел в магазин

    void releaseFromMarket(List<Actor> actors);  //вышел из магазина

    void update();   // сделал заказ, получил заказ
}
