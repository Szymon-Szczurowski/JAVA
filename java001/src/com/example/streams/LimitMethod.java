package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Ford", 260, 200000, 4));
        cars.add(new Car("Ciotroen", 200, 50000, 3));
        cars.add(new Car("Audi", 350, 500000, 5));
        cars.add(new Car("Merc", 300, 10000, 4));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("BMW", 240, 30000, 3));


        List<Car> list = cars.stream()
                .filter(car -> car.price < 500000)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
