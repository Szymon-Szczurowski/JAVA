package com.example.date;

import java.util.Calendar;
import java.util.Date;

public class DateInFutureAndPast {
    public static void main(String[] args) {
        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance();
        System.out.println(dateNow);

        calendar.setTime(dateNow);

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.YEAR, 1);
        calendar.add(Calendar.HOUR,1);
        calendar.add(Calendar.MINUTE, 10);
        calendar.add(Calendar.SECOND, 30);

        Date dateFututre = calendar.getTime();
        System.out.println(dateFututre);

        //////////////////////////////////

        calendar.setTime(dateNow);

        calendar.add(Calendar.DAY_OF_MONTH, -2);
        calendar.add(Calendar.MONTH, -2);
        calendar.add(Calendar.YEAR, -1);
        calendar.add(Calendar.HOUR,-1);
        calendar.add(Calendar.MINUTE, -10);
        calendar.add(Calendar.SECOND, -30);

        Date datePast = calendar.getTime();
        System.out.println(datePast);



    }
}
