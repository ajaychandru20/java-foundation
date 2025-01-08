package com.lao.basicJavaLearnings.Collection.MapInterfaces;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("one", "apple");
        linkedHashMap.put("two", "banana");
        linkedHashMap.put("three", "cherry");
        linkedHashMap.put("one", "date"); // Duplicate key, value will be replaced
        linkedHashMap.put(null, "elderberry"); // Null key allowed
        linkedHashMap.put("four", null); // Null value allowed

        System.out.println("LinkedHashMap (Insertion Order):");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
