package com.example.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime()); //timestamp

        SimpleDateFormat dateformat = new SimpleDateFormat("HH:mm:ss dd:MM:YYYY");
        System.out.println(dateformat.format(date));
    }
}

// Formatowanie daty
// y - rok jako liczby np 2021
// M - miesiąc w roku np. Jan czy 01
// d - dzień np. 10
// h - godzina (1-12)  np. 6
// H - godzina (0-23)  np. 15
// m - minuta np 45
// s - sekunda np 56
// S - milisekunda np 456
// E - dzień tygodnia np pon.
// D - dzień roku np 123
// w - numer tygodnia w roku np 3
// W - numer tygodnia w miesiącu np 2
// a - A.M. / P.M.   np PM
// z - time zone np Eastern Standard Time