package com.algorithms.searching

import com.algorithms.AlgorithmsTest
import org.reflections.Reflections

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
        Reflections r = new Reflections('com.algorithms')

        r.getSubTypesOf(Search).each { searchClass ->
            def searchAlgorithm = Class.forName(searchClass.name).newInstance()
            searchAlgorithmsTest.executeAndCountTime { searchAlgorithm.search(data, x) }
        }
    }
}