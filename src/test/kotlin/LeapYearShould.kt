import org.junit.Assert.assertEquals
import org.junit.Test

class LeapYearShould {
    @Test
    fun divisibleByFour() {
        mapOf(2020 to true, 2001 to false, 2004 to true).entries.forEach {
            assertEquals(it.value, checkIfLeapYear(it.key))
        }
    }
    @Test
    fun divisibleBy100() {
        arrayOf(2100, 2200, 2300).forEach {
            assertEquals(false, checkIfLeapYear(it))
        }
    }
    @Test
    fun divisibleBy400() {
        assertEquals(true, checkIfLeapYear(2000))
    }
}