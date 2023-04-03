package org.example.seminar6.hw6.model;

import java.util.*;




public class Filter {
    Set<Notebook> notebookList = new HashSet<>();


    public void search() {

        System.out.println("1 - Марка\n" +
                "2 - Процессор\n" +
                "3 - Оперативная память\n" +
                "4 - Объем памяти\n" +
                "5 - Цена\n" +
                "Введите цифру, соответствующую необходимому критерию: ");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()) {
            case 1:
                System.out.println("Введите марку ноутбука: ");
                String brand = scan.next();
                for (var item : notebookList) {
                    if (item.getBrand().equals(brand)) {
                        notebookList.add(item);
                        System.out.println(notebookList);
                    }

                }
                break;

            case 2:
                System.out.println("Введите модель процессора: ");
                String cpu = scan.next();
                for (var item : notebookList) {
                    if (item.getCpu().contains(cpu)) {
                        notebookList.add(item);
                        System.out.println(notebookList);
                    }
                }
                break;
        }
    }

}






