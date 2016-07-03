package com.algorithms.searching

class LinearSearch extends Search {

    int search(ArrayList array, int n, int x) {
        int answer = -1
        for (int i = 0; i < n; i++) {

            if (array[i] == x) {
                answer = i
            }
        }
        return answer
    }
}




