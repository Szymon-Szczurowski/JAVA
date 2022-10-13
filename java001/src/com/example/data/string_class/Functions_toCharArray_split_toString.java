package com.example.data.string_class;

public class Functions_toCharArray_split_toString   {
    public static void main(String[] args) {

        String str = "Ola ma kota";

        char arr[] = str.toCharArray();
        System.out.println("Liczba znaków: " + arr.length);

        String strArr[] = str.split(" ");

        for(int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        String s = str.toString();
        System.out.println(s);

        System.out.println(strArr.toString());

        Integer i = new Integer(123);
        System.out.println(i.toString());

        String text= "Liczba: " + i;
        System.out.println(text);


    }
}
