package wallet;

public class Wallet {
    float money;

    public Wallet(float money) {
        this.money = money;
    }

    public void addMoney(float amount) {
        money += amount;
    }

    public void removeMoney(float amount) {
        this.money -= amount;
    }

    public void printAmount(){
        System.out.println("Money: "+ this.money);
    }

}
