public class Truck {
    String producent;
    String Model;
    int numWheels;
    String color;

    final float TOP_SPEED = 100;
    final float ACCELERATION;

    Truck(){
        this.producent = "Freightliner";
        this.Model = "9664";
        this.numWheels = 6;
        this.ACCELERATION = 60;
    }

    Truck(String color){
        this();
        this.color = color;
    }

    public void printInfo(){
        System.out.println("model: " + Model + "\n" + "color: " + color);
    }
}
