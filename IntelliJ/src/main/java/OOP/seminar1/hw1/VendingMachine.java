package OOP.seminar1.hw1;

public interface VendingMachine {
    Product getProduct(String name, int volume, int temp) throws IllegalStateException;
}
