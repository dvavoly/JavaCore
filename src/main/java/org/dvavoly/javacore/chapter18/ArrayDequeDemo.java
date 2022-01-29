package org.dvavoly.javacore.chapter18;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Create an array deque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Use an ArrayDeque like a stack
        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");

        System.out.println("Poping the stack: ");
        
        while (arrayDeque.peek() != null) {
            System.out.print(arrayDeque.pop() + " ");
        }

        System.out.println();
    }
}
