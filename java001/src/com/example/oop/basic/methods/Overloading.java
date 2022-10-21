package com.example.oop.basic.methods;

import com.sun.security.jgss.GSSUtil;
class  RectangleOverLoading{
    float side1, side2;

    RectangleOverLoading(){
        this(10.0f);
    }

    RectangleOverLoading(float v){
        side1 = side2 = v;
    }

    RectangleOverLoading(float side1, float side2){
        this.side1 = side1;
        this.side2 = side2;
    }
}
class MathOverLoading{
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public int add(int a, int b){
        return a * b;
    }

    public double add(double a, double b){
        return a + b;
    }

}

public class Overloading {
    public static void main(String[] args) {

        MathOverLoading math = new MathOverLoading();
        System.out.println(math.add(1, 2, 3));
        System.out.println(math.add(2,4));
        System.out.println(math.add(5.0, 7.0));

        RectangleOverLoading rect = new RectangleOverLoading();
        System.out.println(rect.side1);

        RectangleOverLoading rect2 = new RectangleOverLoading(50.0f);
        System.out.println(rect2.side1);

        RectangleOverLoading rect3 = new RectangleOverLoading(100.0f, 50.0f);
        System.out.println(rect3.side1 + rect3.side2);

    }
}
