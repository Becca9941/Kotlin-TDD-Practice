import org.junit.Assert.assertEquals
import org.junit.Test

class LeapYearShould {
    @Test
    fun beDivisibleByFour() {
        mapOf(2020 to true, 2001 to false, 2004 to true).entries.forEach {
            assertEquals(it.value, checkIfLeapYear(it.key))
        }
    }
    @Test
    fun andNotDivisibleBy100Except() {
        arrayOf(2100, 2200, 2300).forEach {
            assertEquals(false, checkIfLeapYear(it))
        }
    }
    @Test
    fun whenAlsoDivisibleBy400() {
        arrayOf(2000, 2400, 2800).forEach {
            assertEquals(true, checkIfLeapYear(it))
        }
    }
    @Test
    fun checkIfLeapYear() {
        arrayOf(2000, 2004, 2008, 2012, 2016, 2020, 2024,
                2028, 2032, 2036, 2040, 2044, 2048).forEach {
            assertEquals(true, checkIfLeapYear(it))
        }

        arrayOf(1700, 1800, 1900, 2100, 2200, 2300, 2001,
                2029, 2031, 2038, 2043, 2045, 2049).forEach {
            assertEquals(false, checkIfLeapYear(it))
        }

    }
}