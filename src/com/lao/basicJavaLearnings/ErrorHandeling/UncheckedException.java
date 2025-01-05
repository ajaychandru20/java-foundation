package com.lao.basicJavaLearnings.ErrorHandeling;

public class UncheckedException {

    static int a = 5;
    static int b = 2;
    static int c = 0;

    public static void main(String[] args) {


        /**
         * This Unchecked exceptions are, shows the mistakes in the compiler after runs the file
         * These exceptions are checked at runtime and do not require explicit handling at compile time.
         * **/

        int divid = a/c;
        System.out.println(divid); // error throws and ArithmeticException



    }


}
