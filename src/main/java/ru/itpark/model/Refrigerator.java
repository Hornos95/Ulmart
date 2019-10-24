package ru.itpark.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Refrigerator extends Product {
    private Boolean abilityToOutweighTheDoors;
    private String energyClass;
    private int numberOfCompressors;
    private String typeOfRefrigerant;
    private boolean superSlimming;

    public Refrigerator(long id, String category, String name, int price, double assessment, boolean availableToOrder, String description, Boolean abilityToOutweighTheDoors, String energyClass, int numberOfCompressors, String typeOfRefrigerant, boolean superSlimming) {
        super(id, category, name, price, assessment, availableToOrder, description);
        this.abilityToOutweighTheDoors = abilityToOutweighTheDoors;
        this.energyClass = energyClass;
        this.numberOfCompressors = numberOfCompressors;
        this.typeOfRefrigerant = typeOfRefrigerant;
        this.superSlimming = superSlimming;
    }
}
