package com.algorithms

import com.algorithms.searching.Search

/**
 * Created by jezinka on 08.07.16.
 */
class Result {

    def testClass

    String name
    int loopCounter
    int time
    int answer
    int item

    @Override
    String toString(int longestAlgorithmNameLength) {
        StringBuffer buffer = new StringBuffer()

        buffer << this.name.padRight(longestAlgorithmNameLength)

        if (testClass instanceof Search) {
            buffer << " -> Item ${this.item} ${this.answer == -1 ? 'not ' : ''}found "
        }

        buffer << "-> ${this.loopCounter} steps"
        buffer << "-> ${this.time} miliseconds"

        buffer << '\n'
        return buffer.toString()
    }
}
