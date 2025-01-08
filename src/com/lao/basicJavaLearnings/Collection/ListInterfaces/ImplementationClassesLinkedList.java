package com.lao.basicJavaLearnings.Collection.ListInterfaces;

import java.util.LinkedList;

public class ImplementationClassesLinkedList {

    public void readLinkedList() {
        // 1. Declare and initialize a LinkedList
        LinkedList<String> luxuryCarNames = new LinkedList<>();
        luxuryCarNames.add("BMW");
        luxuryCarNames.add("Audi");
        luxuryCarNames.add("Ferrari");
        luxuryCarNames.add("Mercedes");
        luxuryCarNames.add("Porsche");

        // 2. Reading elements using a for loop
        System.out.println("Reading LinkedList using a for loop:");
        for (int i = 0; i < luxuryCarNames.size(); i++) {
            System.out.println("Element at index " + i + ": " + luxuryCarNames.get(i));
        }

        // 3. Reading elements using a for-each loop
        System.out.println("\nReading LinkedList using a for-each loop:");
        for (String car : luxuryCarNames) {
            System.out.println("Car: " + car);
        }

        // 4. Reading elements using an Iterator
        System.out.println("\nReading LinkedList using an Iterator:");
        java.util.Iterator<String> iterator = luxuryCarNames.iterator();
        while (iterator.hasNext()) {
            System.out.println("Car: " + iterator.next());
        }

        // 5. Reading elements using a while loop
        System.out.println("\nReading LinkedList using a while loop:");
        int index = 0;
        while (index < luxuryCarNames.size()) {
            System.out.println("Element at index " + index + ": " + luxuryCarNames.get(index));
            index++;
        }

        // 6. Using Stream API (Java 8+)
        System.out.println("\nReading LinkedList using Stream API:");
        luxuryCarNames.stream().forEach(car -> System.out.println("Car: " + car));
    }

    public static void main(String[] args) {
        ImplementationClassesLinkedList linkedListRead = new ImplementationClassesLinkedList();
        linkedListRead.readLinkedList();
    }
}
