package chief;

public class Main_1 {
    public static void main(String[] args) {
        /*
            Napisz program sprawdzający całkowitą liczbę
            i prezentujący informację czy jest ona:
            dodatnia, ujemna lub o wartości zero.
            Wykorzystaj bloki kodu z:
             if
             else if
             else
         */

        int number = 0;

        if (number == 0) {
            System.out.println("Liczba równa zero");
        } else if (number > 0) {
            System.out.println("Liczba dodatnia");
        } else {
            System.out.println("Liczba ujemna");
        }

        System.out.println("Koniec programu");
    }
}
