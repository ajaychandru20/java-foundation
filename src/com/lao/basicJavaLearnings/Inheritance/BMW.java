package com.lao.basicJavaLearnings.Inheritance;

public class BMW extends Car{ // is a relation: A->B Car is a parent of BMW, BMW is a child of Car.

    int howManyControlsBMW = 3;
    public static void main(String[] args) {
     BMW carOfBmw = new BMW();
     carOfBmw.carBody();
     carOfBmw.startEngine();
     carOfBmw.carContolers(carOfBmw.howManyControlsBMW);
    }
}
