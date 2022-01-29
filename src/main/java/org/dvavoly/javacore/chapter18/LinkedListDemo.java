package org.dvavoly.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list.
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");

        linkedList.add(1, "A2");

        System.out.println("Original contents of the linked list: " + linkedList);
        linkedList.remove("F");
        linkedList.remove(2);

        System.out.println("Contents of linked list after deletion: " + linkedList);

        // Remove first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Linked list after deleting first and last elements: " + linkedList);

        // Get and set a value
        String value = linkedList.get(2);
        linkedList.set(2, value + " modified");

        System.out.println("Linked list after modification: " + linkedList);
    }
}
