package com.example.oop.basic.methods;

class Circle{
    float radius;

    Circle(float rad){
        radius = rad;
    }
}


class MathMethods{
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public Circle getNewCircle(float radius) {
        Circle c = new Circle(radius);
        return c;
    }
}

public class RetunValueAndObject {

    public static void main(String[] args) {

        MathMethods math = new MathMethods();

        int a = 12;
        int b = 3;
        int result = math.add(a, b);
        int result2 = math.substract(a, b);

        System.out.println("result: " + result + " result2: " + result2);

        Circle circle = math.getNewCircle(10.0f);
        System.out.println("radius: " + circle.radius);
    }
}
