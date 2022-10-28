package bikeChallange;

public class Bike {
    public String brand;
    protected String type;
    private String name;

    public Bike() {
    }

    public Bike(String brand, String name) {
        this.brand = brand;
        this.name = name;
        this.type = "bike";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println("type: " + type + " brand: " + brand + " name: " + name);
    }

}
