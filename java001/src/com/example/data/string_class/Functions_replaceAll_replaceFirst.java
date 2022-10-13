package com.example.data.string_class;

public class Functions_replaceAll_replaceFirst {
    public static void main(String[] args) {
        String str = "Jan kowalski Kasia Kowalska";

        String str1 = str.replaceAll("Kowalska", "Zawadzka");
        System.out.println(str1);

        String str2 = str.replaceFirst(" ", " Junior ");
        System.out.println(str2);

    }
}
