package com.lao.basicJavaLearnings.Collection.ListInterfaces;

import java.util.Stack;

public class ImplementationClassesStack {
    public void readStack() {
        // 1. Declare and initialize a Stack
        Stack<String> luxuryCarNames = new Stack<>();
        luxuryCarNames.push("BMW");
        luxuryCarNames.push("Audi");
        luxuryCarNames.push("Ferrari");
        luxuryCarNames.push("Mercedes");
        luxuryCarNames.push("Porsche");

        // 2. Reading elements using a for loop
        System.out.println("Reading Stack using a for loop:");
        for (int i = 0; i < luxuryCarNames.size(); i++) {
            System.out.println("Element at index " + i + ": " + luxuryCarNames.get(i));
        }

        // 3. Reading elements using a for-each loop
        System.out.println("\nReading Stack using a for-each loop:");
        for (String car : luxuryCarNames) {
            System.out.println("Car: " + car);
        }

        // 4. Reading elements using an Iterator
        System.out.println("\nReading Stack using an Iterator:");
        java.util.Iterator<String> iterator = luxuryCarNames.iterator();
        while (iterator.hasNext()) {
            System.out.println("Car: " + iterator.next());
        }

        // 5. Reading elements using a while loop and pop()
        System.out.println("\nReading Stack using pop() method:");
        while (!luxuryCarNames.isEmpty()) {
            System.out.println("Popped: " + luxuryCarNames.pop());
        }

        // Re-initialize the stack for further examples
        luxuryCarNames.push("BMW");
        luxuryCarNames.push("Audi");
        luxuryCarNames.push("Ferrari");
        luxuryCarNames.push("Mercedes");
        luxuryCarNames.push("Porsche");

        // 6. Using Stream API (Java 8+)
        System.out.println("\nReading Stack using Stream API:");
        luxuryCarNames.stream().forEach(car -> System.out.println("Car: " + car));
    }

    public static void main(String[] args) {
        ImplementationClassesStack stackRead = new ImplementationClassesStack();
        stackRead.readStack();
    }

}
