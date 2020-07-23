import org.junit.Assert.assertEquals
import org.junit.Test

class LeapYearShould {
    @Test
    fun divisibleByFour() {
        assertEquals(true, checkIfLeapYear(2000))
        assertEquals(false, checkIfLeapYear(2001))
        assertEquals(true, checkIfLeapYear(2004))
    }
}