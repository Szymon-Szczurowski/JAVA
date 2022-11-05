package com.example.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListIteratorManipulation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Rafał");
        list.addLast("Olek");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String str = iterator.next();

            System.out.println(str);

            if (str.equalsIgnoreCase("ola")){
                iterator.set("Zuza");
            }

            if (str.equalsIgnoreCase("Adam")){
                iterator.add("Karol");
            }

            if (str.equalsIgnoreCase("Rafał")){
                iterator.remove();
            }

        }
        System.out.println("\n");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }

    }
}
