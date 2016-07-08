package com.algorithms

class AlgorithmsTest {

    int size = 200

    def prepareDataArray() {
        def random = new Random()
        ArrayList array = []

        while (array.size() < this.size) {
            int newItem = random.nextInt()

            if (!(newItem in array)) {
                array << newItem
            }
        }

        return array
    }

    def executeAndCountTime(Closure closure) {
        long start, end

        start = System.currentTimeMillis()
        closure()
        end = System.currentTimeMillis()
        return end - start
    }

    void showResult(List<Result> results) {

        int longestAlgorithmNameLength = results.collect { it.name.size() }.max()

        results.sort { it.loopCounter }.each { Result searchAlgorithmResult ->
            print searchAlgorithmResult.toString(longestAlgorithmNameLength)
        }
    }
}