import org.junit.Assert.assertEquals
import org.junit.Test

class LeapYearShould {
    @Test
    fun divisibleByFour() {
        mapOf(2000 to true, 2001 to false, 2004 to true).entries.forEach {
            assertEquals(it.value, checkIfLeapYear(it.key))
        }
    }
}