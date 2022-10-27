package com.example.oop.basic.inheritance.instanceof_operator;

class Animal {
    protected String name;
    protected float weight; //kg
    protected int numLegs;
}

class Dog extends Animal {
    protected  void bark(){
        System.out.println("How how");
    }
}

class Bird extends Animal {
    protected void fly(){
        System.out.println("fly fly");
    }
}

class Parrot extends Bird {
    public void learnWord(){
        System.out.println("learn");
    }
}

class Snake extends Animal {}


public class InstanceofExample {
    public static void main(String[] args) {


    Animal animal = new Animal();
    Dog dog = new Dog();
    Bird bird = new Bird();
    Snake snake = new Snake();
    Parrot parrot = new Parrot();

        System.out.println(dog instanceof Animal); //true
        System.out.println(bird instanceof Animal); //true
        System.out.println(animal instanceof Bird); //false
        System.out.println(animal instanceof Dog); //false
        System.out.println(animal instanceof Animal); //true
        System.out.println(snake instanceof Animal); //true, bo na zawiera żadnej swojej metody itp.
        System.out.println(parrot instanceof Animal); //true
        System.out.println(parrot instanceof Parrot); //true
//        System.out.println(dog instanceof Bird);
    }

}
