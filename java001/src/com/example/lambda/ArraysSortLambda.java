package com.example.lambda;

import java.util.Arrays;

public class ArraysSortLambda {
    public static void main(String[] args) {
        String arrStr[] = {"Ford", "BMW", "Audi", "Mercedes", "Doge"};

        Arrays.sort(arrStr, (first, second) -> {return first.length() - second.length();});

        for(String arr : arrStr) {

            System.out.println(arr);
        }
    }

}
