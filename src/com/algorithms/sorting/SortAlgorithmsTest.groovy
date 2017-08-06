package com.algorithms.sorting

import com.algorithms.AlgorithmsTest
import com.algorithms.DataSet
import com.algorithms.Result
import org.reflections.Reflections

class SortAlgorithmsTest extends AlgorithmsTest {

    static void main(String[] args) {


        SortAlgorithmsTest sortAlgorithmsTest = new SortAlgorithmsTest()

        ArrayList<DataSet> dataSets = sortAlgorithmsTest.prepareDataSets()

        for (DataSet dataSet : dataSets) {
            List<Result> results = []
            println "\nSorting start: ${dataSet.dataDescription}\n"

            Reflections r = new Reflections('com.algorithms')

            r.getSubTypesOf(Sort).each { sortClass ->
                Sort sortAlgorithm = Class.forName(sortClass.name).newInstance()

                sortAlgorithm.result.with {
                    name = sortAlgorithm.name
                }

                sortAlgorithm.result.time = sortAlgorithmsTest.executeAndCountTime {
                    sortAlgorithm.sort(dataSet.data.clone())
                }

                results << sortAlgorithm.result
            }

            sortAlgorithmsTest.showResult(results)
        }
    }

}

