package com.example.oop.basic.inheritance.example2_shop;

public class Products {
    public float price;
    public String name;
    public String manufacturer;
    public int productionYear;

    Products(){
        price = 0;
        name = "unknown";
        manufacturer = "unknown";
        productionYear = 0;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
        System.out.println("Production Year: " + productionYear);}
}
