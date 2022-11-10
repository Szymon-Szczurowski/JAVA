package com.example.kol;

class Point<T, U, V>{
    private T x;
    private U y;
    private V z;

    public Point(T x, U y, V z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public U getY() {
        return y;
    }

    public void setY(U y) {
        this.y = y;
    }

    public V getZ() {
        return z;
    }

    public void setZ(V z) {
        this.z = z;
    }

    // konstruktor, getter, setter
}

public class Generic {
    public static void main(String[] args) {

    }
}
