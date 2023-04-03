package org.example.seminar6.hw6.model;

import java.util.*;


public class Filter {



    public static void search() {
        Set<Notebook> notebookList = new HashSet<>();
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
                for (var item : notebooks) {
                    if (item.getBrand().equals(brand)) {
                        notebookList.add(item);
                    }
                }
                System.out.println(notebookList);
                break;

            case 2:
                System.out.println("Введите модель процессора: ");
                String cpu = scan.next();
                for (var item : notebooks) {
                    if (item.getCpu().contains(cpu)) {
                        notebookList.add(item);
                    }
                }
                System.out.println(notebookList);
                break;

            case 3:
                System.out.println("Введите минимальный объем оперативной памяти: ");
                int ram = scan.nextInt();
                for (var item : notebooks) {
                    if (item.getRam() >= ram) {
                        notebookList.add(item);
                    }
                }
                System.out.println(notebookList);
                break;

            case 4:
                System.out.println("Введите минимальный объем памяти жесткого диска: ");
                int ssd = scan.nextInt();
                for (var item : notebooks) {
                    if (item.getSsd() >= ssd) {
                        notebookList.add(item);
                    }
                }
                System.out.println(notebookList);
                break;

            case 5:
                System.out.println("Введите минимальную стоимость ноутбука: ");
                int price = scan.nextInt();
                for (var item : notebooks) {
                    if (item.getPrice() >= price) {
                        notebookList.add(item);
                    }
                }
                System.out.println(notebookList);
                break;
            default:
                System.out.println("Не найдено.");
                break;
        }
    }

}






