public class Main {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo();
        zoo.addAnimal(new Lion("Lew", 20));
        zoo.addAnimal(new Tiger("Kotek", 10));

        zoo.printAllAnimals();


    }
}


        /*
    1. Stwórz klasę Animal z polami protected String name oraz int age, dodaj konstruktor
       ustawiający te wartości, gettery, settery i toString();
    2. Dodaj dwie klasy rozszerzające klasę Animal czyli Lion i Tiger z konstruktorami
       przyjmującymi name i age.
    3. Stwórz klasę Zoo z typem generycznym który rozszerza animal. Wewnątrz zapisz prywatną
       zmienną animals typu ArrayList przechowującą elementy Animal. Dodaj pusty konstruktor
       wewnątrz którego będzie tworzona nowa instancja animals.
    4. W klasie Zoo zapisz metodę addAnimal przyjmującą zmienną typu generycznego o nazwie animal.
       Parametr ten będzie dodany do animals.
    5. Stwórz w klasie Zoo metodę printAllAnimals która wyświetli w konsoli wszystkie zwierzęta z zoo.
    6. W main stwórz instancję Zoo i następnie dodaj kilka zwierząt do zoo.
       Na koniec wyświetl zwierzęta w konsoli dzięki metodzie printAllAnimals()
 */