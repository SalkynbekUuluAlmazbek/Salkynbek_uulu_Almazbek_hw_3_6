fun calculate(value1: Double, value2: Double, operator: Char): Double {
    return when (operator) {
        '+' -> value1 + value2
        '-' -> value1 - value2
        '*' -> value1 * value2
        '/' -> value1 / value2
        else -> throw IllegalArgumentException("Недопустимый математический знак")
    }
}

fun main(args: Array<String>) {
    val value1 = 8.0
    val value2 = 10.0
    val operator = '+'

    val result = calculate(value1, value2, operator)
    println("Результат: $result")
}

