package com.example.oop.basic.inheritance.example2_shop;

public class Computer extends Products{
    public Mouse mouse;
    public Monitor monitor;
    public Keyboard keyboard;


    Computer(){
        mouse = new Mouse();
        monitor = new Monitor();
        keyboard = new Keyboard();
    }
}
