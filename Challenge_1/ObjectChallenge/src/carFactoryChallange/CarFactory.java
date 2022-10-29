package carFactoryChallange;

public class CarFactory {



    public Car buildCar(){
        String color[] = {"red", "black", "white"};
        int random = (int)Math.floor(Math.random() * color.length);

//        Car car = new Car("Ford", "Mustang", color[random]);
//        return car;

        return new Car("Ford", "Mustang", color[random]);
    }
}
