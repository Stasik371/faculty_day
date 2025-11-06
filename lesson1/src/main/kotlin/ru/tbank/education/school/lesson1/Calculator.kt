package ru.tbank.education.school.lesson1

import ru.tbank.education.school.lesson1.OperationType.*

/**
 * Метод для вычисления простых арифметических операций.
 */
fun calculate(a: Double, b: Double, operation: OperationType): Double? {
    var resultof: Double = 0.0
    when(operation){
        ADD -> resultof = a + b
        SUBTRACT -> resultof = a - b
        MULTIPLY -> resultof = a * b
        DIVIDE -> resultof = a / b
    }
    return resultof
}

/**
 * Функция вычисления выражения, представленного строкой
 * @return результат вычисления строки или null, если вычисление невозможно
 * @sample "5 * 2".calculate()
 */
@Suppress("ReturnCount")
fun String.calculate(): Double? {
    val resultArray = this.split(" ")
    if (resultArray.size != 3) {
        return (null)
    } else {
        var result2: Double = 0.0
        when (resultArray[1]) {
            "+" -> result2 = resultArray[0].toDouble() + resultArray[2].toDouble()
            "-" -> result2 = resultArray[0].toDouble() - resultArray[2].toDouble()
            "*" -> result2 = resultArray[0].toDouble() * resultArray[2].toDouble()
            "/" -> {
                if (resultArray[2].toDouble() != 0.0) {
                    result2 = resultArray[0].toDouble() / resultArray[2].toDouble()
                }
            }
        }
        return result2
    }
}
fun main(){
    println("5 + 2".calculate())
}