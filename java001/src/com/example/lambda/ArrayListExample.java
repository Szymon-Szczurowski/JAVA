package com.example.lambda;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("audi");
        list.add("merc");
        list.add(null);
        list.add("bwm");
        list.add(null);

        list.removeIf(a -> a == null || a.equalsIgnoreCase("bwm"));
        System.out.println(list);
    }
}
