package edu.neu.csye6200;

public class FoodItem extends Item {
    private String expirationDate;

    public FoodItem(String csvString) {
        super(Integer.parseInt(csvString.split(",")[0]), csvString.split(",")[1], Double.parseDouble(csvString.split(",")[2]));
        this.expirationDate = csvString.split(",")[3];
    }

    @Override
    public String toString() {
        return "FoodItem [ID: " + id + ", Name: " + name + ", Price: " + price + ", Expiration Date: " + expirationDate + "]";
    }
}