package com.example.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList basiclist = new ArrayList();
        basiclist.add(new String("test"));
        basiclist.add("info");

        String strEl = (String) basiclist.get(0);
        System.out.println(strEl);

        System.out.println("------------------------------------------");

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Kasia");
        arrStr.add("Adam");
        arrStr.add("Kasia");
        arrStr.remove(1);
        arrStr.add(1, "Olek");

        System.out.println(arrStr);
        for (String str : arrStr){
            System.out.println(str);
        }

        System.out.println("------------------------------------------");


        arrStr.add(0, "Katarzyna");
        arrStr.set(3, "maja");
        for (String str : arrStr){
            System.out.println(str);
        }
        /*
        Katarzyna
        Kasia
        Olek
        maja
         */

        System.out.println("------------------------------------------");

        Collections.sort(arrStr); //posortowana alfabetycznie
        for (String str : arrStr){
            System.out.println(str);
        }
        /*
        Kasia
        Katarzyna
        Olek
        maja
         */
        System.out.println("------------------------------------------");

        arrStr.remove(0);
        for (String str : arrStr){
            System.out.println(str);
        }

    }
}
