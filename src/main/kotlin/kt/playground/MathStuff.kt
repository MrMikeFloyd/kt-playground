package kt.playground

import com.marcinmoskala.math.permutations

class MathStuff {

    /**
     * We can assign function references as values, yay!
     */
    fun funtionalAssignment() {
        val function: (Int) -> Int
        function = { x -> x * x }
        print(function(5))
    }

    /**
     * Function call with lambda as argument - yay!
     */
    fun add(a: Int, b: Int): Int {
        return performIntCalculation(a, b) { x, y -> x + y }

    }

    /**
     * Performs operation on the passed in Ints of a and b.
     */
    private fun performIntCalculation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    /**
     * Performs mapFunction on every element of the passed in IntArray.
     */
    fun map(elements: IntArray, mapFunction: (Int) -> Int): IntArray {
        var resultsArray = IntArray(elements.size)
        for ((index, value) in elements.withIndex()) {
            resultsArray[index] = mapFunction(value)
        }
        return resultsArray
    }

    /**
     * For a given combination of 3 integers, evaluates if there is a combination
     * of the three that allows constructing a triangle (that is, the sum
     * of two of the numbers being larger than the third)
     */
    fun hasPermutationWhichIsFormableTriangle(a: Int, b: Int, c: Int): Boolean {
        return listOf(a, b, c).permutations().any { it[0] + it[1] > it[2] }
    }

    fun isLikelyPrime(number: Int): Boolean {
        for (i in number - 1 downTo 2 step 1) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }

    fun isOrderedIntArray(intArray: IntArray): Boolean {
        return isOrderedIntArrayAscending(intArray) || isOrderedIntArrayDescending(intArray)
    }

    private fun isOrderedIntArrayAscending(intArray: IntArray): Boolean {
        for ((index, value) in intArray.withIndex()) {
            if (index == 0) continue
            if (value > intArray[index - 1]) {
                return false
            }
        }
        return true
    }

    private fun isOrderedIntArrayDescending(intArray: IntArray): Boolean {
        for ((index, value) in intArray.withIndex()) {
            if (index == 0) continue
            if (value < intArray[index - 1]) {
                return false
            }
        }
        return true
    }
}
