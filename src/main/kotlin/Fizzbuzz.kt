class Fizzbuzz(private val num: Int = 0) {

    fun result(): String {
       return divisibleBy3()
    }

    fun divisibleBy3(): String {
        if (num % 3 == 0) { return "Fizz" }
        return notDivisible()
    }

    fun notDivisibleBy3(): String {
        return num.toString()
    }

}

