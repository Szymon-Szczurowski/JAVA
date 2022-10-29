package com.example.zad2;

public class CarFactory {

    public Car buildCar(){
        String colors[] = {"black", "red", "white"};
        int ranIndex = (int)Math.floor(Math.random() * colors.length);
        String resultColor = colors[ranIndex];

        return new Car("Ford", "Mustang" , resultColor);

    }
}
