fun checkIfLeapYear(year: Int): Boolean {
    if(year % 100 == 0) { return false }
    if(year % 4 == 0) { return true }
    return false
}