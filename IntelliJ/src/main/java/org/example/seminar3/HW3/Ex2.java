package org.example.seminar3.HW3;

import org.example.seminar3.HW3.model.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {
        Data data1 = new Data("Поршни", "США", 2000.0, 1000.0, 1);
        Data data2 = new Data("Шатуны", "США", 2500.0, 1200.0, 1);
        Data data3 = new Data("Колен-валы", "Китай", 6000.0, 800.0, 2);
        Data data4 = new Data("Распред-валы", "Россия", 1200.0, 600.0, 2);
        Data data5 = new Data("Пружины", "Германия", 150.0, 700.0, 1);
        Data data6 = new Data("Клапана", "Германия", 200.0, 700.0, 1);

        List<Data> dataList = new ArrayList<>();
        dataList.add(data1);
        dataList.add(data2);
        dataList.add(data3);
        dataList.add(data4);
        dataList.add(data5);
        dataList.add(data6);

        Scanner scan = new Scanner(System.in);
        double minPrice = 1000000000;
        System.out.println("Введите сорт: ");
        Integer searchSort = scan.nextInt();
        if (searchSort <= 2) {
            for (Data el : dataList) {
                if ((el.getPrice() < minPrice) && (el.getSort() == searchSort)) {
                    minPrice = el.getPrice();
                }
            }
            for (Data es : dataList) {
                if (es.getPrice() == minPrice) {
                    System.out.println("Наименьшая цена у товара запрашиваемого сорта: " + es.getName());
                }
            }
        } else {
            System.out.println("Такого сорта нет");
        }
    }
}
