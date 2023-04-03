package org.example.seminar2.cw2;

import org.example.seminar2.cw2.model.Vector;


public class Ex2 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2= new Vector(1.0, 2.0, 1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Длинна вектора 1 = " + vector1.lenghtVector());
        System.out.println("Длинна вектора 2 = " + vector2.lenghtVector());
        System.out.println("Скалярное произведение вектора = " + vector1.scalarMulti(vector2));
        System.out.println("Векторное произведение = " + vector1.vectorMulti(vector2));
        System.out.println("Косинус угла = " + vector1.cosVector(vector2));
        System.out.println("Сумма векторов = " + vector1.vectorSum(vector2));
        System.out.println("Разница векторов = " + vector1.vectorRazn(vector2));
    }


}
