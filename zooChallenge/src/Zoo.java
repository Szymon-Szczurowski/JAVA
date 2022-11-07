import java.util.ArrayList;
import java.util.Iterator;

public class Zoo <T extends Animal> {

    private ArrayList<T> animals;

    public Zoo() {
       animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void printAllAnimals(){
        Iterator<T> it = animals.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
