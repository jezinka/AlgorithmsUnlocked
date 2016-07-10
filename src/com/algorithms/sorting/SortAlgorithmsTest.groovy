package com.algorithms.sorting

import com.algorithms.AlgorithmsTest
import com.algorithms.Result
import com.algorithms.searching.Search
import org.reflections.Reflections

class SortAlgorithmsTest extends AlgorithmsTest {

    static void main(String[] args) {

        List<Result> results = []

        SortAlgorithmsTest sortAlgorithmsTest = new SortAlgorithmsTest()

        ArrayList data = sortAlgorithmsTest.prepareDataArray()

        println '\nSorting start:\n'

        Reflections r = new Reflections('com.algorithms')

        r.getSubTypesOf(Sort).each { sortClass ->
            Sort sortAlgorithm = Class.forName(sortClass.name).newInstance()

            sortAlgorithm.result.with {
                name = sortAlgorithm.name
            }

            sortAlgorithm.result.time = sortAlgorithmsTest.executeAndCountTime { sortAlgorithm.sort(data.clone()) }

            results << sortAlgorithm.result
        }

        sortAlgorithmsTest.showResult(results)
    }
}