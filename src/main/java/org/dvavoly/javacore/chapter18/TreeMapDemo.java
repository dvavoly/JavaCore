package org.dvavoly.javacore.chapter18;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Double> treeMap = new TreeMap<>();
        // Put elements to the map
        treeMap.put("John Doe", 3434.34);
        treeMap.put("Tom Smith", 123.22);
        treeMap.put("Jane Baker", 1378.00);
        treeMap.put("Tod Hall", 99.22);
        treeMap.put("Ralph Smith", -19.08);

        // Display the elements
        treeMap.forEach((k, v) -> System.out.println(k + " " + v));

        // Deposit 1000 into John Doe account
        Double balance = treeMap.get("John Doe");
        treeMap.put("John Doe", balance + 1000);

        System.out.println("\nJohn Doe's new balance: " + treeMap.get("John Doe"));

    }
}
