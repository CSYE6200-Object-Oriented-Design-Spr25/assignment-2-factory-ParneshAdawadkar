package edu.neu.csye6200;

public class ElectronicItem extends Item {
    private int warrantyPeriod;

    public ElectronicItem(String csvString) {
        super(Integer.parseInt(csvString.split(",")[0]), csvString.split(",")[1], Double.parseDouble(csvString.split(",")[2]));
        this.warrantyPeriod = Integer.parseInt(csvString.split(",")[3]);
    }

    @Override
    public String toString() {
        return "ElectronicItem [ID: " + id + ", Name: " + name + ", Price: " + price + ", Warranty Period: " + warrantyPeriod + " months]";
    }
}