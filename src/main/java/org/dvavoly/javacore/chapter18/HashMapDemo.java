package org.dvavoly.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a hash map
        Map<String, Double> hashMap = new HashMap<>();
        // Put elements to the map
        hashMap.put("John Doe", 3434.34);
        hashMap.put("Tom Smith", 123.22);
        hashMap.put("Jane Baker", 1378.00);
        hashMap.put("Tod Hall", 99.22);
        hashMap.put("Ralph Smith", -19.08);

        // Get the Set of the entries
        Set<Map.Entry<String, Double>> entries = hashMap.entrySet();
        // Display the Set
        for (var item : entries) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        // Deposit 1000 into John Doe account
        Double balance = hashMap.get("John Doe");
        hashMap.put("John Doe", balance + 1000);

        System.out.println("\nJohn Doe's new balance: " + hashMap.get("John Doe"));
    }
}
