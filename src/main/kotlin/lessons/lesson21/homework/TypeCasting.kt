package lessons.lesson21.homework
//Задача 1
//
//Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна
//определить тип аргумента и вывести соответствующее сообщение:
//
//Для строки: "Это строка: [значение]".
//Для любого числа: "Это число: [значение]".
//Для списка: "Это список, количество элементов: [количество]".
//Для словаря: "Это словарь, количество пар: [количество]".
//Для остальных типов: "Неизвестный тип данных".
//Используйте оператор is для проверки типов.

fun main() {
    fun analyzeDataType(incomingData: Any) {
        when (incomingData) {
            is String -> println("Это строка: $incomingData.")
            is Number -> println("Это число: $incomingData.")
            is List<*> -> println("Это список, количество элементов: ${incomingData.size}.")
            is Map<*, *> -> println("Это словарь, количество пар: ${incomingData.size}.")
            else -> println("Неизвестный тип данных.")
        }
    }

    analyzeDataType("Hey")
    analyzeDataType(8.05)
    analyzeDataType(listOf("t", "y", "o"))
    analyzeDataType(mapOf(1 to 1.01, 2 to 2.02, 3 to 3.03, 4 to 4.04))
    analyzeDataType(arrayOf(10f, 93f, 85f))


//
//Задача 2
//
//Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую
//размер списка, если аргумент можно безопасно привести к типу List. В случае
//неудачного приведения функция должна возвращать -1. Используйте as? для
//безопасного приведения типа.

    fun safeCastToList(arg: Any): Int {
        return (arg as? List<*>)?.size ?: -1
    }

    println(safeCastToList("7"))
    println(safeCastToList(mutableListOf(1, 7, 15)))
//
//Задача 3
//
//Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и
//возвращает длину строки, если аргумент можно привести к типу String. В случае,
//если аргумент равен null или не является строкой, функция должна возвращать 0.

    fun getStringLengthOrZero(arg: Any?): Int {
        return (arg as? String)?.length ?: 0
    }

    println(getStringLengthOrZero(null))
    println(getStringLengthOrZero(8))
    println(getStringLengthOrZero("Kotlin"))
//
//Задача 4
//
//Создайте функцию-расширение класса Any toSquare. Функция гарантированно
//вызывается у числа (в виде числа или строки, например 4 или 4.2 или “4.2”) и
//должна вернуть квадрат этого числа. Если придёт число, его нужно возвести
//в квадрат, если придёт строка, то его нужно преобразовать в число через функцию
//toDouble() и возвести в квадрат.

    fun Any.toSquare(): Double? {
        return when (this) {
            is Number -> toDouble() * toDouble()
            is String -> toDoubleOrNull()?.times(toDoubleOrNull() ?: 0.0)
            else -> null
        }
    }

//    fun Any.toSquare1(): Double {
//        val number = (this as? Number)?.toDouble()
//            ?: (this as String).toDouble()
//        return number * number
//    }

    println("78".toSquare())
    println(78.toSquare())
    println("Mad Max".toSquare())
    println(listOf(9, 10, 11).toSquare())

//
//Задача 5
//
//Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа
//Any и возвращает сумму всех целочисленных (Int) и вещественных (Double) значений
//в списке. Все остальные типы должны быть проигнорированы.

    fun sumIntOrDoubleValues(arg: List<Any>): Double {
        val result = arg.sumOf {
            when (it) {
                is Int -> it.toDouble()
                is Double -> it
                else -> 0.0
            }
        }
        return result
    }

    println(sumIntOrDoubleValues(listOf(5, 70.87, "Kotlin", mapOf(1 to "map"))))
//

//Задача 6
//
//Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и
//пытается привести его к типу List<*>. Если приведение успешно, функция должна
//напечатать все строки из списка, если элемент не является строкой, то вывести
//предупреждение об этом. Если приведение неудачно, должно быть выведено
//сообщение об ошибке, не прерывая выполнение программы.

    fun tryCastToListAndPrint(arg: Any) {
        (arg as? List<*>)?.forEachIndexed { index, element ->
            if (element is String) {
                println(element)
            } else {
                println("Element $index is not a string.")
            }
        } ?: println("The argument is not a list.")
    }

    tryCastToListAndPrint(9)
    tryCastToListAndPrint(mutableListOf("9", "8"))
    tryCastToListAndPrint(mutableListOf(0, "1", 8))
    tryCastToListAndPrint("Fame")
}