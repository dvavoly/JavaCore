package org.dvavoly.javacore.chapter18;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a hash set. Order insertion is not guaranteed
        // Set<String> hashSet = new HashSet<>();

        // The order which elements are stored in the data structure will be guaranteed
        Set<String> hashSet = new LinkedHashSet<>();

        // Add elements to the hash set
        hashSet.add("Beta");
        hashSet.add("Alpha");
        hashSet.add("Eta");
        hashSet.add("Gamma");
        hashSet.add("Epsilon");
        hashSet.add("Omega");

        System.out.println(hashSet);
    }
}
