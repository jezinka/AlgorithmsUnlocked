package com.algorithms.sorting

class QuickSort extends Sort {

    ArrayList sortAlgorithm(ArrayList<Integer> arrayList) {
        quickSort(arrayList, 0, arrayList.size() - 1)
        result.loopCounter = loopCounter
        return arrayList
    }

    void quickSort(ArrayList array, int p, int r) {
        if (p < r) {
            int q = partition(array, p, r)
            quickSort(array, p, q - 1)
            quickSort(array, q + 1, r)
        }
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
        Sort sort = new QuickSort()
        print sort.sortAlgorithm(defaultArray)
    }
}
