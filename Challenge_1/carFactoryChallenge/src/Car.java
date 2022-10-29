public class Car {
    public String model;
    public String brand;
    public String color;

    Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void printInfo() {

        System.out.println("Model: " + model + " Brand: " + brand + " Color: " + color);
}}
