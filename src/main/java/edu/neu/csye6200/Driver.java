package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ruchika Sharm
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

         //Add your code in between these two print statements
		try {
            // Reading from CSV files
            List<String> foodItemsCSV = FileUtil.readFile("/Users/parneshadawadkar/Desktop/UniversityCourseWork/SecondSemester/OOD/Lab/assignment-2-factory-ParneshAdawadkar/src/resources/FoodItemCSV.txt");
            List<String> electronicItemsCSV = FileUtil.readFile("/Users/parneshadawadkar/Desktop/UniversityCourseWork/SecondSemester/OOD/Lab/assignment-2-factory-ParneshAdawadkar/src/resources/ElectronicItemCSV.txt");
            List<String> serviceItemsCSV = FileUtil.readFile("/Users/parneshadawadkar/Desktop/UniversityCourseWork/SecondSemester/OOD/Lab/assignment-2-factory-ParneshAdawadkar/src/resources/ServiceItemCSV.txt");

            // Creating items using factories
            ItemFactory foodItemFactory = new FoodItemFactory();
            ItemFactory electronicItemFactory = ElectronicItemFactory.getInstance();
            ItemFactory serviceItemFactory = ServiceItemFactory.getInstance();

            List<Item> items = new ArrayList<>();

            for (String line : foodItemsCSV) {
                items.add(foodItemFactory.createItem(line));
            }
            for (String line : electronicItemsCSV) {
                items.add(electronicItemFactory.createItem(line));
            }
            for (String line : serviceItemsCSV) {
                items.add(serviceItemFactory.createItem(line));
            }

            // Demonstrating store functionalities
            Store store = new Store();
            store.demo(items);

        } catch (Exception e) {
            e.printStackTrace();
        }
		
		System.out.println("\n\n============Main Execution End===================");
	}

}


