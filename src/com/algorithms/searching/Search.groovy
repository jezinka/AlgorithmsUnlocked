package com.algorithms.searching

import com.algorithms.Result

abstract class Search {

    static final int NOT_FOUND = -1

    int loopCounter
    Result result

    Search() {
        loopCounter = 0
        result = new Result()
    }

    abstract int search(ArrayList array, int n, int x)

    String getName() {
        String className = this.class.name
        return className[className.lastIndexOf('.') + 1..-1]
    }

    void search(ArrayList array, int x) {

        int answer = search(array, array.size(), x)

        result.loopCounter = loopCounter
        result.answer = answer
    }

    def validate() {
        assert search([], 1, 1) == NOT_FOUND
        assert search([9], 1, 1) == NOT_FOUND
        assert search([1], 1, 1) == 0
        assert search([1, 2], 2, 2) == 1
        assert search([1, 2, 3], 3, 3) == 2
    }

}
