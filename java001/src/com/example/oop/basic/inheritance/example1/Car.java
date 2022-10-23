package com.example.oop.basic.inheritance.example1;

public class Car extends Vehicle{
    Car(){
        super();
        this.type = "Car";
        this.manufacturer = "Ford";
        this.topSpeed = 200;

//        super();  // odwołanie do klasy nadrzędnej
    }

    Car(String manufacturer, float topSpeed){
        this();
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }
}
