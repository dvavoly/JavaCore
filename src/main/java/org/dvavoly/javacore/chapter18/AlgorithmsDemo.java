package org.dvavoly.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        // Create and initialize linked list.
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(-8);

        // Create a reverse order comparator
        Comparator<Integer> reverseOrder = Collections.reverseOrder();
        Collections.sort(linkedList, reverseOrder);

        System.out.println("List sorted in reverse: ");
        linkedList.forEach(i -> System.out.print(i + " "));

        // Shuffle list
        Collections.shuffle(linkedList);

        System.out.println("\nShuffle list:");
        linkedList.forEach(i -> System.out.print(i + " "));
        System.out.println("\nMaximum: " + Collections.max(linkedList));
        System.out.println("Minimum: " + Collections.min(linkedList));
    }
}
