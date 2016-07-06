package com.algorithms.searching

class RecursiveBinarySearch extends Search {

    int search(ArrayList array, int r, int x, int p = 0) {

        ArrayList sortedArray = array.sort(false)

        if (p > r) {
            return NOT_FOUND
        }

        while (p <= r) {

            loopCounter += 1

            int q = Math.floor((p + r) / 2)

            if (sortedArray[q] == x) {
                return q
            }

            if (sortedArray[q] > x) {
                return search(sortedArray, q - 1, x, p)
            } else {
                return search(sortedArray, r, x, q + 1)
            }
        }
    }
}




