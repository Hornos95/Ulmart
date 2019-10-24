package ru.itpark.service;

import ru.itpark.comparator.ProductBayAssessmentComparator;
import ru.itpark.comparator.ProductByNameComparator;
import ru.itpark.model.Outerwear;
import ru.itpark.model.Phone;
import ru.itpark.model.Product;
import ru.itpark.model.Refrigerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ItemService {

    private final Collection<Product> items = new ArrayList<Product>();

    public void add(Product item) {
        items.add(item);
        if (item instanceof Phone) {
            Phone phone = (Phone) item;
        }
        if (item instanceof Outerwear) {
            Outerwear outerwear = (Outerwear) item;
        }
        if (item instanceof Refrigerator) {
            Refrigerator refrigerator = (Refrigerator) item;
        }
    }

    public void addAll(Product... items) {
        Collections.addAll(this.items, items);
    }

    public void addAll(Collection<Product> items) {
        this.items.addAll(items);
    }

    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product item : items) {
            if (item.getName().startsWith(name)) {
                result.add(item);
            }
        }
        result.sort(new ProductByNameComparator());
        return result;
    }
    public List<Product> searchByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product item : items) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }
        result.sort(new ProductByNameComparator());
        return result;
    }

    public List<Product> sortByName() {
        List<Product> result = new ArrayList<>(items);
        result.sort(new ProductByNameComparator());
        return result;
    }

    public List<Product> sortByRating() {
        List<Product> result = new ArrayList<>(items);
        result.sort(new ProductBayAssessmentComparator());
        return result;
    }

    public List<Product> sortByPrice() {
        List<Product> result = new ArrayList<>(items);
        Collections.sort(result);
        return result;
    }


}