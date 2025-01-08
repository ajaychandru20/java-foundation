package com.lao.basicJavaLearnings.Collection.MapInterfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("one", "apple");
        hashMap.put("two", "banana");
        hashMap.put("three", "cherry");
        hashMap.put("one", "date"); // Duplicate key, value will be replaced
        hashMap.put(null, "elderberry"); // Null key allowed
        hashMap.put("four", null); // Null value allowed

        System.out.println("HashMap:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
