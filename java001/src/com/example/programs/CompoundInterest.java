package com.example.programs;

import java.util.Scanner;

// procent składowy
// 1000 * (1 + 00.5)^3
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital; // rezultat z oszczędcności

        System.out.println("Wpisz kapitał początkowy:");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie np. 5 to 5%:");
        yearlyInterest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz ilość lat oszczędzania:");
        numYears = in.nextInt();

        finalCapital = startCapital * Math.pow(1 + (yearlyInterest/100), numYears);

        System.out.println("Efekt oszczęscania z procentem składanym: " + Math.round(finalCapital));


    }
}
