public class Car {
    String manufacturer;
    String model;
    String color;

    Car(String manufacturer, String model, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void printInfo() {
        System.out.println("Manufacturer: " + manufacturer + " Model: "
                + model + " Color: " + color);
    }


}
