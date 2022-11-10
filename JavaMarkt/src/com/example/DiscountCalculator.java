package com.example;

import java.util.ArrayList;

public class DiscountCalculator{

    ArrayList<Product> products;

    public void discountByPercent(double percentage, double minimumPrice){
        minimumPrice = 300.0;
        percentage = 5.0;
        double x = 0;


        for(Product p : products){
            x = x + p.price;
        }

    }


}
