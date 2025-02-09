package edu.neu.csye6200;

import java.util.List;

public class Store extends AbstractStore {

    @Override
    public void demo(List<Item> items) {
        System.out.println("Before Sorting:");
        items.forEach(System.out::println);

        sortById(items);
        System.out.println("\nAfter Sorting by ID:");
        items.forEach(System.out::println);

        sortByName(items);
        System.out.println("\nAfter Sorting by Name:");
        items.forEach(System.out::println);

        sortByPrice(items);
        System.out.println("\nAfter Sorting by Price:");
        items.forEach(System.out::println);
    }
}