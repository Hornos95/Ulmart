package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone extends Product {
    private String simType;
    private int numberOfSupportedSimCards;
    private String system;
    private boolean lte;
    private int ramSize;
    private int theAmountOfInternalMemory;

}
