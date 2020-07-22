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
    fun doNothingWhenNotDivisibleBy3Or5() {
        assertEquals("1", Fizzbuzz(1).fizzbuzz())
        assertEquals("2", Fizzbuzz(2).fizzbuzz())
        assertEquals("4", Fizzbuzz(4).fizzbuzz())

    }
    @Test
    fun fizzWhenDivisibleBy3() {
        assertEquals("Fizz", Fizzbuzz(3).fizzbuzz())
        assertEquals("Fizz", Fizzbuzz(6).fizzbuzz())
        assertEquals("Fizz", Fizzbuzz(12).fizzbuzz())
    }
}