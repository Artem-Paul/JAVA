package org.example.seminar3.cw1;
/**
 *         1.Даны сведения об экспортируемых товарах: указывается наименование
 *         товара, страна, экспортирующая товар, и объем поставляемой партии в штуках. Найти
 *         страны, которые экспортируют данный(введенный с кл-ы) товар, и общий объем его
 *         экспорта.
 */
import org.example.seminar3.cw1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Items items = new Items("qwe","zxc",3.0);
        Items items1 = new Items("qwe1","asd",3.0);
        Items items2 = new Items("qwe2","ert",3.0);
        Items items3 = new Items("qwe","dfg",3.0);

        List<Items> itemsList= new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        int sumVolume=0;
        List<String> country=new ArrayList<>();

        for (int i = 0; i < itemsList.size(); i++) {
            if(itemsList.get(i).getName().equals(searchName)){  // get(i) кладем index и на выходе получаем Iter
                                                                // getName() обратится в конкретное поле
                                                                // equals(searchName) метод сравнения строк
                sumVolume+=itemsList.get(i).getVolume();        // накапливаем сумму значений Volume
                country.add(itemsList.get(i).getCountry());     // в list country добавляем страну
            }
        }

        System.out.println("sum = "+ sumVolume);
        System.out.println(" country : "+country);
    }
}
