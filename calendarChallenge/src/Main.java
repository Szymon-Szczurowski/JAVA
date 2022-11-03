import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
              /*
            1. Stwórz datę w przyszłości korzystając z Calendar,
               dodaj do aktualnej daty 10 lat, 3 dni, 10 godzin, 25 minut, 6 sekund
         */

        Date date = new Date();
        Calendar cal = Calendar.getInstance();

        System.out.println(date);

        cal.setTime(date);

        cal.add(Calendar.YEAR, 10);
        cal.add(Calendar.DAY_OF_MONTH, 3);
        cal.add(Calendar.HOUR, 10);
        cal.add(Calendar.MINUTE, 25);
        cal.add(Calendar.SECOND, 6);

        Date newDate = cal.getTime();
        System.out.println(newDate);

    }
}
