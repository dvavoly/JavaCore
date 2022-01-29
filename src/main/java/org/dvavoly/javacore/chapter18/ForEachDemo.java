package org.dvavoly.javacore.chapter18;

import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.print("Content of values: ");
        for (Integer item : list) {
            System.out.print(item + " ");
        }

        // Now, sum the values using a for-each loop
        int sum = 0;
        for (Integer item : list) {
            sum += item;
        }
        System.out.println("\nSum of all elements is: " + sum);
    }
}
