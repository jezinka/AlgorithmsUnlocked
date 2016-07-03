package com.algorithms.searching

class BetterLinearSearch extends Search {

    int search(ArrayList array, int n, int x) {
        int answer = -1

        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                return i
            }
        }

        return answer
    }
}