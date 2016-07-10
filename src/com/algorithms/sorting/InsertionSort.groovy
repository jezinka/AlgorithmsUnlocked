package com.algorithms.sorting

/**
 * Created by jezinka on 08.07.16.
 */
class InsertionSort extends Sort {

    ArrayList sort(ArrayList array, int n) {

        for (int i = 1; i < n; i++) {
            int key = array[i]
            int j = i - 1

            loopCounter++

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]
                j--
                loopCounter++
            }
            array[j + 1] = key

        }

        result.loopCounter = loopCounter

        return array
    }
}
