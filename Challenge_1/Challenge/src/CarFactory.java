public class CarFactory {

    public Car buildCar(){
        String colors[] = {"red", "green", "blue"};
        int randIndex = (int) Math.floor(Math.random() * colors.length);
        String result = colors[randIndex];
        return new Car("Ford", "Mustang", result);
    }

}
