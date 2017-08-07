package com.algorithms.sorting

import com.algorithms.structures.Heap

class HeapSort extends Sort {

    ArrayList sortAlgorithm(ArrayList<Integer> arrayList) {
        ArrayList sortedArray = []

        Heap heap = new Heap(arrayList)
        loopCounter = arrayList.size()

        for (int i = heap.size - 1; i >= 0; i--) {
            heap.switchItems(0, i)
            sortedArray.add(0, heap.pop())
            heap.maxHeapify(0)
            loopCounter += arrayList.size() / 2
        }

        result.loopCounter = loopCounter
        return sortedArray
    }

    public static void main(String[] args) {
        Sort sort = new HeapSort()

        print sort.sortAlgorithm([4, 1, 3, 2, 16, 9, 8, 10, 14, 8, 7])
    }
}
