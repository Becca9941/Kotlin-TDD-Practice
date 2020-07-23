import org.junit.Assert.assertEquals
import org.junit.Test

class LeapYearShould {
    @Test
    fun divisibleByFour() {
        assertEquals(true, checkIfLeapYear(2000))
    }
}