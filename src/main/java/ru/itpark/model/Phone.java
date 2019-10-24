package ru.itpark.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class Phone extends Product {
    private String simType;
    private int numberOfSupportedSimCards;
    private String system;
    private boolean lte;
    private int ramSize;
    private int theAmountOfInternalMemory;

    public Phone(long id, String category, String name, int price, double assessment, boolean availableToOrder, String description, String simType, int numberOfSupportedSimCards, String system, boolean lte, int ramSize, int theAmountOfInternalMemory) {
        super(id, category, name, price, assessment, availableToOrder, description);
        this.simType = simType;
        this.numberOfSupportedSimCards = numberOfSupportedSimCards;
        this.system = system;
        this.lte = lte;
        this.ramSize = ramSize;
        this.theAmountOfInternalMemory = theAmountOfInternalMemory;
    }
}
