package com.example.lambda;

// interfejs funkcyjny
interface Addition{
    int add(int a, int b);
}

// interfejs funkcyjny z abstrakcją
interface MathOperation<T>{
    T operate (T a, T b);
}
public class LambdaBasics {

    public void test(Addition addition) {
        System.out.println(addition.add(100, 50));
    }

    public static void main(String[] args) {

        Addition addition = (int a, int b) -> a + b;

        {
            int result = addition.add(30, 5);
            System.out.println(result);

            int result2 = addition.add(2, 2);
            System.out.println(result2);

        }

        LambdaBasics lambdaBasics  = new LambdaBasics();

        {
            lambdaBasics.test(addition);
            lambdaBasics.test((a, b) -> a * 2 + b);
        }

        MathOperation<Float> addition2 = (a, b) -> a +b;

        {
            float result = addition2.operate(30.0f, 5.0f);
            System.out.println(result);
        }

        MathOperation<Integer> substracion = (a, b) -> a - b;

        {
            System.out.println(substracion.operate(20, 3));
        }

    }
}
