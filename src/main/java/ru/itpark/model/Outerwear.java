package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Outerwear extends Product {
    private String internationalSize;
    private String typeOfGoods;
    private int proportions;
    private String primary;
    private String material;
}
