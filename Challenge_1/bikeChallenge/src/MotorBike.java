
public class MotorBike extends Bike {

    MotorBike(String brand, String name){
//        this.brand = brand;
//        this.name = name;
        super(brand, name);
        this.setType("MotorBike");
    }

    public void printInfo(){
        System.out.println("MotorBike");
        super.printInfo();

    }
}
