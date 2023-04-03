package OOP.seminar1.cw2;

import java.util.ArrayList;

public interface Machine {
    Product getProduct(String name) throws IllegalStateException;
}