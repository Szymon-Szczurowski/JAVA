import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String names[] = {"Ania", "Ola", "Daniel", "Karol", "Kasia"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj numer indeksu (max numer indeksu: " + (names.length - 1) + " ):");
        String strNum = reader.readLine();
        int number = Integer.parseInt(strNum);

        System.out.println("Osoba z tym numerem dziennika to: " + names[number]);

//        String names[] = { "Ania", "Ola", "Daniel", "Karol", "Kasia" };
//
//        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
//
//        System.out.println("Podaj indeks w tablicy, max wartość: " + (names.length - 1) );
//        String strNum = reader.readLine();
//
//        int index = Integer.parseInt(strNum);
//
//        System.out.println("Indeks " + index + " w tablicy ma wartość " + names[index] );

    }
}
