package com.example.oop.basic.access_modifires.no_modifiers.package2;

import com.example.oop.basic.access_modifires.no_modifiers.package1.Product;

public class Computer extends Product {
    public Computer() {
//        setName("computer");
//        name = "Computer"; //spowoduje błąd, brak dostępu do zmiennej z innego pakietu, gdzy nie ma modyfikatora
    }
}
