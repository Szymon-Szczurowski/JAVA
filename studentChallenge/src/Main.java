class Student {
    String name;
    String surName;
    String City;
    int age;

    public Student(){
        this.name = "Robert";
        this.surName = "Harry";
        this.City = "San Francisco";
        this.age = 18;
    }

    public Student(String name, String surName, String City, int age) {
        this.name = name;
        this.surName = surName;
        this.City = City;
        this.age = age;
    }

    public void printBasicData() {
        System.out.println(this.name + " " + this.surName + " " + this.City + " " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {
                /*
            Stwórz klasę Student opisującą ucznia z następującymi zmiennymi:
            imię, nazwisko, miasto, wiek
            Dodaj do klasy dwa konstruktory:
            - pusty podstawiający domyślne wartości jak np Jan Kowalski
            - przyjmujący wszystkie powyższe dane
            Stwórz w klasie Student metodę printBasicData() pokazującą powyższe dane
            w konsoli.
            Na koniec utwórz dwóch studentów, jeden z użyciem pustego konstruktora,
            drugi z uzyciem konstruktora z przekazaniem danych studenta.
         */


        Student student1 = new Student("Karan", "Roger", "Warsaw", 21);
        student1.printBasicData();

        Student student2 = new Student("Anna", "Rosa", "Gdansk", 22);
        student2.printBasicData();

        Student student3 = new Student();
        student3.printBasicData();





    }
}
