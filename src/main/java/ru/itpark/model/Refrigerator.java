package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Refrigerator extends Product {
    private Boolean abilityToOutweighTheDoors;
    private String energyClass;
    private int numberOfCompressors;
    private String typeOfRefrigerant;
    private boolean superSlimming;
}
