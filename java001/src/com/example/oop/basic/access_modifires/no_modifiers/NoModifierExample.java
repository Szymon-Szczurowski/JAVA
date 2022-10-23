package com.example.oop.basic.access_modifires.no_modifiers;

import com.example.oop.basic.access_modifires.no_modifiers.package1.Laptop;
import com.example.oop.basic.access_modifires.no_modifiers.package2.Computer;

public class NoModifierExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // computer.name = "sdf": // bład braku dostępu z innego pakietu

        computer.setName("Dell");
        System.out.println(computer.getName());

        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());

        System.out.println();
        computer.getName();
    }
}
