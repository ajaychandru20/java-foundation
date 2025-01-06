package com.lao.basicJavaLearnings.Collection.ListInterfaces;

import java.util.Vector;

public class ImplementationClassesVector {
    public void vectorExamples() {
        // 1. Declare and initialize a Vector
        Vector<String> luxuryCarNames = new Vector<>();

        // 2. Add elements to the Vector
        luxuryCarNames.add("BMW");
        luxuryCarNames.add("Audi");
        luxuryCarNames.add("Ferrari");
        luxuryCarNames.add("Mercedes");
        luxuryCarNames.add("Porsche");

        System.out.println("Initial Vector: " + luxuryCarNames);

        // 3. Add an element at a specific index
        luxuryCarNames.add(2, "Lamborghini");
        System.out.println("After adding Lamborghini at index 2: " + luxuryCarNames);

        // 4. Access elements by index
        System.out.println("Element at index 3: " + luxuryCarNames.get(3));

        // 5. Remove an element by value
        luxuryCarNames.remove("Audi");
        System.out.println("After removing Audi: " + luxuryCarNames);

        // 6. Remove an element by index
        luxuryCarNames.remove(1);
        System.out.println("After removing element at index 1: " + luxuryCarNames);

        // 7. Check if the Vector contains an element
        System.out.println("Does the Vector contain BMW? " + luxuryCarNames.contains("BMW"));

        // 8. Iterate through the Vector using a for loop
        System.out.println("\nIterating using a for loop:");
        for (int i = 0; i < luxuryCarNames.size(); i++) {
            System.out.println("Car at index " + i + ": " + luxuryCarNames.get(i));
        }

        // 9. Iterate using a for-each loop
        System.out.println("\nIterating using a for-each loop:");
        for (String car : luxuryCarNames) {
            System.out.println("Car: " + car);
        }

        // 10. Use an Iterator to iterate through the Vector
        System.out.println("\nIterating using an Iterator:");
        java.util.Iterator<String> iterator = luxuryCarNames.iterator();
        while (iterator.hasNext()) {
            System.out.println("Car: " + iterator.next());
        }

        // 11. Use Stream API to process the Vector
        System.out.println("\nProcessing using Stream API:");
        luxuryCarNames.stream().forEach(car -> System.out.println("Car: " + car));

        // 12. Clear the Vector
        luxuryCarNames.clear();
        System.out.println("\nAfter clearing the Vector: " + luxuryCarNames);
    }

    public static void main(String[] args) {
        ImplementationClassesVector vectorExample = new ImplementationClassesVector();
        vectorExample.vectorExamples();
    }
}
