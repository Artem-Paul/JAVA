package OOP.seminar2.hw2;

import java.util.List;

public interface QueueBehaviour {
    void acceptToMarket(Actor actor);  //зашел в магазин

    void releaseFromMarket(List<Actor> actors);  //вышел из магазина

    void update();   // сделал заказ, получил заказ

    void marketBehaviourAdd(Actor actor); //встал в очередь

    void makeOrders(); //сделал заказ

    void takeOrders(); //получил заказ

    void marketBehaviourDel(); //вышел из очереди
}