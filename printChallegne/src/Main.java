import java.util.Date;

public class Main {
    public static void main(String[] args) {
                /*
        1. Stwórz obiekt Date
        2. Skorzystaj z printf do wyświetlenia roku (Y), miesiąca (m), dnia (d)
           korzystaj z tej samej instancji date np %1$tY aby nie powtarzać
		   niepotrzebnie date
     */


        Date date = new Date();

        System.out.printf("%n %1$tY %1$tm %1$td ", date);
    }
}
