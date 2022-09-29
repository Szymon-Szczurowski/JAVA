package com.example.data.types;

public class J10_arrays {
    public static void main(String[] args) {
        int numArr[] = new int[10];
        System.out.println("numArr[1]: " + numArr[1]);

        numArr[1] = 7;
        System.out.println("numArr[1]: " + numArr[1]
                + " numArr.length: " + numArr.length);

        float floatsArr[] = new float[5];
        floatsArr[0] = 1.0f;

        float floatsArr2[] = {10.1f, 123.78f, 78.0f, -99.9f};

        System.out.println("floatsArr2[1]: " + floatsArr2[1] + " floatsArr.length: " + floatsArr2.length);

        String strArr[] = new String[7];
        System.out.println("strArr[1]:" + strArr[1]);

        String namesArr[] = {"Ola", "Ania", "Karol"};
        System.out.println("namesArr[1]:" + namesArr[1]);


    }
}
