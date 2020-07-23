fun checkIfLeapYear(year: Int): Boolean {
    if(divisibleBy4(year)) { return !divisibleBy100(year) }
    return false
}

private fun divisibleBy4(year: Int): Boolean {
    if(year % 4 == 0) { return true }
    return false
}

private fun divisibleBy100(year: Int): Boolean {
    if(year % 100 == 0) { return true }
    return false
}