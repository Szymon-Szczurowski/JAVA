package com.example.data.string_class;

public class Function_startsWith_endsWith {
    public static void main(String[] args) {
        String str = "Java program";

        if (str.startsWith("PHP")) {
            System.out.println("Start with PHP");
        }
        if (str.startsWith("Java")) {
            System.out.println("Start with Java");
        }

        if (str.endsWith("program")) {
            System.out.println("End with program");
        }


    }
}
