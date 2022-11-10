package com.example.streams;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSetMethod {
    public static void main(String[] args) {

        // Set pozwala nam wyświetlić unikalne dane, ale trzeba zdefiniować metody w klasie np. tak jak w Car

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Ford", 260, 200000, 4));

        cars.add(new Car("Citroen", 200, 50000, 3));
        cars.add(new Car("Citroen", 200, 50000, 3));
        cars.add(new Car("Citroen", 200, 50000, 3));

        cars.add(new Car("Audi", 350, 500000, 5));
        cars.add(new Car("Merc", 300, 10000, 4));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("BMW", 240, 30000, 3));

        Set<Car> set = cars.stream()
                .filter(car -> car.price < 300000)
                .collect(Collectors.toSet());

        set.forEach(e -> System.out.println(e));

    }
}
