import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        float deposit = 1000.00f;
        float numDays = 180f;
        float interestRate = 0.06f;
        final float daysInYear = 365;
        float tax = 0.19f;

                /*
         6000 (wpłacona kwota) x 180 (półroczny okres lokaty)
         x 0,03 (oprocentowanie lokaty) / 365 (liczba dni w roku) = 88,77 zł

            wzór na obliczenie zysku z lokaty
            odsetki = depozyt x ilośćDni * oprocentowanie / ilośćDniWRoku

            podatek = odsetki * podatek;

            zysk = odsetki - podatek;
         */


        float interest = (deposit * numDays * interestRate) / daysInYear;
        float taxValue = interest * tax;
        float profit = interest - taxValue;

        System.out.println("profit: " + profit);

    }


}
