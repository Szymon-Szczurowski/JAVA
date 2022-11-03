package com.example.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CompareDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 12, 12);
        LocalDate date2 = LocalDate.of(2021, 2, 3);

        if (date1.isAfter(date2)) {
            System.out.println("2022 > 2021");
        }

        if (date2.isBefore(date1)){
            System.out.println("2021 < 2022");
        }

        if (date1.isEqual(date2)){
            System.out.println("2022 = 2021");
        }


        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2022,11,11,11,11,11);

        if(localDateTime2.isAfter(localDateTime1)) {
            System.out.println("localDateTime2 > localDateTime1");
        }


    }
}
