import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Formatowanie daty
// y - rok jako liczby np 2021                       1. Stwórz nowy obiekt Date
// M - miesiąc w roku np. Jan czy 01                 2. Utwórz instancję SimpleDateFormat dla:
// d - dzień np. 10                                     godziny:minut:sekund dnia.miesiąca.roku
// h - godzina (1-12)  np. 6                         3. Sformatuj datę używając SimpleDateFormat
// H - godzina (0-23)  np. 15                           wykorzystując metodę format()
// m - minuta np 45
// s - sekunda np 56
// S - milisekunda np 456
// E - dzień tygodnia np pon.
// D - dzień roku np 123
// w - numer tygodnia w roku np 3
// W - numer tygodnia w miesiącu np 2
// a - A.M. / P.M.   np PM
// z - time zone np Eastern Standard Time

        Date date = new Date();

        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss dd:MM:YYYY");
        System.out.println(s.format(date));


    }
}
