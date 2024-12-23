package com.lao.basicJavaLearnings.TypesOfStrings;

public class Strings {

    // String is an immutable, in this concept we cover String literal, and new keyword String
    public static void main(String[] args) {
        // Initial string
        String str = " Hello World! ";
        System.out.println("Original String: \"" + str + "\"");

        // New Keyword String
        String newString = new String("New String"); //
        newString = "Change the newString";
        System.out.println(newString);

        // String Literal
        String literal = "String Literal";  // here you see when we create overloading name of string then its points to the new one
        literal = "Changed literal";
        System.out.println(literal);

        // Now we see what are the types of methods in Strings, there are 28 methods in strings
        // charAt(int index)
        System.out.println("Character at index 6: " + str.charAt(6));

        // compareTo(String anotherString)
        System.out.println("Comparing with 'Hello': " + str.trim().compareTo("Hello"));

        // concat(String str)
        String concatenated = str.concat("Java");
        System.out.println("After concatenation: \"" + concatenated + "\"");

        // contains(CharSequence s)
        System.out.println("Contains 'World': " + str.contains("World"));

        // endsWith(String suffix)
        System.out.println("Ends with '!': " + str.endsWith("!"));

        // equals(Object obj)
        System.out.println("Equals ' Hello World! ': " + str.equals(" Hello World! "));

        // equalsIgnoreCase(String anotherString)
        System.out.println("Equals ignoring case ' hello world! ': " + str.trim().equalsIgnoreCase("hello world!"));

        // indexOf(String str)
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // length()
        System.out.println("Length of the string: " + str.length());

        // replace(CharSequence target, CharSequence replacement)
        String replaced = str.replace("World", "Java");
        System.out.println("After replace: \"" + replaced + "\"");

        // split(String regex)
        String[] words = str.trim().split(" ");
        System.out.println("Split result:");
        for (String word : words) {
            System.out.println(word);
        }

        // substring(int beginIndex)
        System.out.println("Substring from index 1: \"" + str.substring(1) + "\"");

        // toLowerCase()
        System.out.println("Lowercase: \"" + str.toLowerCase() + "\"");

        // toUpperCase()
        System.out.println("Uppercase: \"" + str.toUpperCase() + "\"");

        // trim()
        System.out.println("After trim: \"" + str.trim() + "\"");


    }

}
