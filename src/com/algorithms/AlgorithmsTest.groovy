package com.algorithms

class AlgorithmsTest {

    int size = 200

    ArrayList prepareDataArray() {
        def random = new Random()
        ArrayList array = []

        while (array.size() < this.size) {
            int newItem = random.nextInt(size * 5)

            if (!(newItem in array)) {
                array << newItem
            }
        }

        return array
    }

    ArrayList<DataSet> prepareDataSets() {
        ArrayList<DataSet> dataSets = []

        DataSet randomDs = new DataSet()
        randomDs.dataDescription = "Random data"
        randomDs.data = prepareDataArray()
        dataSets.add(randomDs)

        DataSet sortedDs = new DataSet()
        sortedDs.dataDescription = "Sorted data"
        sortedDs.data = prepareDataArray().sort()
        dataSets.add(sortedDs)

        DataSet reverseDs = new DataSet()
        reverseDs.dataDescription = "Reverse sorted data"
        reverseDs.data = prepareDataArray().sort().reverse()
        dataSets.add(reverseDs)
        dataSets


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

class DataSet {
    ArrayList data
    String dataDescription
}