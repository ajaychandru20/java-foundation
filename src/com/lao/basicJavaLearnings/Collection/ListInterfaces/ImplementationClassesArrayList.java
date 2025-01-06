package com.lao.basicJavaLearnings.Collection.ListInterfaces;

import java.util.ArrayList;
import java.util.List;

public class ImplementationClassesArrayList {

    public void arrayExamples() {
        List<String> luxuryCarNames = new ArrayList<String>();

        // 1. Add elements into list
        luxuryCarNames.add("BMW");
        luxuryCarNames.add("Audi");
        luxuryCarNames.add("Ferrari");
        System.out.println("Print array list using Generics<> : " + luxuryCarNames);

        // 2. Add elements into list using index
        luxuryCarNames.add(1, "Tata");
        System.out.println("Insert element using index position : " + luxuryCarNames);

        // 3. Get elements using index
        System.out.println("Get the element using index : " + luxuryCarNames.get(1));

        // 4. Get elements index using String name
        System.out.println("Get the element index using string : " + luxuryCarNames.indexOf("Tata"));

        // 5. Remove element using index
        luxuryCarNames.remove(2);
        System.out.println("List after removing element at index 2 : " + luxuryCarNames);

        // 6. Remove element using value
        luxuryCarNames.remove("Audi");
        System.out.println("List after removing 'Audi' : " + luxuryCarNames);

        // 7. Check if an element exists
        System.out.println("Does the list contain 'BMW'? : " + luxuryCarNames.contains("BMW"));

        // 8. Iterating over the list using for-each
        System.out.print("Iterating using for-each loop: ");
        for (String car : luxuryCarNames) {
            System.out.print(car + " ");
        }
        System.out.println();

        // 9. Iterating using a for loop
        System.out.print("Iterating using for loop: ");
        for (int i = 0; i < luxuryCarNames.size(); i++) {
            System.out.print(luxuryCarNames.get(i) + " ");
        }
        System.out.println();

        // 10. Get the size of the list
        System.out.println("Size of the list : " + luxuryCarNames.size());

        // 11. Clear all elements in the list
        luxuryCarNames.clear();
        System.out.println("List after clearing all elements : " + luxuryCarNames);

        // 12. Add all elements from another list
        List<String> newCarNames = new ArrayList<>();
        newCarNames.add("Mercedes");
        newCarNames.add("Porsche");

        luxuryCarNames.addAll(newCarNames);
        System.out.println("List after adding all elements from another list : " + luxuryCarNames);
    }

    public static void main(String[] args) {
        ImplementationClassesArrayList arrayListExp = new ImplementationClassesArrayList();
        arrayListExp.arrayExamples();
    }
}
