package ru.tbank.education.school.lesson1

/**
 * Метод для вычисления простых арифметических операций.
 */
fun calculate(a: Double, b: Double, operation: OperationType = OperationType.ADD): Double? {
    return when (operation){
        OperationType.ADD -> a + b
        OperationType.SUBTRACT -> a - b
        OperationType.MULTIPLY -> a * b
        else -> if (b == 0.0) null else a / b
        }

}





/**
 * Функция вычисления выражения, представленного строкой
 * @return результат вычисления строки или null, если вычисление невозможно
 * @sample "5 * 2".calculate()
 */
@Suppress("ReturnCount")
fun String.calculate(): Double? {
    val a = this.split(" ")[0].toDouble()
    val b = this.split(" ")[2].toDouble()
    val operation = this.split(" ")[1]
    return when (operation) {
        "+" -> calculate(a, b, OperationType.ADD)
        "-" -> calculate(a, b, OperationType.SUBTRACT)
        "/" -> calculate(a, b, OperationType.DIVIDE)
        "*" -> calculate(a, b, OperationType.MULTIPLY)
        else -> null
    }

}


fun main(){
    println("5 * 2".calculate())
}

