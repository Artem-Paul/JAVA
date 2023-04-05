package OOP.seminar1.cw3;

import  OOP.seminar1.cw2.Product;

import java.util.ArrayList;

public interface Machine {
    Product getProduct(String name) throws IllegalStateException;
}