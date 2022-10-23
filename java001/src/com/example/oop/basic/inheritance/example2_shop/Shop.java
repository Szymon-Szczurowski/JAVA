package com.example.oop.basic.inheritance.example2_shop;

/*
    Klasa Shop
    Klasa Prodcut (ZMIENNE: price, name, manufacturer, productionYear)
    Klasa mouse extends Prodcut (zmienne: numButtons = 3)
           Klasa VerticalMouse extends Mouse (zmienner: --)
    Klasa Monitoe extends Prodcut (zmienne: resultion = 1080)
    Klasa keyboard extends Prodcut (zmienne: numKeys = 104 )
    klasa Computer extends Prodcut (zmienne: Mouse, monitor, keyboard)

    Dodajemy pusty konstruktor do każdej klasy, Ustawiamy dla nich pola danej klasy
    Tworzymy exzemplarze klas w metodzie main
    Kązda klasa w oddzielnym pliku java
 */

public class Shop {
    public static void main(String[] args) {

        Products products = new Products();
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();
        System.out.println(computer.monitor.resulution);

        System.out.println("keyboard price: " + keyboard.price);
        System.out.println("mouse price: " + mouse.price);

        keyboard.printInfo();

    }
}
