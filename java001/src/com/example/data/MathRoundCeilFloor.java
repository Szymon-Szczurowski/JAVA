package com.example.data;

public class MathRoundCeilFloor {
    public static void main(String[] args) {

        // zaokrąglenie do najbliższej liczby całkowitej
        System.out.println(Math.round(5.51)); // 6
        System.out.println(Math.round(5.49)); // 4

        // rzutowanie/utrata części ułamkowej
        System.out.println( (int)5.59d );

        // Math.ceil() - najwięszka możliwa całkowita liczba
        System.out.println(Math.ceil(6.11)); // 7.0
        System.out.println(Math.ceil(6.8)); // 7.0

        // Math.floor() - najmniejsza możliwa całkowita liczba
        System.out.println(Math.floor(6.11)); // 6.0
        System.out.println(Math.floor(6.8)); // 6.0
    }
}
