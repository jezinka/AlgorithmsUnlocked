package com.algorithms.searching

class BetterLinearSearch extends Search {

    int search(ArrayList array, int n, int x) {
        int answer = NOT_FOUND

        for (int i = 0; i < n; i++) {

            loopCounter += 1

            if (array[i] == x) {
                return i
            }
        }

        return answer
    }
}