package com.example.data.string_class;

public class BlankStringAndNull {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.length());
        s1 = s1.concat("Hello World!");
        System.out.println(s1);

        String s2 = null;
        System.out.println(s2);
        s2 = "test";
        System.out.println(s2);
        System.out.println(s2.length());
    }
}
