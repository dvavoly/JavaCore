package org.dvavoly.javacore.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Module_1_2Test {

    private final Module_1_2 module_1_2 = new Module_1_2();

    @Test
    void givenAnArrayAndANumber_expectTrue() {
        var array = new int[]{3, 8, 15, 17};
        assertArrayEquals(new int[]{1, 2}, module_1_2.findIndexesByNumber(array, 23));
    }

    @Test
    void givenAnArrayWithDuplicates_expectTrue() {
        var array = new int[]{4, 5, 6, 6, 8};
        assertTrue(module_1_2.duplicatesNumberFinder(array));
        assertTrue(module_1_2.duplicatesNumberFinderWithStream(array));
        assertTrue(module_1_2.duplicatesNumberFinderWithHashSet(array));
    }
    @Test
    void givenAnArrayWithoutDuplicates_expectFalse() {
        var array = new int[]{4, 5, 6, 7, 8};
        assertFalse(module_1_2.duplicatesNumberFinder(array));
    }
}