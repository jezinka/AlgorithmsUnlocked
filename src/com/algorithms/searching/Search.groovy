package com.algorithms.searching

abstract class Search {

    Search() {
        this.vallidate()
    }

    abstract int search(ArrayList array, int n, int x)

    String search(ArrayList array, int x) {

        int answer = search(array, array.size(), x)
        if (answer == -1) {
            return "Item ${x} not found"
        }
        return "Item ${x} found on the ${answer} position"
    }

    def vallidate() {
        assert search([], 1, 1) == -1
        assert search([9], 1, 1) == -1
        assert search([1], 1, 1) == 0
        assert search([1, 2], 2, 2) == 1
        assert search([1, 2, 3], 3, 3) == 2
    }

}
