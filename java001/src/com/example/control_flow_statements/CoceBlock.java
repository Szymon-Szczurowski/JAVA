package com.example.control_flow_statements;

public class CoceBlock {
    public static void main(String[] args) {

        int b = 12;
        int num = 100;
       {
            //long num = 1000; // powoduje bład: baraiable num is already defindes
           long num2 = 1000; // nie powoduje błędu
            int a = 5;
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            //System.out.println("c: " + c); //powoduje błąd, brak zmiennej o takiej nazwie
        }
        int c = 12;

        int a = 99; // brak konfliku nazw z zmienną a w bloku


        {
            int value = 9;
            {
                int test = 8;
                {
                    System.out.println(value +" "+ test);
                    System.out.println(a);
                }
            }
        }
    }
}
