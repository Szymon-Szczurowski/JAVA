public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Romet", "2000");
        bike.printInfo();

        System.out.println();

        MotorBike motorbike = new MotorBike("Błyskawica","pottera");
        motorbike.printInfo();


    }
}


//	1. Dodaj dwie klasy klasy Bike i rozszerzającą ją klasę MotorBike
//            2. Klasa Bike ma publiczną zmienną brand typu String
//            Dodatkowo zapisz zmienną name z modyfikatorem protected typu String
//        Następnie dodaj prywatną zmienną String z modyfikatorem private
//	3. W Bike musi być też pusty konstruktor
//            4. Drugi konstruktor Bike przyjmuje brand, name i zapisuje te
//            wartości w instancji. Dodatkowo wpisz jako type "bike".
//            5. Bike musi mieć również metodę setType ustawiającą type
//            z przekazaną wartością type jako parametr
//            6. Na koniec klasy Bike dodaj metodę printInfo() prezentującą w konsoli brand, name i type
//            7. Klasa MotorBike rozszerza Bike.
//            8. MotorBike ma jeden konstruktor przyjmujący parametry brand i name przekazując je do
//            konstrkutora Bike. Dodatkowo wywołaj setType() przekazując wartość "MotorBike"
//            9. Klasa Motorbike posiada również metodę printInfo() pokazującą w konsoli tekst "MotorBike".
//            Dodatkowo wywołuje metodę printInfo() klasy Bike.
//            10. W klasie Main stwórz instancję Bike oraz MotorBike z dowolnymi danymi i wywołaj printInfo()
//            */
