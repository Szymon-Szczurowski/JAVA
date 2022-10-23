package com.example.oop.basic;

class PlaneWithStatic {

    static int nextId = 1;
    int id;
    int x,y;

    static int getNextId(){
        return nextId++;
    }
    PlaneWithStatic(){
        id = nextId++;
//        id = PlaneWithStatic.nextId;
//        nextId++;

//        id = PlaneWithStatic.getNextId();

        // id = getNextId();
    }
}


public class StaticExample {

    public static int add(int a, int b){
        return a + b;
    }

    public int substract (int a, int b){
        return a - b;
    }


    public static void main(String[] args) {
        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();

//        plane3.nextId = 7;
//
//        System.out.println("Plane.nextId: " + PlaneWithStatic.nextId);
//        System.out.println("plane2.nextId: " + plane2.nextId);
//        System.out.println("plane3.nextId: " + plane3.nextId);

//        plane3.nextId = 7;

        System.out.println("plane1.id: " + plane1.id);
        System.out.println("plane2.id: " + plane2.id);
        System.out.println("plane3.id: " + plane3.id);

        System.out.println(StaticExample.add(10,12));

        StaticExample staticExamplee   = new StaticExample();
        System.out.println(staticExamplee.substract(10,12));


    }
}


