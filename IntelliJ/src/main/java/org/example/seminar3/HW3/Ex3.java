package org.example.seminar3.HW3;

import org.example.seminar3.HW3.model.Books;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,  * фамилия автора содержит «А» и год издания после 2010 г,
 * включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        Books books = new Books("Букварь", "Иванов", 150.0, 1991, 230);
        Books books1 = new Books("Вторая", "Петров", 200.0, 1992, 127);
        Books books2 = new Books("Синяя", "Садоводов", 165.6, 1994, 97);
        Books books3 = new Books("Война и Мир", "Толстой", 450.0, 1973, 800);
        Books books4 = new Books("Та что найдется", "Авдеев", 1000.0, 2023, 388);
        Books books5 = new Books("Последняя", "Капустин", 1000.0, 2010, 283);

        List<Books> booksList = new ArrayList();
        booksList.add(books);
        booksList.add(books1);
        booksList.add(books2);
        booksList.add(books3);
        booksList.add(books4);
        booksList.add(books5);

        System.out.println("Нашлись следующие книги: ");
        for (Books el : booksList) {
            if ((ProstNum(el.getPages())) &&
                    ((el.getSurname().contains("А")) || (el.getSurname().contains("а"))) &&
                    (el.getYear() >= 2010)) {
                System.out.println(el.getTitle());
            }
        }
    }

    private static boolean ProstNum(Integer pages) {
        if ((pages == 2 || pages == 5 || pages == 3) &&
                (pages % 10 == 5 || pages % 2 == 0 || pages % 3 == 0)) {
            int count = 0;
            for (int j = 2; j <= Math.sqrt(pages); j++) {
                if (pages % j != 0) {
                    count += 1;
                }
            }
            if (count > 0) {
                return false;
            }
        }
        return true;
    }
}