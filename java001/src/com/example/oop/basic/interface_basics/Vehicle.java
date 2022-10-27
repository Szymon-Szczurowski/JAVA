package com.example.oop.basic.interface_basics;

public interface Vehicle {
    public abstract void move(); // Wszystkie w interfejsie są domyślnie abstrakcyjne
    public void stop();
    public void turn();
    public float getTopSpeed();
}
