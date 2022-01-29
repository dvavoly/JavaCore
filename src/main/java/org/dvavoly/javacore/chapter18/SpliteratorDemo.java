package org.dvavoly.javacore.chapter18;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        // Create an array list for doubles
        List<Double> values = new ArrayList<>();

        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        values.add(4.0);
        values.add(5.0);

        // Use tryAdvance() to display content of valuse
        System.out.println("Contents of values:\n");
        Spliterator<Double> spliterator = values.spliterator();
        while (spliterator.tryAdvance(n -> System.out.println(n))) ;
        System.out.println();

        // Create new list contains square roots.
        spliterator = values.spliterator();
        List<Double> squareRootList = new ArrayList<>();
        while (spliterator.tryAdvance(n -> squareRootList.add(Math.sqrt(n))));

        // Use forEachRemaining() to display contents of square roots
        System.out.println("Contents of square roots:\n");
        spliterator = squareRootList.spliterator();
        spliterator.forEachRemaining(n -> System.out.println(n));
        System.out.println();
    }
}
