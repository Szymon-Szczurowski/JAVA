package com.example.streams;

import java.util.stream.Stream;

public class IterateCreateStreams {
    public static void main(String[] args) {

        // Iteracja okreśłonych wartośći na 2 sposoby

        Stream.iterate(1 , n -> n + 1)
                .limit(10)
                .forEach(s -> System.out.println(s));

        System.out.println("\n");

        Stream.iterate(1, i -> i <= 10, i -> i + 2)
                .forEach(i -> System.out.println(i));
    }
}
