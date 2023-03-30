package org.example.seminar5.hw5;
/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно
 */

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {

        String str = "Россия Россия идет вперед всей планеты. Планета — это не Россия.";
        String[] strArr = str.toLowerCase().replaceAll("[-+.^:,—]", "").split(" ");

        String searchW = "Россия".toLowerCase();

        Map<String, Integer> mapWord = new HashMap<>();

        for (String el : strArr) {
            if (el.equals(searchW)) {
                Integer value = mapWord.get(searchW);
                mapWord.put(el, value == null ? 1 : value + 1);
            }
        }
        System.out.println("Количество слова " + searchW + " " + mapWord.get(searchW));
    }
}
