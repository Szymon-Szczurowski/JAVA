import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

                /*
            1. Stwórz instancję LocalDateTime i wywołaj now() aby otrzymać aktualną datę i czas
            2. Zrób kolejną instancję i wywołaj of() aby przekazać dowolną datę i czas z przyszłości
            3. Wywołaj isAfter na drugiej instancji względem aktualnego czasu i jesli zwróci
               true pokaż tekst w konsoli opisujący że data jest z przyszłości
         */

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2023, 11, 2, 13, 30, 4);

        if (localDateTime2.isAfter(localDateTime)){
            System.out.println("good");
        }
    }
}
