package com.example;

public class CarFactory {

    CarFactory() {}

    public Car buildCar(){
        String color[] = {"red","black","white"};
        int ranIndex = (int)Math.floor(Math.random() * color.length);
        String randomColor = color[ranIndex];

        return new Car("Ford", "Mustang", randomColor);
    }
}
