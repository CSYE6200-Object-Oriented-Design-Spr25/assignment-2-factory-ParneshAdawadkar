package edu.neu.csye6200;

import java.util.List;

public abstract class AbstractStore {
    public abstract void demo(List<Item> items);

    protected void sortById(List<Item> items) {
        items.sort((i1, i2) -> Integer.compare(i1.getId(), i2.getId()));
    }

    protected void sortByName(List<Item> items) {
        items.sort((i1, i2) -> i1.getName().compareTo(i2.getName()));
    }

    protected void sortByPrice(List<Item> items) {
        items.sort((i1, i2) -> Double.compare(i1.getPrice(), i2.getPrice()));
    }
}