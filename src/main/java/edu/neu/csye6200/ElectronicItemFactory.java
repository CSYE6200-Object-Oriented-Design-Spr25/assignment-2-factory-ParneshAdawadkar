package edu.neu.csye6200;

public class ElectronicItemFactory implements ItemFactory {
    private static ElectronicItemFactory instance;

    private ElectronicItemFactory() {}

    public static synchronized ElectronicItemFactory getInstance() {
        if (instance == null) {
            instance = new ElectronicItemFactory();
        }
        return instance;
    }

    @Override
    public ElectronicItem createItem(String csvString) {
        return new ElectronicItem(csvString);
    }
}