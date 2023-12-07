package OOP.seminar2.cw1old.model;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Filter implements NotebookInterface {
    private final Set<Notebook> notebooks;
    public Filter (Set<Notebook> notebooks) {this.notebooks = notebooks;}
    public void search(Set<Notebook> notebooks) {
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

    @Override
    public Notebook getNotebook(String os, String brand, String model, String cpu, Integer ram, Integer ssd, Integer price) throws IllegalStateException {
        return null;
    }
}






