import java.io.FileOutputStream;

public class CarFactory {

    CarFactory() {
    }

  public Car buildCar(){
  String colors[] = {"black", "red", "white"};
  int ranIndex = (int)Math.floor(Math.random() * colors.length);
  String randColor = colors[ranIndex];

  return new Car("Ford","Mustang", randColor);
  }

}
