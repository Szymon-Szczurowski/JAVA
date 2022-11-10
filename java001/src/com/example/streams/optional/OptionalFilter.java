package com.example.streams.optional;

import java.util.Optional;

public class OptionalFilter {
    public static void main(String[] args) {

        Optional<String> opt = Optional.ofNullable(null);

        opt.map(str -> str + " oraz informacje")
                .filter(str -> str.length() > 5)
                .or( () -> Optional.ofNullable("Nowy String"))
                .ifPresent(System.out::println);

        System.out.println("");

        Optional<String> opt2 = Optional.ofNullable("tekst");

        opt2.map(str -> str + " oraz informacje")
                .filter(str -> str.length() > 5)
                .ifPresent(System.out::println);


        System.out.println("");

        Optional<String> opt3= Optional.ofNullable("tekst");

        opt3.map(str -> str + " oraz informacje")
                .filter(str -> str.length() > 5)
                .or( () -> Optional.ofNullable("Nowy String"))
                .ifPresent(System.out::println);

    }
}
