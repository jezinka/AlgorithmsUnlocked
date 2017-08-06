package com.algorithms.sorting

/**
 * Created by jezinka on 08.07.16.
 */
class SelectionSort extends Sort {

    ArrayList sortAlgorithm(ArrayList array) {

        int lowest

        for (int i = 0; i < array.size() - 1; i++) {
            lowest = findMinInTable(array, i, array.size())

            switchItemsInTable(array, i, lowest)

            loopCounter++
        }

        result.loopCounter = loopCounter

        return array
    }

    static void main(String[] args) {
        Sort sort = new SelectionSort()

        print sort.sortAlgorithm(defaultArray)
    }
}
