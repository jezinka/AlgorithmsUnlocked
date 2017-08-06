package com.algorithms.sorting

/**
 * Created by jezinka on 08.07.16.
 */
class MergeSort extends Sort {

    ArrayList sortAlgorithm(ArrayList array) {
        return sort(array, 0, array.size() - 1)
    }

    ArrayList sort(ArrayList array, int p, int r) {

        if (p < r) {

            int q = (p + r) / 2
            sort(array, p, q)
            sort(array, q + 1, r)

            merge(array, p, q, r)

            result.loopCounter = loopCounter
        }
        return array
    }

    def merge(ArrayList array, int p, int q, int r) {

        int n1 = q - p + 1
        int n2 = r - q

        ArrayList listL = []
        ArrayList listR = []

        for (int i = 1; i <= n1; i++) {
            listL[i] = array[p + i - 1]
        }

        for (int j = 1; j <= n2; j++) {
            listR[j] = array[q + j]
        }

        listL[n1 + 1] = Integer.MAX_VALUE
        listR[n2 + 1] = Integer.MAX_VALUE

        int i = 1
        int j = 1

        for (int k = p; k <= r; k++) {
            if (listL[i] <= listR[j]) {
                array[k] = listL[i]
                i += 1
            } else {
                array[k] = listR[j]
                j += 1
            }
            loopCounter++
        }
    }

    static void main(String[] args) {
        Sort sort = new MergeSort()

        print sort.sortAlgorithm(defaultArray)
    }
}
