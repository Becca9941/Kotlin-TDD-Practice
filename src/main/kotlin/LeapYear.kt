fun checkIfLeapYear(year: Int): Boolean {
    if(divisibleBy4(year) && !divisibleBy100(year) ||
       divisibleBy100(year) && divisibleBy400(year)) { return true }
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

private fun divisibleBy400(year: Int): Boolean {
    if(year % 400 == 0) { return true }
    return false
}