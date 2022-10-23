package com.example.zad;

public class Wallet {
    float money;

    Wallet(float amount) {
        this.money = amount;
    }

    public void addMoeny(float amount) {
        this.money += amount;
    }

    public void removeMoney(float amount) {
        this.money -= amount;
    }

    public void printMoney(){
        System.out.println("money = " + money);
    }

}
