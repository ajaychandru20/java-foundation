package com.lao.basicJavaLearnings.ErrorHandeling;

public class SingleTryCatch {
    static int a = 5;
    static int b = 2;
    static int c = 0;

    public static void main(String[] args) {
        try {
            int divid = a / c;
            System.out.println(divid); // error throws and ArithmeticException

        } catch (Exception e) {
            // Code to handle the exception
            System.out.println(e);
        }

    }
}
