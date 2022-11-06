package com.example.collections;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.PriorityQueue;

class Task implements Comparable<Task>{
    private int prority;
    private String name;

    public Task(int prority, String name) {
        this.prority = prority;
        this.name = name;
    }

    public int getPrority() {
        return prority;
    }

    public void setPrority(int prority) {
        this.prority = prority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "prority=" + prority +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Task o) {
        int x = this.prority;
        int y = o.prority;

        if (x == y) return 0;
        if (x > y)
            return 1;
        else
            return -1;
    }
}

class Comparate implements Comparator<Task>{

    @Override
    public int compare(Task o1, Task o2) {
        int x = o1.getPrority();
        int y = o2.getPrority();

        if (x == y) return 0;
        if (x > y)
            return 1;
        else
            return -1;
    }
}

public class TaskComporableExample {
    public static void main(String[] args) {

        PriorityQueue<Task> test = new PriorityQueue<>();
        test.add(new Task(2, "pies"));
        test.add(new Task(3, "zakupy"));
        test.add(new Task(1, "praca"));
        test.add(new Task(4,"nauka"));

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }




        System.out.println("\n");




        PriorityQueue<Task> test2 = new PriorityQueue<>(new Comparate());

        test2.add(new Task(2, "pies"));
        test2.add(new Task(3, "zakupy"));
        test2.add(new Task(1, "praca"));
        test2.add(new Task(4,"nauka"));

        while (!test2.isEmpty()) {
            System.out.println(test2.poll());
        }


    }
}
