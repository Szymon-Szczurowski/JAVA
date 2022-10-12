package com.example.data.string_class;

public class Functions_lenght_toLowerCase_toYppserCase_charAt {
    public static void main(String[] args) {

        String str = "Ola ma kota";
        System.out.println("ilość znaków: " + str.length());

        char sing  = str.charAt(1);
        System.out.println(sing);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strLow = str.toLowerCase();
        System.out.println(strLow);
    }

}
