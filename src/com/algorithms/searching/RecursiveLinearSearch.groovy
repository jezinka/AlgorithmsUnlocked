package com.algorithms.searching

class RecursiveLinearSearch extends Search {

    int search(ArrayList array, int n, int x, int i = 0) {
        if (i > n) {
            return -1
        }

        if (array[i] == x) {
            return i
        }

        search(array, n, x, i + 1)
    }

}
