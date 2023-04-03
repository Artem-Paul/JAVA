package org.example.seminar3.hw3;

import org.example.seminar3.hw3.model.Items;

import java.util.ArrayList;
import java.util.List;
/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Ex1 {
    public static void main(String[] args) {
        Items items = new Items("Высший сорт", 500.0, 1);
        Items items1 = new Items("Хороший товар", 200.0, 2);
        Items items2 = new Items("Высший товар", 150.0, 3);
        Items items3 = new Items("Второй сорт", 700.0, 2);
        Items items4 = new Items("Высший образец", 350.0, 2);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);

        double maxPrice = 0;
        for (Items el : itemsList) {
            if (el.getName().contains("Высший") && (el.getSort() == 1 || el.getSort() == 2)) {
                if (el.getPrice() > maxPrice) {
                    maxPrice = el.getPrice();
                }
            }
        }
        System.out.println(maxPrice);
    }
}
