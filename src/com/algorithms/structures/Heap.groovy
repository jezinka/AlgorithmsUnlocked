package com.algorithms.structures

import com.algorithms.sorting.Sort

class Heap {

    ArrayList<Integer> heap = []

    Heap(ArrayList<Integer> array) {
        buildMaxHeap(array)
    }

    Integer parent(int i) {
        Math.floor(i / 2)
    }

    Integer left(int i) {
        2 * i + 1
    }

    Integer right(int i) {
        2 * i + 2
    }

    void maxHeapify(int i) {
        int largest
        int l = left(i)
        int r = right(i)

        if (l <= heap.size() && heap[l] > heap[i]) {
            largest = l
        } else {
            largest = i
        }

        if (r <= heap.size() && heap[r] > heap[largest]) {
            largest = r
        }

        if (largest != i) {
            Sort.switchItemsInTable(heap, i, largest)
            maxHeapify(largest)
        }
    }

    @Override
    String toString() {
        return heap.toString()
    }

    void buildMaxHeap(ArrayList<Integer> array) {
        this.heap = array
        for (int i = Math.floor(array.size() / 2); i >= 0; i--) {
            maxHeapify(i)
        }
    }

    static void main(String[] args) {
        print new Heap([4, 1, 3, 2, 16, 9, 10, 14, 8, 7])
    }
}
