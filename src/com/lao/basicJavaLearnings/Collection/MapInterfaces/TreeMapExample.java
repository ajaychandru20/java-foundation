package com.lao.basicJavaLearnings.Collection.MapInterfaces;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("one", "apple");
        treeMap.put("two", "banana");
        treeMap.put("three", "cherry");
        treeMap.put("one", "date"); // Duplicate key, value will be replaced
        // treeMap.put(null, "elderberry"); // Null key NOT allowed, will throw NullPointerException
        treeMap.put("four", null); // Null value allowed

        System.out.println("TreeMap (Sorted Order):");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}