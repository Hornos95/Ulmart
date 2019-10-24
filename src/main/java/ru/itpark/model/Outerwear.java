package ru.itpark.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Outerwear extends Product {
    private String internationalSize;
    private String typeOfGoods;
    private int proportions;
    private String mainColor;
    private String material;

    public Outerwear(long id, String category, String name, int price, double assessment, boolean availableToOrder, String description, String internationalSize, String typeOfGoods, int proportions, String mainColor, String material) {
        super(id, category, name, price, assessment, availableToOrder, description);
        this.internationalSize = internationalSize;
        this.typeOfGoods = typeOfGoods;
        this.proportions = proportions;
        this.mainColor = mainColor;
        this.material = material;
    }
}
