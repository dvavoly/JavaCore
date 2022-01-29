package org.dvavoly.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // Create an array list
        List<String> list = new ArrayList<>();
        // Add elements to the array list
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");
        list.add("G");
        list.add("H");

        // Use iterator to display content
        System.out.println("Original content of array list:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modify objects being iterated
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        }

        System.out.println("Modified content of array list: ");

        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Now, display the list backwards
        System.out.println("Modified list backwards:");

        while (listIterator.hasPrevious()) {
            String previousElement = listIterator.previous();
            System.out.print(previousElement + " ");
        }

        System.out.println();
    }
}
