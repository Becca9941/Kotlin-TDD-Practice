fun checkIfLeapYear(year: Int): Boolean {
    if(!divisibleBy100(year)) { return divisibleBy4(year) }
    return divisibleBy400(year)
}

private fun divisibleBy4(year: Int): Boolean {
    return year % 4 == 0
}

private fun divisibleBy100(year: Int): Boolean {
    return year % 100 == 0
}

private fun divisibleBy400(year: Int): Boolean {
    return year % 400 == 0
}