package com.example.streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMap {
    public static void main(String[] args) {

        // Mapa pozwala nam stworzyć łańcuch znaków i popierać z niego dany obiekt

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Ford", 260, 200000, 4));
        cars.add(new Car("Ciotroen", 200, 50000, 3));
        cars.add(new Car("Audi", 350, 500000, 5));
        cars.add(new Car("Merc", 300, 10000, 4));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("BMW", 240, 30000, 3));

        Map<String, Car> map = cars.stream()
                .collect(Collectors.toMap(car -> car.name, car -> car));

        System.out.println(map);

        Car car1 = map.get("Audi");
        System.out.println(car1);
    }
}
