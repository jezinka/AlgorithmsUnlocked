package com.algorithms.searching

class RecursiveBinarySearch extends Search {

    int search(ArrayList array, int r, int x, int p = 0) {

        array.sort(true)

        if (p > r) {
            return NOT_FOUND
        }

        while (p <= r) {

            loopCounter += 1

            int q = Math.floor((p + r) / 2)

            if (array[q] == x) {
                return q
            }

            if (array[q] > x) {
                return search(array, q - 1, x, p)
            } else {
                return search(array, r, x, q + 1)
            }
        }
    }
}




