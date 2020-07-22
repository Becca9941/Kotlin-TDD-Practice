import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.Ignore

class FizzbuzzShould {
    @Ignore @Test
    fun pass_simple_setup_test() {
        assertThat(true, equalTo(true))
    }
    @Test
    fun notDivisibleBy3Or5() {
        assertEquals("1", Fizzbuzz(1).notDivisible())
        assertEquals("2", Fizzbuzz(2).notDivisible())
        assertEquals("4", Fizzbuzz(4).notDivisible())

    }
    @Test
    fun divisibleBy3() {
        assertEquals("Fizz", Fizzbuzz(3).divisibleBy3())
        assertEquals("Fizz", Fizzbuzz(6).divisibleBy3())
        assertEquals("Fizz", Fizzbuzz(12).divisibleBy3())
    }
    @Test
    fun divisibleBy5() {
        assertEquals("Buzz", Fizzbuzz(5).divisibleBy5())
        assertEquals("Buzz", Fizzbuzz(10).divisibleBy5())
        assertEquals("Buzz", Fizzbuzz(20).divisibleBy5())
    }
    @Test
    fun divisibleBy3And5() {
        assertEquals("FizzBuzz", Fizzbuzz(15).divisibleBy3And5())
        assertEquals("FizzBuzz", Fizzbuzz(30).divisibleBy3And5())
        assertEquals("FizzBuzz", Fizzbuzz(60).divisibleBy3And5())
    }
    @Test
    fun fizzBuzz() {
        assertEquals("1", Fizzbuzz(1).fizzBuzz())
        assertEquals("Fizz", Fizzbuzz(3).fizzBuzz())
        assertEquals("FizzBuzz", Fizzbuzz(15).fizzBuzz())
    }
}