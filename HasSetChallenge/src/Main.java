import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Ola");
        set.add("Kasia");
        set.add("Daniel");
        set.add("Ola");
        set.add("Kasia");
        set.add("Adam");

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        HashSet<Car> cars = new HashSet<>();
        Car car1 = new Car("Dodge");
        Car car2 = new Car("Citroen");
        Car car3 = new Car("Opel");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(new Car("Opel"));

        System.out.println("\n");

        Iterator<Car> iterator2 = cars.iterator();

        while(iterator2.hasNext()){
            Car car = iterator2.next();
            System.out.println(car);
        }
    }

}


        /*
           1. Stwórz HashSet z typem String i dodaj do niego następujące imiona:
              Ola, Kasia, Daniel, Ola, Kasia, Adam. Na koniec wyświetl wszystkie elementy
              w konsoli.
           2. Dodaj klasę Car z polem name typu String oraz konstruktorem,
              getterem, setterem i metodą toString().
              Stwórz HashSet z typem Car i dodaj dwa razy tą samą instancję dla 3 nazw
              aut: "Dodge", "Citroen", "Opel". Wyświetl rezultat w konsoli.
         */
