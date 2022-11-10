package com.example.streams;

import java.util.ArrayList;

public class StreamBasics {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("jan");
        arr.add("Asia");
        arr.add("Paweł");
        arr.add("Daniel");
        arr.add("Ola");
        arr.add("Szumon");
        arr.add("Zuzanna");

        arr.stream()
                .filter(str -> str.length() > 3 && str.length() < 8)
                .filter(str -> str.startsWith("A") || str.startsWith("P"))
                .forEach(str -> System.out.println(str));

        System.out.println("\n---------------------------------------------------------\n");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Ford", 260, 200000, 4));
        cars.add(new Car("Ciotroen", 200, 50000, 3));
        cars.add(new Car("Audi", 350, 500000, 5));
        cars.add(new Car("Merc", 300, 10000, 4));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("BMW", 240, 30000, 3));

        cars.stream()
                .filter(car -> car.rating > 3)
                .filter(car -> car.price >= 200000 && car.price < 600000)
                .filter(car -> car.topSpeed > 260 && car.topSpeed < 400)
                .forEach(car -> System.out.println(car));
    }


}
