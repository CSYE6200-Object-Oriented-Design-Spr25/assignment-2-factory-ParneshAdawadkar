package edu.neu.csye6200;

public class ServiceItem extends Item {
    private String serviceType;

    public ServiceItem(String csvString) {
        super(Integer.parseInt(csvString.split(",")[0]), csvString.split(",")[1], Double.parseDouble(csvString.split(",")[2]));
        this.serviceType = csvString.split(",")[3];
    }

    @Override
    public String toString() {
        return "ServiceItem [ID: " + id + ", Name: " + name + ", Price: " + price + ", Service Type: " + serviceType + "]";
    }
}