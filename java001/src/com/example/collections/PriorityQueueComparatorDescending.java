package com.example.collections;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.PriorityQueue;

// kolejność rosnąca
class Desdcending implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        if (a == b) return 0;
        if (a < b)
            return 1; //malejąco
        else
            return -1;


    }
}

public class PriorityQueueComparatorDescending {
    public static void main(String[] args) {

        PriorityQueue<Integer> test = new PriorityQueue<>(new Desdcending());

        test.add(99);
        test.add(14);
        test.add(56);
        test.add(88);

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
    }
}
