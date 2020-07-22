class Fizzbuzz(private val num: Int = 0) {

    fun fizzbuzz(): String {
       return divisibleBy3()
    }

    private fun divisibleBy3(): String {
        if (num % 3 == 0) { return "Fizz" }
        return notDivisible()
    }

    private fun notDivisible(): String {
        return num.toString()
    }

}

