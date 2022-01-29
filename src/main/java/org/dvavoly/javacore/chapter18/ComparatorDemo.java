package org.dvavoly.javacore.chapter18;

import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>((s1, s2) -> s2.compareTo(s1));

        // Add elements to the tree set
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("F");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("D");
        treeSet.add("G");

        // Display the elements.
        treeSet.forEach(s -> System.out.print(s + " "));
    }
}
