package kt.playground

import assertk.assertThat
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import kotlin.test.Test

class MathStuffTest {

    @Test
    fun should_find_valid_triangle() {
        val classUnderTest = MathStuff()
        assertThat(classUnderTest.hasPermutationWhichIsFormableTriangle(2, 2, 3)).isTrue()
    }

    @Test
    fun seven_is_a_prime() {
        val classUnderTest = MathStuff()
        assertThat(classUnderTest.isLikelyPrime(7)).isTrue()
    }

    @Test
    fun eight_is_not_a_prime() {
        val classUnderTest = MathStuff()
        assertThat(classUnderTest.isLikelyPrime(8)).isFalse()
    }

    @Test
    fun is_ordered_intArray_descending() {
        val classUnderTest = MathStuff()
        assertThat(classUnderTest.isOrderedIntArray(listOf(10, 10, 8, 7, 4, 4, 4, 2, 1, 0).toIntArray())).isTrue()
    }

    @Test
    fun is_not_ordered_intArray_descending() {
        val classUnderTest = MathStuff()
        assertThat(classUnderTest.isOrderedIntArray(listOf(10, 10, 8, 7, 5, 6, 4, 2, 1, 0).toIntArray())).isFalse()
    }

    @Test
    fun is_ordered_intArray_ascending() {
        val classUnderTest = MathStuff()
        assertThat(classUnderTest.isOrderedIntArray(listOf(10,100,101,102,102,104,10000,10000,1000001).toIntArray())).isTrue()
    }

    @Test
    fun is_not_ordered_intArray_ascending() {
        val classUnderTest = MathStuff()
        assertThat(classUnderTest.isOrderedIntArray(listOf(10,100,101,102,102,104,10000,999,1000001).toIntArray())).isFalse()
    }
}

