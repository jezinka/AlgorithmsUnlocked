package com.algorithms.searching

class LinearWithSentinelSearch extends Search {

    int search(ArrayList array, int n, int x) {

        int answer = NOT_FOUND

        if (!array) {
            return answer
        }

        int lastItem = array[n - 1]
        array[n] = x

        int i = 0

        while (array[i] != x) {
            loopCounter += 1
            i += 1
        }

        array[n] = lastItem

        if (i < n || array[n] == x) {
            answer = i
        }

        return answer
    }
}




