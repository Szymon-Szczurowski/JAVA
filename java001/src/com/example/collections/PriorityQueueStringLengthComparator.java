package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthen implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

public class PriorityQueueStringLengthComparator {
    public static void main(String[] args) {
        PriorityQueue<String> test = new PriorityQueue<>(new StringLengthen());


    test.add("desk");
    test.add("operator");
    test.add("result");
    test.add("length");
    test.add("add");

    while(!test.isEmpty()) {
        System.out.println(test.poll());
    }
    }
}
