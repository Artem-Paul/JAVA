package org.example.seminar3.cw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 3. Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
 * Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 */
@Data
@AllArgsConstructor
public class Coub {
    private String color;
    private Integer size;
    private String material;

}
