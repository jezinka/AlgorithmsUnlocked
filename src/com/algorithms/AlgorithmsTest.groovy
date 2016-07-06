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
        Map result = [:]

        start = System.currentTimeMillis()
        result << closure()
        end = System.currentTimeMillis()
        result << ['time': end - start]

        return result
    }
}