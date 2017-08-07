package com.algorithms.sorting

class RandomizedQuickSort extends Sort {

    ArrayList sortAlgorithm(ArrayList<Integer> arrayList) {
        randomizedQuickSort(arrayList, 0, arrayList.size() - 1)
        result.loopCounter = loopCounter
        return arrayList
    }

    void randomizedQuickSort(ArrayList array, int p, int r) {
        if (p < r) {
            int q = randomizedPartition(array, p, r)
            randomizedQuickSort(array, p, q - 1)
            randomizedQuickSort(array, q + 1, r)
        }
    }

    int randomizedPartition(ArrayList array, int p, int r) {
        Random rnd = new Random()
        int i = rnd.nextInt((r - p) + 1) + p
        switchItemsInTable(array, r, i)
        return partition(array, p, r)
    }

    int partition(ArrayList<Integer> array, int p, int r) {
        int x = array[r]
        int i = p - 1

        for (int j = p; j <= r - 1; j++) {
            if (array[j] <= x) {
                i += 1
                switchItemsInTable(array, i, j)
                loopCounter += 1
            }
        }
        switchItemsInTable(array, i + 1, r)
        return i + 1
    }

    public static void main(String[] args) {
        Sort sort = new RandomizedQuickSort()
        print sort.sortAlgorithm(defaultArray)
    }
}
