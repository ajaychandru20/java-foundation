package com.lao.basicJavaLearnings.Polymorphism;

public class WayofTalk {

    // Overloading the methods, so it should have same name method and diff arguments
    public void startDay(String cleanBowl) {
        System.out.println("I have " + cleanBowl);
    }

    public void startDay(String brush, String bath) {
        System.out.println("I have " + brush + " and also " + bath);
    }

    public static void main(String[] args) {
        WayofTalk todayTask = new WayofTalk();
        todayTask.startDay("cleaned Bowl");
        todayTask.startDay("completed Brushing", "completed Bathing");
    }


}
