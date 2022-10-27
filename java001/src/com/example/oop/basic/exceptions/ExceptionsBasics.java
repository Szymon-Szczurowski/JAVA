package com.example.oop.basic.exceptions;

import java.lang.reflect.Array;

public class ExceptionsBasics {
    public static void main(String[] args) {

//        try {
//            int numArr[] = {0,1,2,3,4,5};
//            int a = numArr[12];
//        } catch (ArrayIndexOutOfBoundsException exception){
//            exception.printStackTrace();
//        }
//
//        System.out.println("Program continues");
//    }


//        try {
//            int numArr[] = {0,1,2,3,4,5};
//            int a = numArr[2];
//            int result = a / numArr[0];
//        } catch (ArrayIndexOutOfBoundsException exception){
//            exception.printStackTrace();
//        }catch (ArithmeticException e){
//           e.printStackTrace();
//        }
//
//        System.out.println("Program continues");
//    }


//        try {
//            int numArr[] = {0,1,2,3,4,5};
//            int a = numArr[2];
//            int result = a / numArr[0];
//        } catch (Exception exception){
//            exception.printStackTrace();
//        }
//
//        System.out.println("Program continues");
//    }

        try {
            int numArr[] = {0,1,2,3,4,5};
            int a = numArr[2];
            int result = a / numArr[0];
        } catch (Exception exception){
            exception.printStackTrace();
        }finally {
            System.out.println("finally code");
        }

        System.out.println("Program continues");
    }
}
