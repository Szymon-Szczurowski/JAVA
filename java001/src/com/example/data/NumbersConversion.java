package com.example.data;

public class NumbersConversion {
    public static void main(String[] args) {

        // konwersja jawna - zwężająca
        int i = 5;
        double d = 20.d / (double) i;
        System.out.println(d);

        // konwersja niejawna - rozszerzająca
        int a = 4;
        double b = 10.0d * a;
        System.out.println(b);

        // rzutowanie/casting

        double d2 = 5.5; // przy rzutowaniu/konwersji float/double na
                        // typ całkowity część ułamkowa jest tracona
        int num = 10 * (int)d2;
        System.out.println(num); // 50

        short small = (byte)200; //rzutowanie z short na byte co powoduje utratę informacji
        System.out.println(small);

    }
}
