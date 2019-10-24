package ru.itpark.model;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data


public class Product implements Comparable<Product> {
    private long id;
    private String category;
    private String name;
    private int price;
    private double assessment;
    private boolean availableToOrder;
    private String description;

    public int compareTo(Product o) {
        return price - o.price;
    }


}

