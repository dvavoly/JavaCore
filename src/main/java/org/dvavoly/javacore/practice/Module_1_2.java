package org.dvavoly.javacore.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Module_1_2 {
    /**
     * Задание 1
     * Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива,
     * значения которых в сумме дают число переданное в массив.
     * Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
     * Один и тот же элемент не может быть использован дважды.
     * <p>
     * array = [3, 8, 15, 17], Number = 23
     * result = [1,2]
     * <p>
     * Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23
     */

    public int[] findIndexesByNumber(int[] array, int number) {
        int[] result = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            int searchNumber = number - array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] == searchNumber) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * Задание 2
     * Дан массив целых чисел.
     * Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты
     * <p>
     * Пример:
     * Array: [4,5,6,6,8]
     * Result: true
     * Число 6 повторяется 2 раза
     * <p>
     * Array: [4,5,6,7,8]
     * Result: false
     * Дубликатов нет
     */

    public boolean duplicatesNumberFinder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean duplicatesNumberFinderWithHashSet(int[] array) {
        Set<Integer> tempSet = new HashSet<Integer>();
        Arrays.stream(array).forEach(tempSet::add);
        return !(array.length == tempSet.size());
    }

    public  boolean duplicatesNumberFinderWithStream(int[] array) {
        int[] tempArray = Arrays.stream(array).distinct().toArray();
        return !(array.length == tempArray.length);
    }
}
