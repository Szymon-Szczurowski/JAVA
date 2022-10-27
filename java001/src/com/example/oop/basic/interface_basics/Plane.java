package com.example.oop.basic.interface_basics;

public class Plane implements Vehicle, Flying{
    @Override
    public void move() {
        System.out.println("Plane is moving");
    }

    @Override
    public void stop() {
        System.out.println("Plane stopped");
    }

    @Override
    public void turn() {
        System.out.println("Plane turned");
    }

    @Override
    public float getTopSpeed() {
        return 800;
    }

    @Override
    public void increaseHeight() {
        System.out.println("Plane increased height");
    }

    @Override
    public void decreaseHeight() {
        System.out.println("Plane decreased height");
    }
}
