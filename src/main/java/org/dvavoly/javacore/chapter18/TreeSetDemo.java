package org.dvavoly.javacore.chapter18;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a tree set
        Set<String> treeSet = new TreeSet<>();
        // Adding elements
        treeSet.add("Java");
        treeSet.add("Spring");
        treeSet.add("GraalVM");
        treeSet.add("Hibernate");
        // Duplicates elements are not allowed
        treeSet.add("Hibernate");
        // By default, the elements will be stored in ascending order
        System.out.println(treeSet);
    }
}
