package OOP.seminar2.hw2;

import OOP.seminar2.hw2.model.Filter;
import OOP.seminar2.hw2.model.Notebook;
import OOP.seminar2.hw2.model.VersionOs;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> notebooks = new HashSet<>();

        notebooks.add(new VersionOs("Xiaomi", "RedmiBook 15", "Intel Core i3", 8, 256, 1000, "win"));
        notebooks.add(new VersionOs("Xiaomi", "RedmiBook 20", "Intel Core i5", 8, 512, 1200, "win"));
        notebooks.add(new VersionOs("Asus", "Laptop 15", "Intel Celeron 4500", 4, 1000, 500, "win"));
        notebooks.add(new VersionOs("Asus", "Laptop 14", "Intel Celeron 4020", 4, 128, 400, "none"));
        notebooks.add(new VersionOs("Asus", "VivoBook 14", "Intel Core i3", 8, 512, 850, "win"));
        notebooks.add(new VersionOs("Asus", "VivoBook 15", "Intel Core i5", 8, 256, 900, "none"));
        notebooks.add(new VersionOs("Lenovo", "V15", "AMD 3020e", 4, 256, 500, "win"));
        notebooks.add(new VersionOs("Lenovo", "IdePad3", "AMD Ryzen 3", 4, 1000, 600, "win"));
        notebooks.add(new VersionOs("Lenovo", "ThinkBook 15", "AMD Ryzen 5", 8, 512, 750, "win"));
        notebooks.add(new VersionOs("Apple", "MacBook Air", "Apple M1", 8, 256, 2000, "mac"));
        notebooks.add(new VersionOs("Huawei", "MateBook 14", "AMD Ryzen 5", 16, 512, 1300, "win"));
        notebooks.add(new VersionOs("Huawei", "MateBook 15", "AMD Ryzen 7", 16, 2000, 1500, "win"));

//        Filter filter = new Filter();
//        filter.search(notebooks);

        Filter notebookOOP = new Filter(notebooks);
        notebookOOP.search(notebooks);


    }
}

