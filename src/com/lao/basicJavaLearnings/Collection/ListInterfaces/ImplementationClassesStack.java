package com.lao.basicJavaLearnings.Collection.ListInterfaces;

import java.util.Stack;

public class ImplementationClassesStack {
    /**
     * Stack -> child class of Vector
     * Follows LIFO (Last In First Out)
     */
    public void readStack() {

        //Create object
        Stack<String> stack= new Stack<String>();

        //To insert an element -> push()
        stack.push("A");
        stack.push("B");
        stack.push("C");

        //print and see the stack
        System.out.println("Stack elements :"+ stack);

        //delete an element-> pop()
        stack.pop();// LIFO, so the last inserted element will be deleted
        System.out.println("After popping an element : "+ stack);

        //to get the top element -> peek()
        System.out.println("Top Element :" +stack.peek());

        //search returns the offset value. Offset is the position counted from top
        System.out.println("Searching the element A :"+stack.search("A"));

        //if the element is not present then the value is -1
        System.out.println("Searching an element which is not present :"+ stack.search("x"));

        System.out.println("-------------------------------------------------------------------------------");

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
