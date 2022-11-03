package com.example.date;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("YEAR " + localDate.getYear());
        System.out.println("MONTH " + localDate.getMonth());
        System.out.println("Day " + localDate.getDayOfMonth());

        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());

        localDate = localDate.plusYears(10);
        localDate = localDate.minusMonths(3);
        localDate = localDate.plusDays(1);

        System.out.println("Po zmianie");
        System.out.println("YEAR " + localDate.getYear());
        System.out.println("MONTH " + localDate.getMonth());
        System.out.println("Day " + localDate.getDayOfMonth());

    }
}
