package com.example.collections;

import java.util.PriorityQueue;

public class PriorityQueueExampleBasics {
    public static void main(String[] args) {

        PriorityQueue<Integer> test = new PriorityQueue<>();

        test.add(99);
        test.add(14);
        test.add(56);
        test.add(88);

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
        /*
        14
        56
        88
        99
         */
        System.out.println("\n");

        test.add(108);
        test.add(45);
        test.add(74);

        System.out.println(test.peek());
        System.out.println(test.peek());
    }
}
