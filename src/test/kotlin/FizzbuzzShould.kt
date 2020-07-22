import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test

class FizzbuzzShould {
    @Test
    fun pass_simple_setup_test() {
        assertThat(true, equalTo(true))
    }
}