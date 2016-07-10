package com.algorithms.sorting

/**
 * Created by jezinka on 08.07.16.
 */
class SelectionSort extends Sort {

    ArrayList sort(ArrayList array, int n) {

        int lowest

        for (int i = 0; i < n - 1; i++) {
            lowest = findMinInTable(array, i, n)

            switchItemsInTable(array, i, lowest)

            loopCounter++
        }

        result.loopCounter = loopCounter

        return array
    }
}
