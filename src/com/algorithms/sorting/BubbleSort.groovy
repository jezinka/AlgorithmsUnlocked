package com.algorithms.sorting

class BubbleSort extends Sort {

    ArrayList sortAlgorithm(ArrayList<Integer> array) {
        int n = array.size()
        for (int i = 0; i <= n - 1; i++) {
            for (int j = n - 1; j >= (i + 1); j--) {
                if (array[j] < array[j - 1]) {
                    switchItemsInTable(array, j, j - 1)
                }
                loopCounter++
            }
        }

        result.loopCounter = loopCounter

        return array
    }

    static void main(String[] args) {
        Sort sort = new BubbleSort()

        print sort.sortAlgorithm(defaultArray)
    }
}
