package org.dvavoly.javacore.chapter18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

public class TreeMapDemoTest {
    @Test
    void givenTreeMap_whenOrdersEntiresByComparator_thanCorrect() {
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(1, "val");
        map.put(5, "val");
        map.put(2, "val");
        map.put(4, "val");
        map.put(3, "val");

        assertEquals("[5, 4, 3, 2, 1]", map.keySet().toString());
    }
}
