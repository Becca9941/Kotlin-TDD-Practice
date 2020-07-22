class Fizzbuzz(private val num: Int = 0) {

    fun divisibleBy3(): String {
        if (num % 3 == 0) { return "Fizz" }
        return divisibleBy5()
    }

    fun divisibleBy5(): String {
        if(num % 5 == 0) { return "Buzz" }
        return notDivisible()
    }

    fun divisibleBy3And5(): String {
        if( "${divisibleBy3()}${divisibleBy5()}" == "FizzBuzz") { return "FizzBuzz" }
        return divisibleBy3()
    }

    fun notDivisible(): String {
        return num.toString()
    }

    fun fizzBuzz(): String {
        return divisibleBy3And5()
    }

}

