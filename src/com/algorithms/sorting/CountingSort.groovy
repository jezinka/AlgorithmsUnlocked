package com.algorithms.sorting

class CountingSort extends Sort {

    ArrayList sortAlgorithm(ArrayList<Integer> arrayList) {
        return countingSort(arrayList, arrayList.max())
    }

    ArrayList<Integer> countingSort(ArrayList<Integer> array, int k) {
        ArrayList<Integer> brray = []
        ArrayList<Integer> crray = [0] * (k + 1)

        for (int j = 0; j < array.size(); j++) {
            crray[array[j]] += 1
            loopCounter += 1
        }

        for (int i = 1; i <= k; i++) {
            crray[i] += crray[i - 1]
            loopCounter += 1
        }

        for (int j = array.size() - 1; j >= 0; j--) {
            brray[crray[array[j]] - 1] = array[j]
            crray[array[j]] -= 1
            loopCounter += 1
        }
        result.loopCounter = loopCounter
        brray
    }

    public static void main(String[] args) {
        Sort sort = new CountingSort()
        print sort.sortAlgorithm([4, 1, 3, 2, 16, 9, 8, 10, 14, 8, 7])
    }
}
