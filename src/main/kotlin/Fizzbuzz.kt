fun fizzbuzz(num: Int): String {
    return divisibleBy3(num)
}

fun divisibleBy3(num: Int): String {
    if (num % 3 == 0) { return "Fizz" }
    return notDivisible(num)
}

fun notDivisible(num: Int): String {
    return num.toString()
}

