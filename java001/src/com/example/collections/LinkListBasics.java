package com.example.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListBasics {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Rafał");
        list.addLast("Olek");

        //[Rafał, Adam, Ola, Olek]
        System.out.println(list);
        System.out.println(list.getFirst()); //rafal
        System.out.println(list.getLast()); //olek

        list.removeLast();
        list.removeFirst();
        System.out.println(list);

        System.out.println(list.contains(p1)); //true
        list.add("Daniel");
        list.add("Kuba");
        list.add(p1);
        list.add("Ania");

        list.removeFirstOccurrence(p1);
        list.removeLastOccurrence("Ania");
        System.out.println(list); // [Adam, Daniel, Kuba, Ola]

        list.add(2, "Zenon");
        list.set(0, "Katarzyna");
        System.out.println(list.size());

        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()){
            String str = iterator1.next();
            System.out.println(str);

        }

//        Katarzyna
//        Daniel
//        Zenon
//        kuba
//        Ola
        System.out.println("\n");
        ListIterator<String> iterator2 = list.listIterator(list.size());
        while (iterator2.hasPrevious()){
            String str = iterator2.previous();
            System.out.println(str);
        }

//Ola
//Kuba
//Zenon
//Daniel
//Katarzyna



    }
}
