package com.lao.basicJavaLearnings.StaticKeyword;

public class StaticMethod {



    public static void static1(){
        System.out.println("Print the static main method");
    }
    public void nonStatic(){
        System.out.println("Print the non-static method");
        static1(); // but we can call the static method from the non-static block
    }

    public static void main(String[] args) {


        StaticMethod staticMethod = new StaticMethod();
        staticMethod.nonStatic();
//        static1(); we can call the static method without using object
//        nonStatic(); we can't call the non-static method without using object


    }


}
