package org.example.seminar3.HW3.model;

import lombok.AllArgsConstructor;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
@lombok.Data
@AllArgsConstructor
public class Data {
    private String name;
    private String country;
    private Double weight;
    private Double price;
    private Integer sort;

}
