package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMethods {
    public static void main(String[] args) {
        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Dodge");
        arrStr.add("Porsche");
        arrStr.add("Audi");

        arrStr.iterator().forEachRemaining(element -> {
            System.out.println(element);
    });


        Iterator<String> iterator = arrStr.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("Dodge")) {
                iterator.remove();
            }
        }

        System.out.println(arrStr);


    }
}
