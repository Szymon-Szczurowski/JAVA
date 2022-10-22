package com.example.oop.basic;

class PointWithConstants {
    int x, y;
    final int width = 12;
    final int height;

    PointWithConstants(){
        height = 20;
    }

    PointWithConstants(int posX, int posY){
        this();
        x = posX;
        y = posY;

    }

    public void changePosition( int newX, final int newY) {
        newX = 30; // zmiana wartości argumentu
        x = newX;
        y = newY;
    }
}

public class FinalConstantsExample {
    public static void main(String[] args) {

        PointWithConstants p1 = new PointWithConstants(33, 44);
        p1.changePosition(55,66);
        System.out.println(p1.x + " " +  p1.y);

    }
}
