class Fizzbuzz(private val num: Int = 0) {

    var result = ""

    fun divisibleBy3(): String {
        if (num % 3 == 0) { result += "Fizz" }
        return result
    }

    fun divisibleBy5(): String {
        if(num % 5 == 0) { result += "Buzz" }
        return result
    }

    fun divisibleBy3And5(): String {
        divisibleBy3()
        divisibleBy5()
        return result
    }

    fun notDivisible(): String {
        return num.toString()
    }

    fun fizzBuzz(): String {
        divisibleBy3And5()
        if(result != "") { return result }
        return notDivisible()
    }

}

