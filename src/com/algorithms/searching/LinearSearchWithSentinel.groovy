package com.algorithms.searching

class LinearSearchWithSentinel extends Search {

    int search(ArrayList array, int n, int x) {

        int answer = -1
        int lastItem = array[n - 1]
        array[n] = x

        int i = 0

        while (array[i] != x) {
            i += 1
        }

        array[n] = lastItem

        if (i < n || array[n] == x) {
            answer = i
        }

        return answer
    }
}




