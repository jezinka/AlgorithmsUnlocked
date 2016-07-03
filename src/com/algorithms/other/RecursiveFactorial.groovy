package com.algorithms.other

class RecursiveFactorial {

    def factorial(int n) {
        n == 0 ? 1 : n * factorial(n - 1)
    }

    static void main(String[] args) {

        RecursiveFactorial recursiveFactorial = new RecursiveFactorial()

        assert recursiveFactorial.factorial(0) == 1
        assert recursiveFactorial.factorial(10) == 3628800

    }
}
