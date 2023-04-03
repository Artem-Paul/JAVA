package org.example.seminar6.cw4;

import org.example.seminar6.cw4.model.Celsius;
import org.example.seminar6.cw4.model.Fahrenheit;
import org.example.seminar6.cw4.model.Kelvin;

public class Ex4 {
    public static void main(String[] args) {
        Double t = 36.6;
        Double tFar = new Fahrenheit().convert(t); //создаем класс
        System.out.println(tFar);
        Double tKel = new Kelvin().convert(t);
        System.out.println(tKel);
        Double tCel = new Celsius().convert(t);
        System.out.println(tCel);
    }
}
