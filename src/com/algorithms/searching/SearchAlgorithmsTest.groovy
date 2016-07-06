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

        println "Searching item on position ${data.indexOf(x)}"
        List<Map> scoreCard = []

        println '\nSearching start:\n'
        Reflections r = new Reflections('com.algorithms')

        r.getSubTypesOf(Search).each { searchClass ->
            Search searchAlgorithm = Class.forName(searchClass.name).newInstance()
            Map scoreCardItem = ['name': searchAlgorithm.name, 'item': x]

            scoreCardItem << searchAlgorithmsTest.executeAndCountTime { searchAlgorithm.search(data, x) }

            scoreCard << scoreCardItem
        }

        searchAlgorithmsTest.showResult(scoreCard)
    }

    List<Map> showResult(List scoreCard) {

        int longestAlgorithmNameLength = scoreCard.collect { it.name.size() }.max()

        scoreCard.sort { it.loopCounter }.each { searchAlgorithmResult ->
            print searchAlgorithmResult.name.padRight(longestAlgorithmNameLength)
            print " -> Item ${searchAlgorithmResult.item} ${searchAlgorithmResult.answer == -1 ? 'not ' : ''}found "
            print "-> ${searchAlgorithmResult.loopCounter} steps"
            println "-> ${searchAlgorithmResult.time} miliseconds"
        }
    }
}