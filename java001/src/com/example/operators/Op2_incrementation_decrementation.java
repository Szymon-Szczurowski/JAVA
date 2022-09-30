package com.example.operators;

public class Op2_incrementation_decrementation {
    public static void main(String[] args) {
        int a = 10;
        a++;

        System.out.println("a++: " + a);

        int b = 5;
        int c = 10 + b++; // inkrementacja przyrostkowa

        System.out.println("c: " + c); // 15
        System.out.println("b: " + b); // 16

        int d = 5;
        int e = 10 + ++d; //inkremntacja przedrostkowa

        System.out.println("e: " + e); // 16
        System.out.println("d: " + d); // 6
    }
}
