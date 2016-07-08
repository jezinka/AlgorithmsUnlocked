package com.algorithms

/**
 * Created by jezinka on 08.07.16.
 */
class Result {

    String name
    int loopCounter
    int time
    int answer
    int item

    @Override
    String toString(int longestAlgorithmNameLength) {
        StringBuffer buffer = new StringBuffer()
        if (this.name) {
            buffer << this.name.padRight(longestAlgorithmNameLength)
        }
        if (this.item && this.answer) {
            buffer << " -> Item ${this.item} ${this.answer == -1 ? 'not ' : ''}found "
        }
        if (this.loopCounter) {
            buffer << "-> ${this.loopCounter} steps"
        }
        if (this.time) {
            buffer << "-> ${this.time} miliseconds"
        }

        buffer << '\n'
        return buffer.toString()
    }
}
