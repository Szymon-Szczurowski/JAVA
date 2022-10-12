package com.example.data.string_class;

public class Functions_isEmpty_isBlank {
    public static void main(String[] args) {
        String emptyStr = "";
        String blankStr = "  \n     ";
        if (emptyStr.isEmpty()){
            //true
            System.out.println("emptyStr est pusty - isEmpty");
        }

        if (blankStr.isEmpty()){//false
            //true
            System.out.println("blankStr jest pusty - isEmpty");
        }else {
            System.out.println("blankStr nie jest pusty - isEmpty");
        }

        if (blankStr.isBlank()) System.out.println("blankStr ma 0 znaków lub same białe zanki - isBlank");

        if (emptyStr.isBlank()) System.out.println("emptyStr ma 0 znaków lub same białe zanki - isBlank");




    }
}
