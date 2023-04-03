package org.example.seminar6.hw6;

import org.example.seminar6.hw6.model.Notebook;
import org.example.seminar6.hw6.model.Filter;

import java.util.HashSet;
import java.util.Set;



public class Main {
    public static void main(String[] args) {

        Notebook nb1 = new Notebook("Xiaomi", "RedmiBook 15", "Intel Core i3", 8, 256, 1000);
        Notebook nb2 = new Notebook("Xiaomi", "RedmiBook 20", "Intel Core i5", 8, 512, 1200);
        Notebook nb3 = new Notebook("Asus", "Laptop 15", "Intel Celeron 4500", 4, 1000, 500);
        Notebook nb4 = new Notebook("Asus", "Laptop 14", "Intel Celeron 4020", 4, 128, 400);
        Notebook nb5 = new Notebook("Asus", "VivoBook 14", "Intel Core i3", 8, 512, 850);
        Notebook nb6 = new Notebook("Asus", "VivoBook 15", "Intel Core i5", 8, 256, 900);
        Notebook nb7 = new Notebook("Lenovo", "V15", "AMD 3020e", 4, 256, 500);
        Notebook nb8 = new Notebook("Lenovo", "IdePad3", "AMD Ryzen 3", 4, 1000, 600);
        Notebook nb9 = new Notebook("Lenovo", "ThinkBook 15", "AMD Ryzen 5", 8, 512, 750);
        Notebook nb10 = new Notebook("Apple", "MacBook Air", "Apple M1", 8, 256, 2000);
        Notebook nb11 = new Notebook("Huawei", "MateBook 14", "AMD Ryzen 5", 16, 512, 1300);
        Notebook nb12 = new Notebook("Huawei", "MateBook 15", "AMD Ryzen 7", 16, 2000, 1500);

        Set<Notebook> notebooks = new HashSet<>();

        notebooks.add(nb1);
        notebooks.add(nb2);
        notebooks.add(nb3);
        notebooks.add(nb4);
        notebooks.add(nb5);
        notebooks.add(nb6);
        notebooks.add(nb7);
        notebooks.add(nb8);
        notebooks.add(nb9);
        notebooks.add(nb10);
        notebooks.add(nb11);
        notebooks.add(nb12);


        Filter filter = new Filter();
        filter.search();
    }

}
