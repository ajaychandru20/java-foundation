package com.lao.basicJavaLearnings.Constructors;

public class ConstructorParameter extends ConstructorOverload {

    ConstructorParameter(String draw){
        super();
        System.out.println("Drawing a " + draw);
    }
    public static void main(String[] args){
        ConstructorParameter constructorParameter = new ConstructorParameter("circle");
    }
}
