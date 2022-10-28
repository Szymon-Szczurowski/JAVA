package truck2;

public class Truck {
    String manufacturer, model, color;
    int numWheels;

    final float TOP_SPEED = 100.0f;
    final float ACCELERATION;

    public Truck() {
        manufacturer = "Freightliner";
        model = "9664";
        numWheels = 6;
        ACCELERATION = 60.0f;
    }

    public Truck(String color) {
        this();
        this.color = color;
    }

    public void printInfo(){
        System.out.println("Manufacturer: " + manufacturer + " Model: " + model + " Color: " + color);
    }

}
