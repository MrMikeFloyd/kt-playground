/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kt.playground

import java.time.Month
import kotlin.math.pow
import kotlin.random.Random

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    println(App().greeting)

    val areaOfRadiusFourCircle = calculateArea(4)
    println("Here's a number for you: $areaOfRadiusFourCircle")

    val month = Month.of(2)
    println("And a month from a number: $month")

    val mathStuff = MathStuff()
    for (i in 0..100) {
        val randomA = Random.nextInt(0, 100);
        val randomB = Random.nextInt(0, 100);
        val randomC = Random.nextInt(0, 100);

        println("$randomA, $randomB, and $randomC can form a valid triangle: " +
                "${mathStuff.hasPermutationWhichIsFormableTriangle(randomA, randomB, randomC)}")
    }

    for (i in 0..20) {
        val randomInt = Random.nextInt(2, 1000)
        println("Is the number $randomInt is a prime? ${mathStuff.isLikelyPrime(randomInt)}")
    }

    val randomNumbers = DoubleArray(10)
    for(idx in randomNumbers.indices) {
        randomNumbers[idx] = Random.nextDouble(0.0, 100.0)
    }
    randomNumbers.forEach { println(it) }
}

fun calculateArea(radius: Int): Double {
    return Math.PI * radius.toDouble().pow(2)
}
