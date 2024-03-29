package org.example.seminar3.cw3;

import org.example.seminar3.cw3.model.Coub;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
 * Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 */
public class Ex3 {
    public static void main(String[] args) {
        Coub coub1 = new Coub("Зеленый", 13, "Деревянный");
        Coub coub2 = new Coub("Желтый", 73, "Металлический");
        Coub coub3 = new Coub("Красный", 23, "Картонный");
        Coub coub4 = new Coub("Желтый", 3, "Металлический");

        List<Coub> listCoub = new ArrayList<>(); // создаем список из кубов
        listCoub.add(coub1);
        listCoub.add(coub2);
        listCoub.add(coub3);
        listCoub.add(coub4);
        int countCoub = 0;
        int sumVolume = 0;
        int countWood = 0;

        for (Coub coub : listCoub){
            if (coub.getColor().equals("Желтый")) {
                countCoub++;
                sumVolume += volumeCoub(coub.getSize());
            }
            if (coub.getMaterial().equals("Деревянный") && coub.getSize() == 3) {
                countWood++;
            }
        }
        System.out.println(countCoub);
        System.out.println(sumVolume);
        System.out.println(countWood);
    }

    private static int volumeCoub(Integer size) {
        return size * size * size;
    }
}
