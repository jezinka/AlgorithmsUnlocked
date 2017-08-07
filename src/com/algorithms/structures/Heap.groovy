package com.algorithms.structures

import com.algorithms.sorting.Sort

class Heap {

    ArrayList<Integer> heap = []

    Heap(ArrayList<Integer> array) {
        buildMaxHeap(array)
    }

    Integer getSize() {
        this.heap.size()
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
        int largest = i
        int l = left(i)
        int r = right(i)

        if (l <= heap.size() && heap[l] > heap[i]) {
            largest = l
        }

        if (r <= heap.size() && heap[r] > heap[largest]) {
            largest = r
        }

        if (largest != i) {
            Sort.switchItemsInTable(heap, i, largest)
            maxHeapify(largest)
        }
    }

    void buildMaxHeap(ArrayList<Integer> array) {
        this.heap = array
        for (int i = Math.floor(array.size() / 2); i >= 0; i--) {
            maxHeapify(i)
        }
    }

    void switchItems(int src, int dst) {
        int tmp = heap[src]
        heap[src] = heap[dst]
        heap[dst] = tmp
    }

    Integer pop() {
        heap.pop()
    }

    @Override
    String toString() {
        return heap.toString()
    }

    static void main(String[] args) {
        print new Heap([4, 1, 3, 2, 16, 9, 10, 14, 8, 7])
    }
}
