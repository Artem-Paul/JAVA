package OOP.seminar1.hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList();

        list.add(new HotDrink("Чай", 150, 65));
        list.add(new HotDrink("Капуччино", 200, 65));
        list.add(new HotDrink("Капуччино", 300, 80));
        list.add(new HotDrink("Латте", 300, 60));

        System.out.println(list);     // горячие напитки

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(list);
        System.out.println(vendingMachine.getProduct("Капуччино", 300, 65));  // ГорячиеНапиткиАвтомат
    }
}
