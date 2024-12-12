package com.lao.basicJavaLearnings.StaticKeyword;

public class StaticVariable {

    static int amountToPay = 0;
    String userName;

    public static void main(String[] args) {

        StaticVariable staticVariable1 = new StaticVariable();
        staticVariable1.amountToPay = 200;
        staticVariable1.userName = "Ajay";
        System.out.println(staticVariable1.amountToPay);
        System.out.println(staticVariable1.userName);

        StaticVariable staticVariable2 = new StaticVariable();
        staticVariable2.amountToPay = 300;
        staticVariable2.userName = "Akash";
        System.out.println(staticVariable1.amountToPay);
        System.out.println(staticVariable1.userName);
        System.out.println(staticVariable2.amountToPay);
        System.out.println(staticVariable2.userName);


    }



}
