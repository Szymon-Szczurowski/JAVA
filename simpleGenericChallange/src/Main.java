public class Main {
    public static void main(String[] args) {
        Square<Integer> square = new Square<>(10);
        System.out.println(square.getSurfaceArea());

        Square<Float> squareFloat = new Square<>(5.7f);
        System.out.println(squareFloat.getSurfaceArea());
    }
}

        /*
         1. Stwórz klasę generyczną Square która przyjmuje typ generyczny T rozszerzający
            klasę Number. Wewnątrz klasy musi być zawarta zmienna prywatna wall o typie T.
         2. Dodaj gettery i settery oraz konstruktor przyjmujący wall i ustawiający go w instancji.
         3. Zapisz w Square metodę zwracającą double o nazwie getSurfaceArea. Wewnątrz stwórz
            zmiennę typu double do której przypiszesz wynik wywołania doubleValue() na wall.
         4. W klasie Main stwórz instancję Square z typem Integer i przekaż wartość 10 do konstruktora.
            Pokaż w konsoli wynik wywołania metody getSurfaceArea()
         5. Dodaj kolejną instancję Square ale z typem Float i przekaż do konstruktora 5.7f,
            ponownie w konsoli pokaż wynik wywołania getSurfaceArea()
         */