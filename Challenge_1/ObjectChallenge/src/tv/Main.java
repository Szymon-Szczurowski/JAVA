package tv;

public class Main {
    public static void main(String[] args) {

        Tv lg = new Tv();
        lg.manufacturer = "Lg";
        lg.model = "HDFUF";
        lg.year = 2000;
        lg.printBasicData();

    }
}
        /*
            Stwórz klasę Tv opisującą telewizor wraz z zmiennymi jak:
            producent, model, rok produkcji i dodatkowe, które będą
            pasowały do tego produktu.
            Dodaj jedną metodę printBasicData() prezentującą w konsoli te trzy
            powyższe wartości przechowywane w instancji klasy.
            Na koniec dodaj instancję do głównego programu i wartości do
            podstawowych pól oraz wywołaj metodę printBasicData()
        */