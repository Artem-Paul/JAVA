package org.example.seminar3.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
@Data
@AllArgsConstructor
public class Items {
    private String name;
    private Double price;
    private Integer sort;
}
