package org.example.seminar3.HW3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,  * фамилия автора содержит «А» и год издания после 2010 г,
 * включительно.
 */
@Data
@AllArgsConstructor
public class Books {
    private String title;
    private String surname;
    private Double price;
    private Integer year;
    private Integer pages;
}
