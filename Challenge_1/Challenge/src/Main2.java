public class Main2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Robert";
        student.username = "Kowalski";
        student.city = "Los Angeles";
        student.age = 22;
        student.printBasicData();

        Student student2 = new Student();
        student2.printBasicData();

    }
}

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
