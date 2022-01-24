package org.dvavoly.javacore.chapter18;

import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(1, 2, 3, 4);
        System.out.println("Content of array: " + listOfIntegers);

        // Get the array
        Integer[] arrayOfIntegers = new Integer[listOfIntegers.size()];

        arrayOfIntegers = listOfIntegers.toArray(arrayOfIntegers);

        int sum = Arrays.stream(arrayOfIntegers).mapToInt(Integer::valueOf).sum();
        System.out.println("Sum is: " + sum);
    }
}
