public class Wallet {

        float money;
        Wallet(float ammount) {
            this.money = ammount;
        }

        public void addMoney(float ammount) {
            this.money += ammount;
        }

        public void removeMoney(float ammount) {
            this.money -= ammount;
        }

        public void printAmount(){
            System.out.println("Kasa: " + this.money);
        }

    }

