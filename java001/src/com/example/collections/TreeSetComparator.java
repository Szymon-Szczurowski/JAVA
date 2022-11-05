package com.example.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class AnimalElement{
    private String name;

    public AnimalElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'';
    }
}


class AnimalElementComparator implements Comparator<AnimalElement>{
    @Override
    public int compare(AnimalElement o1, AnimalElement o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

public class TreeSetComparator {
    public static void main(String[] args) {

        TreeSet<AnimalElement> animals = new TreeSet<>(new AnimalElementComparator());
        animals.add(new AnimalElement("Tiger"));
        animals.add(new AnimalElement("Lion"));
        animals.add(new AnimalElement("Dog"));
        animals.add(new AnimalElement("Cat"));
        animals.add(new AnimalElement("Snake"));
        animals.add(new AnimalElement("Elephant"));

        Iterator<AnimalElement> iterator = animals.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n");

        for (AnimalElement element : animals) {
            System.out.println(element);
        }
    }
}
