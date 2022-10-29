public class Wallet {
    float money;

    Wallet(float money) {
        this.money = money;
    }

    public void addMoney(float amount) {
        money += amount;
    }

    public void removeMoney(float amount) {
        money -= amount;
    }

    public void printAmount(){
        System.out.println("money: " + money);
    }
}
