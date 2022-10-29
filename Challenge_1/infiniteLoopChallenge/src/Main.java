import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int number = 0;

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        for ( ; ; ){
            System.out.println("Podaj liczbę lub quit(zakończenie programu): ");
            String num = reader.readLine();

            String exit = "quit";

            if (exit.equalsIgnoreCase(num)){
                System.out.println("Wyszedłeś z programu");
                break;
            }

            number += Integer.parseInt(num);
            System.out.println("Aktualna liczba to: " + number);
        }


    }
}
