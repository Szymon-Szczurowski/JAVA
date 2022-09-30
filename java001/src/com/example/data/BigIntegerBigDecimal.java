package com.example.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("12312412442341212343243242342343412");
        bigInt = bigInt.add(new BigInteger("1234234324234235423"));
        System.out.println("Wynik: " + bigInt);

        BigDecimal decimal = new BigDecimal("23.134123213123123123124342343342");
        decimal = decimal.pow(3);
        System.out.println(decimal);
        System.out.println(decimal.toString());
    }
}
