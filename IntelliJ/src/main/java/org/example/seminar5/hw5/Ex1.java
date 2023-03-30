package org.example.seminar5.hw5;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */
public class Ex1 {
    public static void main(String[] args) {

        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String[] strArr = str.toLowerCase().replaceAll("[-+.^:,—]", "").split(" ");

        Map<String, Integer> mapWord = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!mapWord.containsKey(strArr[i])) {
                mapWord.put(strArr[i], 1);
            } else {
                mapWord.put(strArr[i], mapWord.get(strArr[i]) + 1);
            }
        }
        for (var entry : mapWord.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " раз");
        }
    }
}


