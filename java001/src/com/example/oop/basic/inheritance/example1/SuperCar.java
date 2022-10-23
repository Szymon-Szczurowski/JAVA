package com.example.oop.basic.inheritance.example1;

public class SuperCar extends Car{
    SuperCar(){
        type = "super Car";
        topSpeed = 300.0f;
    }

    public void setSportMode(){
        System.out.println("Sport mode activated");
    }
}
