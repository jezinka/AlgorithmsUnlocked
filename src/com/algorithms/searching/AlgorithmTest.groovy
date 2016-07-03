package com.algorithms.searching

class AlgorithmTest {

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

    def prepareData() {
        println 'Preparing data:'

        def random = new Random()
        ArrayList<Integer> array = prepareDataArray()
        int x = array[random.nextInt(array.size())]

        println("${array.size()} items in array")

        return [array, x]
    }

    def executeAndCountTime(Closure closure) {
        long start, end

        start = System.currentTimeMillis()
        print closure()
        end = System.currentTimeMillis()
        println " -> ${end - start} miliseconds"
    }

    static void main(String[] args) {

        AlgorithmTest algorithmTest = new AlgorithmTest()

        def (data, x) = algorithmTest.prepareData()

        println 'Searching start:'
        algorithmTest.executeAndCountTime { new LinearSearch().search(data, x) }
        algorithmTest.executeAndCountTime { new BetterLinearSearch().search(data, x) }
        algorithmTest.executeAndCountTime { new LinearSearchWithSentinel().search(data, x) }
        algorithmTest.executeAndCountTime { new RecursiveLinearSearch().search(data, x) }
    }
}