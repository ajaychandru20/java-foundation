package com.lao.basicJavaLearnings.Polymorphism;

public class Son extends Parent {

    public void sonName() {
        System.out.println("Hi dad my name is vicky");
    }

    public void sonAge() {
        System.out.println("Hi dad my age is 23");
    }

    // Overriding the method, so it should become in inheritance, relation concepts
    @Override
    public void buyNewHome() {
        System.out.println("No Dad, will skip this plan now!,  called from son file");
    }

    public static void main(String[] args) {
        Parent parent = new Son(); // Parent: Base Class , Son: Derived Class
        parent.buyNewHome();
    }
}
