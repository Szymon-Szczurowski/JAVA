package com.example.data.string_class;

public class Functions_lastIndexOf {
    public static void main(String[] args) {
        String str = "Raz dwa trzy cztery. Raz dwa.";

        int index = str.lastIndexOf("Raz");
        System.out.println("Ostatnie występienię 'raz': " + index);
        String fragment = str.substring(index);
        System.out.println(fragment);

        index = str.indexOf("Raz");
        System.out.println("Pierwsze wystąpienie 'Raz': " + index);


    }
}
