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
    fun notDivisibleBy3() {
        assertEquals("1", Fizzbuzz(1).notDivisibleBy3())
        assertEquals("2", Fizzbuzz(2).notDivisibleBy3())
        assertEquals("4", Fizzbuzz(4).notDivisibleBy3())

    }
    @Test
    fun divisibleBy3() {
        assertEquals("Fizz", Fizzbuzz(3).divisibleBy3())
        assertEquals("Fizz", Fizzbuzz(6).divisibleBy3())
        assertEquals("Fizz", Fizzbuzz(12).divisibleBy3())
    }
}