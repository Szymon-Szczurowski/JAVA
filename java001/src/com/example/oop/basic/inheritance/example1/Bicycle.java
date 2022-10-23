package com.example.oop.basic.inheritance.example1;

public class Bicycle extends Vehicle{
    Bicycle(){
        // super(); dodanie automatycznie gdy nie ma
        type = "Bicycle";
        manufacturer = "Romet";
        topSpeed = 15.0f;

    }
}
