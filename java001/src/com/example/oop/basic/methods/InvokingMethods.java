package com.example.oop.basic.methods;

class Triangle {
    float a; //długość podsatwy
    float h; //wysokość
    float surfaceArea; //pole

    Triangle(float base, float height) {
        a = base;
        h = height;
    }

}

class MyMath{
    public void add(int a, int b){
        a = 20;
        int result = a + b;
        System.out.println("result: " + result);
    }
}

public class InvokingMethods {
    public static void main(String[] args) {

        MyMath math = new MyMath();
        int a = 10;
        int b = 7;
        math.add(a, b);
        System.out.println("a: " + a);

        Triangle triangle = new Triangle(10.0f, 5.0f);
    }
}
