package com.example.streams;

import java.util.ArrayList;

public class MaxMinMethods {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Ford", 260, 200000, 4));
        cars.add(new Car("Ciotroen", 200, 50000, 3));
        cars.add(new Car("Audi", 350, 500000, 5));
        cars.add(new Car("Merc", 300, 10000, 4));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("BMW", 240, 30000, 3));

      Car carMaxPrice  = cars.stream()
              .max((car1, car2) -> car1.price > car2.price ? 1 : -1)
              .get();

        System.out.println(carMaxPrice);


        System.out.println("\n");


        Car carMinPrice  = cars.stream()
                .min((car1, car2) -> car1.price > car2.price ? 1 : -1)
                .get();

        System.out.println(carMinPrice);


        System.out.println("\n");


        Car carMaxRating  = cars.stream()
                .max((car1, car2) -> car1.rating > car2.rating ? 1 : -1)
                .get();

        System.out.println(carMaxRating);
    }
}
