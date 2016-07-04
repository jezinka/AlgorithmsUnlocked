package com.algorithms.searching

import com.algorithms.AlgorithmsTest

class SearchAlgorithmsTest extends AlgorithmsTest {

    def prepareData() {
        println 'Preparing data:'

        def random = new Random()
        ArrayList<Integer> array = prepareDataArray()
        int x = array[random.nextInt(array.size())]

        println("${array.size()} items in array")

        return [array, x]
    }

    static void main(String[] args) {

        SearchAlgorithmsTest searchAlgorithmsTest = new SearchAlgorithmsTest()

        def (data, x) = searchAlgorithmsTest.prepareData()

        println 'Searching start:'
        searchAlgorithmsTest.executeAndCountTime { new LinearSearch().search(data, x) }
        searchAlgorithmsTest.executeAndCountTime { new BetterLinearSearch().search(data, x) }
        searchAlgorithmsTest.executeAndCountTime { new LinearWithSentinelSearch().search(data, x) }
        searchAlgorithmsTest.executeAndCountTime { new RecursiveLinearSearch().search(data, x) }
        searchAlgorithmsTest.executeAndCountTime { new BinarySearch().search(data, x) }
        searchAlgorithmsTest.executeAndCountTime { new RecursiveBinarySearch().search(data, x) }
    }
}