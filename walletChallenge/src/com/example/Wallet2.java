package com.example;

public class Wallet2 {

    float money;
    Wallet2(float amount){
        this.money = amount;
    }

    public void addMoney(float amount){
        this.money += amount;
    }

    public void removeMoney(float amount){
        this.money -= amount;
    }

    public void printMoney(){
        System.out.println("Money: " + money);
    }

}





                /*
        Stwórz klasę Wallet, któa w konstruktorze przyjmie kwotę początkową portfela np 3000,
        wewnątrz zostanie przechowana jako float money.
        Portfel ma metodę addMoney() z parametrem amount która doda tą kwotę do money.
        Na podobnej zasadzie zadziała removeMoney() odejmujac przekazaną kwotę.
        Ostatnią metodą portfela jest printAmount() która ma pokazać aktualną wartość portfela.

        W głównej klasie Main stwórz portfel oraz pętlę dla 6 miesięcy przychodów i wydatków.
        W każdym miesiącu do portfela dodaj 5000, również odejmij 2000 i nastepnie 1000 zł.
        Na koniec programu wyświetl podsumowanie portfela po pół roku pracy.
     */
