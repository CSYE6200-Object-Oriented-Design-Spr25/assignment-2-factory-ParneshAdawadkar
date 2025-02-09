package edu.neu.csye6200;

public class FoodItemFactory implements ItemFactory {

    @Override
    public FoodItem createItem(String csvString) {
        return new FoodItem(csvString);
    }
}