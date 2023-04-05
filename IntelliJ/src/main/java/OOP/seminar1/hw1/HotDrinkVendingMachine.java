package OOP.seminar1.hw1;

import OOP.seminar1.hw1.Product;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {
        this.products = products;
    }

    public HotDrink getProduct(String name, int volume, int temp) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume() == volume
                        && ((HotDrink) product).getTemp() < 70) {
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт по условию поиска не найден.", name));
    }
}
