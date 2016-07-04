package com.algorithms.searching

class LinearSearch extends Search {

    int search(ArrayList array, int n, int x) {
        int answer = NOT_FOUND
        for (int i = 0; i < n; i++) {

            loopCounter += 1

            if (array[i] == x) {
                answer = i
            }
        }
        return answer
    }
}




