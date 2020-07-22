import org.junit.Assert.assertEquals
import org.junit.Test

class FizzbuzzShould {
    @Test
    fun notDivisibleBy3Or5() {
        arrayOf(1,2,4).forEach {
            assertEquals(it.toString(), Fizzbuzz(it).fizzBuzz())
        }
    }
    @Test
    fun divisibleBy3() {
        arrayOf(3,6,12).forEach {
            assertEquals("Fizz", Fizzbuzz(it).fizzBuzz())
        }
    }
    @Test
    fun divisibleBy5() {
        arrayOf(5,10,20).forEach {
            assertEquals("Buzz", Fizzbuzz(it).fizzBuzz())
        }
    }
    @Test
    fun divisibleBy3And5() {
        arrayOf(15,30,60).forEach {
            assertEquals("FizzBuzz", Fizzbuzz(it).fizzBuzz())
        }
    }
    @Test
    fun fizzBuzz() {
        mapOf(1 to "1",2 to "2",4 to "4", 6 to "Fizz", 12 to "Fizz", 15 to "FizzBuzz", 30 to "FizzBuzz", 60 to "FizzBuzz").entries.forEach {
            assertEquals(it.value, Fizzbuzz(it.key).fizzBuzz())
        }
    }
}