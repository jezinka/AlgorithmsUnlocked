package com.algorithms.searching

class BinarySearch extends Search {

    int search(ArrayList array, int n, int x) {

        array.sort(true)

        int p = 0
        int r = n
        while (p <= r) {

            loopCounter += 1

            int q = Math.floor((p + r) / 2)

            if (array[q] == x) {
                return q
            }

            if (array[q] > x) {
                r = q - 1
            } else {
                p = q + 1
            }
        }
        return NOT_FOUND
    }
}




