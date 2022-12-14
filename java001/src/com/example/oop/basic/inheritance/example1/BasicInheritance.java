package com.example.oop.basic.inheritance.example1;

public class BasicInheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.printInfo();

        Car car = new Car();
        car.printInfo();

        Car car2 = new Car("Audi", 280.0f);
        car2.printInfo();

        Bicycle bicycle = new Bicycle();
        bicycle.printInfo();

        SuperCar superCar = new SuperCar();
        superCar.printInfo();
        superCar.setSportMode();
    }
}
