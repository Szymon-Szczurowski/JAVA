package com.example.oop.basic.interface_extends_default_static_final_methods;

public interface Flying {
    public static final float DEAFAULT_WINGSPAN = 0.7f;
    public void fly();

    public default void FlyHigher(){
        System.out.println("FlyHigher");
    }

    public default float getWingspan(){
        return Flying.DEAFAULT_WINGSPAN;
    }

    public static int getDefaultNumWings(){
        return 2;
    }
}
