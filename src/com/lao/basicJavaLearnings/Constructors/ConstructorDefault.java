package com.lao.basicJavaLearnings.Constructors;

public class ConstructorDefault {
    int amount;
    String whoCollect;
    // You see you can't see the constructor its a naked eye of us.

    public static void main(String[] args){

        ConstructorDefault constructorDefault = new ConstructorDefault();
        System.out.println(constructorDefault.whoCollect);

    }
}
