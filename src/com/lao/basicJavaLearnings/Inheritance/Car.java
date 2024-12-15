package com.lao.basicJavaLearnings.Inheritance;

public class Car {
    public int wheel = 4;

    public void carBody(){
        System.out.println("The Car should have " + wheel + " wheels");
    }
    public void startEngine(){
        System.out.println("Now Engine started!!! Lets go");
    }
    public void carContolers(int controlers){
        System.out.println("The Car have " +controlers + " contolers in the driver side");
    }


}
