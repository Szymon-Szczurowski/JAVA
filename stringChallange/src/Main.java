import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Podaj swoje imnę:");
        String name = reader.readLine();
        System.out.println("Podaj swoje miejsce zamieszkania:");
        String domicile = reader.readLine();

        String together = name + " mieszka w " + domicile;
        System.out.println(together);

        System.out.println("String ma " + together.length() + " znaków");
    }
}

//    BufferedReader reader = new BufferedReader(
//            new InputStreamReader(System.in)
//    );
//
//        System.out.println("Podaj swoje imię:");
//                String name = reader.readLine();
//                System.out.println("Twoje imię to: " + name);
//
//                // Zadanie:
//                // pobierz dodatkowo miejsce zamieszkania i zaprezentuj informację
//                // "imię" mieszka w "miasto"
//                // przypisz ten string do oddzielnej zmiennej
//                // na koniec zaprezentuj również ile znaków
//                // ma ten string
//
//                System.out.println("Podaj miejsce zamieszkania: ");
//                String city = reader.readLine();
//
//                String str = name + " mieszka w " + city;
//                System.out.println(str);
//
//                System.out.println("String ma " + str.length() + " znaków.");