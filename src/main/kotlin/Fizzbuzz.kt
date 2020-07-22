class Fizzbuzz(private val num: Int = 0) {

    private fun divisibleBy3(): String {
        if (num % 3 == 0) { return "Fizz" }
        return ""
    }

    private fun divisibleBy5(): String {
        if(num % 5 == 0) { return "Buzz" }
        return ""
    }

    private fun divisibleBy3And5(): String {
        return divisibleBy3() + divisibleBy5()
    }

    private fun notDivisible(): String {
        return num.toString()
    }

    fun fizzBuzz(): String {
        var result = divisibleBy3And5()
        if(result != "") { return result }
        return notDivisible()
    }

}