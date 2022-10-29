public class Bike {
    public String brand;
    protected String name;
    private String type;

    Bike(){}

    Bike(String brand, String name) {
        this.brand = brand;
        this.name = name;
        type = "bike";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}
