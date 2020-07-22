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
        fun fizzbuzz(num: Int): String {
          return "1"
        }
        assertEquals("1", fizzbuzz(1))
    }
}