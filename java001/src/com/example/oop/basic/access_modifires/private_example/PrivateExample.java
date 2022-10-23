package com.example.oop.basic.access_modifires.private_example;

public class PrivateExample {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.getName());

        car.setName("NewCar");
        System.out.println(car.getName());



    }
}
