package org.dvavoly.javacore.chapter18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        System.out.println("Initial size of array is: " + listOfString.size());
        // add elements to the array
        listOfString.add("C");
        listOfString.add("A");
        listOfString.add("E");
        listOfString.add("B");
        listOfString.add("D");
        listOfString.add("F");
        listOfString.add(1, "A2");

        System.out.println("Size of array after addition: " + listOfString.size());
        System.out.println("Contents of array: " + listOfString);

        // Remove elements from the array list
        listOfString.remove("F");
        listOfString.remove(2);
        System.out.println("Size of array after deletion: " + listOfString.size());
        System.out.println("Content of array: " + listOfString);
    }
}