package com.example.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String[] args) {

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(56);
        tree.add(4);
        tree.add(23);
        tree.add(1);

        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        System.out.println("\n");

        Iterator<Integer> descendingIterator = tree.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
