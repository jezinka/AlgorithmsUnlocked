package com.algorithms.searching

abstract class Search {

    static final int NOT_FOUND = -1

    int loopCounter

    Search() {
        this.validate()
    }

    abstract int search(ArrayList array, int n, int x)

    String getName() {
        String className = this.class.name
        return className[className.lastIndexOf('.') + 1..-1]
    }

    String search(ArrayList array, int x) {

        GString message = "\n${this.name}: \n"

        loopCounter = 0

        int answer = search(array, array.size(), x)
        if (answer == NOT_FOUND) {
            message += "Item ${x} not found"
        } else {
            message += "Item ${x} found on the ${answer} position"
        }
        return message + " -> $loopCounter steps"
    }

    def validate() {
        assert search([], 1, 1) == NOT_FOUND
        assert search([9], 1, 1) == NOT_FOUND
        assert search([1], 1, 1) == 0
        assert search([1, 2], 2, 2) == 1
        assert search([1, 2, 3], 3, 3) == 2
    }

}
