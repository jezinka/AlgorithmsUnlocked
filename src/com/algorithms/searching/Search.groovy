package com.algorithms.searching

abstract class Search {

    static final int NOT_FOUND = -1

    int loopCounter

    Search() {
        loopCounter = 0
    }

    abstract int search(ArrayList array, int n, int x)

    String getName() {
        String className = this.class.name
        return className[className.lastIndexOf('.') + 1..-1]
    }

    Map<String, Integer> search(ArrayList array, int x) {

        int answer = search(array, array.size(), x)

        return [loopCounter: loopCounter, answer: answer]
    }

    def validate() {
        assert search([], 1, 1) == NOT_FOUND
        assert search([9], 1, 1) == NOT_FOUND
        assert search([1], 1, 1) == 0
        assert search([1, 2], 2, 2) == 1
        assert search([1, 2, 3], 3, 3) == 2
    }

}
