package com.algorithms.sorting

import com.algorithms.Result

/**
 * Created by jezinka on 08.07.16.
 */
abstract class Sort {

    int loopCounter
    Result result

    Sort() {
        loopCounter = 0
        result = new Result(testClass: this)
        result.name = this.name
    }

    abstract ArrayList sortAlgorithm(ArrayList<Integer> arrayList)

    Map sort(ArrayList array) {
        ArrayList sortedArray = sortAlgorithm(array)

        assert validate(sortedArray)
    }

    String getName() {
        String className = this.class.name
        return className[className.lastIndexOf('.') + 1..-1]
    }

    boolean validate(ArrayList array) {

        for (int i = 0; i < array.size() - 1; i++)
            if (array[i + 1] < array[i]) {
                return false
            }

        true
    }

    void switchItemsInTable(ArrayList array, int src, int dst) {
        int tmp = array[src]
        array[src] = array[dst]
        array[dst] = tmp
    }

    int findMinInTable(ArrayList array, int i, int n) {
        int lowest = i

        for (int j = (i + 1); j < n; j++) {
            if (array[j] < array[lowest]) {
                lowest = j
            }

            loopCounter += 1
        }
        lowest
    }
}
